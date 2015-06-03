package server.services;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;

import server.HttpMessage;
import server.HttpRequest;
import server.IService;
import server.services.senders.BinarySender;
import server.services.senders.HtmlSender;
import server.services.senders.Sender;
import server.services.senders.SimpleSender;

/**
 * Servizio per l'inoltro di file generici, testuali e binari
 * 
 * @author Nicola
 */
public class FileService implements IService {

	private String homepage = "index.html";
	private Sender sender;
	
	private HashMap<String, String> knownContents = new HashMap<String, String>();

	public FileService(String homepage, Sender sender) {
		super();
		this.homepage = homepage;
		this.sender = sender;
	}

	@Override
	public void sendHTTP(final Socket clientSocket, HttpRequest request)
			throws IOException {

		HttpMessage message = new HttpMessage();
		String filename = checkURI(request.getUri(), message);

		
		String extension = filename.substring(filename.indexOf('.') + 1, filename.length());
		if(knownContents.containsKey(extension)){
			message.setContentType(knownContents.get(extension));
		}
		message.openHttpAnswer(clientSocket);

		setDataType(message, filename);
		sender.sendFile(filename);

		message.closeHttpAnswer();
		System.out.println("File given: " + filename);
	}

	
	/**
	 * Adds a content type to the collection of known ones.
	 * @param extension	file extension
	 * @param name string of the content type in HTTP format
	 */
	public void addKnownContent(String extension, String name){
		knownContents.put(extension, name);
	}
	
	
	private String checkURI(String uri, HttpMessage message) throws IOException {

		String filename = "web" + uri;
		if (filename.equals("web/"))
			filename = filename + homepage;

		File file = new File(filename);
		if (!file.exists() || filename.equals("web")) {
			filename = "web/404.html";
			message.setResponseCode("404 Not Found");
		} else {
			message.setResponseCode("200 OK");
		}

		return filename;
	}

	private void setDataType(HttpMessage message, String filename) {

		if (filename.endsWith("html")) {
			sender.setKind(new HtmlSender(message.getOutputStreamWriter(),
					"web/header.html", "web/footer.html"));
			
		} else if (filename.endsWith("jpg") || filename.endsWith("png")) {
			sender.setKind(new BinarySender(message.getOutputStream()));
		} else {
			sender.setKind(new SimpleSender(message.getOutputStreamWriter()));
		}
	}

}
