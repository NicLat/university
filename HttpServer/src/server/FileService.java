package server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

import server.HttpMessage.ContentType;

public class FileService implements IService {

	@Override
	public void sendHTTP(final Socket clientSocket, HttpRequest	request)
			throws IOException {

		String filename = checkURI(request.getUri());
		
		HttpMessage message = new HttpMessage();
		
		if(filename.endsWith("xml")){
			message.setContentType(ContentType.XML);
		}
		
		message.openHttpAnswer(clientSocket);
		copyFile(filename, message.getOut());
		message.closeHttpAnswer();
	}
	
	private String checkURI(String uri) {
		// estraggo il path dalla richiesta
		String filename = "web" + uri;

		// come pagina principale metto "index01"
		if (filename.equals("web/"))
			filename = filename + "index01.html";

		// controllo che il file richiesto esista
		File file = new File(filename);
		if (!file.exists()) {
			filename = "web/error.html";
		}

		System.err.println(filename);
		return filename;
	}
	
	private BufferedReader copyFile(String filename, OutputStreamWriter out)
			throws FileNotFoundException, IOException {

		BufferedReader filerReader = new BufferedReader(
				new FileReader(filename));
		
		String fileLine = filerReader.readLine();
		while (fileLine != null) {
			out.write(fileLine + "\n");
			fileLine = filerReader.readLine();
		}
		return filerReader;
	}
}
