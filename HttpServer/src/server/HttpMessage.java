package server;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * Gestisce la risposta HTTP.
 * 
 * Le chiamate a 'openHttpAnswer' devono sempre essere seguite a chiamate a
 * 'closeHttpAnswer'
 * 
 * @author nicola
 */
public class HttpMessage {
	
	
	public enum ContentType{
		HTML("text/html"),
		XML("text/xml")
		;
		private String text;
		private ContentType(String text){
			this.text = text;
		}
	}
	
	private ContentType contentType = ContentType.HTML;

	private OutputStreamWriter out;

	public void openHttpAnswer(Socket clientSocket) throws IOException {

		// nel costruttore di OutputStremWriter posso impostare il charset che
		// voglio, nella traduzione
		this.out = new OutputStreamWriter(clientSocket.getOutputStream(),
				Charset.forName("UTF-8").newEncoder());

		out.write("HTTP/1.1 200 OK\n");
		out.write("Date: Tue, 17 Mar 2015 14:47:00\n");
		out.write("Content-Type: "+ contentType.text +" charset=utf-8\n");
		out.write("\n");
	}
	
	public void setContentType(ContentType contentType){
		this.contentType = contentType;
	}

	public void closeHttpAnswer() throws IOException {
		out.write("\n");
		out.close();
	}
	
	/**
	 * Può essere chiamata solamente quando la HttpAnswer è opened
	 * @return
	 */
	public OutputStreamWriter getOut() {
		return out;
	}

}
