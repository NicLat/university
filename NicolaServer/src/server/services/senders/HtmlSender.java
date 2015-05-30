package server.services.senders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import server.services.ISendFile;

public class HtmlSender implements ISendFile{
	
	private OutputStreamWriter out;
	private String headerName;
	private String footerName;
	
	public HtmlSender(OutputStreamWriter out, String headerName,
			String footerName) {
		super();
		this.out = out;
		this.headerName = headerName;
		this.footerName = footerName;
	}

	@Override
	public void sendFile(String filename) throws IOException {
		sendText(headerName);
		sendText(filename);
		sendText(footerName);
	}
	
	private void sendText(String filename) throws IOException{
		
		BufferedReader filerReader = new BufferedReader(
				new FileReader(filename));
		
		String fileLine = filerReader.readLine();
		while (fileLine != null) {
			out.write(fileLine + "\n");
			fileLine = filerReader.readLine();
		}
		
		filerReader.close();
	}

}
