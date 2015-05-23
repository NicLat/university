package server;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Gestisce la risposta HTTP.
 * Le chiamate a 'openHttpAnswer' devono sempre essere seguite a chiamate a
 * 'closeHttpAnswer'
 * 
 * @author Nicola
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

		outputStreamWriter.write("HTTP/1.1 "+ responseCode + EOL);
		outputStreamWriter.write("Date: "+ getServerTime() + EOL);
		
		outputStreamWriter.write("Keep-Alive: timeout=5, max=10" + EOL);
		outputStreamWriter.write("Cache-Control: no-cache" + EOL);
		outputStreamWriter.write("Connection: Keep-Alive" + EOL);
		outputStreamWriter.write("Content-Type: " + contentType.text + EOL);
		outputStreamWriter.write("Charset = utf-8;" + EOL);
		outputStreamWriter.write("Boundary =" + boundary + EOL);
		
		outputStreamWriter.write(EOL);
	}

	/**
	 * Sets the content type
	 * @param contentType
	 */
	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}
	
	/**
	 * Sets the response code
	 * @param string
	 * @throws IOException
	 */
	public void setResponseCode(String string) throws IOException {
		responseCode = string;
	}
	
	/**
	 * Closes the http answer
	 * @throws IOException
	 */
	public void closeHttpAnswer() throws IOException {
		outputStreamWriter.write("\n");
		outputStreamWriter.close();
	}

	/**
	 * Può essere chiamata solamente quando la HttpAnswer è opened
	 * @return
	 */
	public OutputStreamWriter getOut() {
		return outputStreamWriter;
	}
	
	/**
	 * Può essere chiamata solamente quando la HttpAnswer è opened
	 * @return
	 */
	public OutputStream getOutputStream() {
		return outputStream;
	}

	private String getServerTime() {
	    Calendar calendar = Calendar.getInstance();
	    SimpleDateFormat dateFormat = new SimpleDateFormat(
	        "EEE, dd MMM yyyy HH:mm:ss z", Locale.ITALY);
	    dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
	    return dateFormat.format(calendar.getTime());
	}

}
