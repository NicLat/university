package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;

import server.HttpMessage.ContentType;

public class FileService implements IService {
	
	public String homepage = "index.html";

	public FileService(String homepage) {
		super();
		this.homepage = homepage;
	}

	@Override
	public void sendHTTP(final Socket clientSocket, HttpRequest	request)
			throws IOException {

		HttpMessage message = new HttpMessage();
		
		String filename = checkURI(request.getUri(), message);
		
		detectFileType(message, filename);
		
		message.openHttpAnswer(clientSocket);
		
		if(filename.endsWith("jpg") || filename.endsWith("png")){
			copyImage(filename, message.getOutputStream());
		}else{
			copyFile(filename, message.getOut());
		}
		message.closeHttpAnswer();
		System.out.println("File given: "+filename);
	}

	private void detectFileType(HttpMessage message, String filename) {
		if(filename.endsWith("xml")){
			message.setContentType(ContentType.XML);
		}else if(filename.endsWith("css")){
			message.setContentType(ContentType.CSS);
		}else if(filename.endsWith("jpg")){
			message.setContentType(ContentType.JPG);
		}else if(filename.endsWith("png")){
			message.setContentType(ContentType.PNG);
		}
	}
	
	private String checkURI(String uri, HttpMessage message) throws IOException {
		
		String filename = "web" + uri;
		if (filename.equals("web/"))
			filename = filename + homepage;

		File file = new File(filename);
		if (!file.exists() || filename.equals("web")) {
			filename = "web/404.html";
			message.setResponseCode("404 Not Found");
		}else{
			message.setResponseCode("200 OK");
		}

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
	
	private void copyImage(String filename, OutputStream output)
			throws FileNotFoundException, IOException {
		
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
				output, Charset.forName("UTF-8")
						.newEncoder());
		outputStreamWriter.write("Content-Length: " + (new File(filename)).length());

		BufferedOutputStream out = new BufferedOutputStream( output );
		// f is the file to be sent to the client.
		BufferedInputStream reader = new BufferedInputStream( new FileInputStream( filename ) );

		
		byte[] buffer = new byte[ 4096 ];
		int bytesRead;
		while ( (bytesRead = reader.read(buffer)) != -1 ) {
			out.write( buffer, 0, bytesRead );
		}
		reader.close();
		out.flush();

	}
}
