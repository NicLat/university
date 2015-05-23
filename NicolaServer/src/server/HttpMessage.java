package server;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Gestisce la risposta HTTP.
 * 
 * Le chiamate a 'openHttpAnswer' devono sempre essere seguite a chiamate a
 * 'closeHttpAnswer'
 * 
 * @author nicola
 */
public class HttpMessage {

	public enum ContentType {
		HTML("text/html"), XML("text/xml"), CSS("text/css"), JPG("image/jpeg"), PNG(
				"image/png");
		private String text;

		private ContentType(String text) {
			this.text = text;
		}
	}

	private ContentType contentType = ContentType.HTML;
	private String responseCode = "200 OK";

	private OutputStream outputStream;
	private OutputStreamWriter outputStreamWriter;
	private String boundary;
	public static final String EOL = "\r\n";
	
	public void openHttpAnswer(Socket clientSocket) throws IOException {

		this.outputStream = clientSocket.getOutputStream();
		this.outputStreamWriter = new OutputStreamWriter(
				clientSocket.getOutputStream(), Charset.forName("UTF-8")
						.newEncoder());

		boundary = "===" + System.currentTimeMillis() + "===";
		
		Date date = new Date(System.currentTimeMillis());
		DateFormat df = new SimpleDateFormat("E, d M y H:m:s");
		
		outputStreamWriter.write("HTTP/1.1 "+ responseCode +EOL);
		outputStreamWriter.write("Date: "+ df.format(date) +EOL);
		
		outputStreamWriter.write("Keep-Alive: timeout=5, max=10" +EOL);
		outputStreamWriter.write("Cache-Control: no-cache" +EOL);
		outputStreamWriter.write("Connection: Keep-Alive" +EOL);
		
		outputStreamWriter.write("Content-Type: " + contentType.text
				+ " charset=utf-8; boundary=" + boundary +EOL);
		
		outputStreamWriter.write(EOL);
	}

	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}
	public void setResponseCode(String string) throws IOException {
		responseCode = string;
	}
	
	public void closeHttpAnswer() throws IOException {
		outputStreamWriter.write("\n");
		outputStreamWriter.close();
	}

	/**
	 * Può essere chiamata solamente quando la HttpAnswer è opened
	 * 
	 * @return
	 */
	public OutputStreamWriter getOut() {
		return outputStreamWriter;
	}

	public OutputStream getOutputStream() {
		return outputStream;
	}


}
