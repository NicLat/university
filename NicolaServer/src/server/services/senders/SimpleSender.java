package server.services.senders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import server.services.ISendFile;

public class SimpleSender implements ISendFile{
	
	private OutputStreamWriter out;
	
	public SimpleSender(OutputStreamWriter out) {
		super();
		this.out = out;
	}

	@Override
	public void sendFile(String filename) throws FileNotFoundException, IOException {

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
