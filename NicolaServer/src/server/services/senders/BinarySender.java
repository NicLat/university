package server.services.senders;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

import server.services.ISendFile;

public class BinarySender implements ISendFile {

	private OutputStream output;

	public BinarySender(OutputStream output) {
		super();
		this.output = output;
	}

	@Override
	public void sendFile(String filename) throws FileNotFoundException,
			IOException {

		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(output,
				Charset.forName("UTF-8").newEncoder());
		outputStreamWriter.write("Content-Length: "
				+ (new File(filename)).length());

		BufferedOutputStream out = new BufferedOutputStream(output);
		BufferedInputStream reader = new BufferedInputStream(
				new FileInputStream(filename));

		byte[] buffer = new byte[4096];
		int bytesRead;
		while ((bytesRead = reader.read(buffer)) != -1) {
			out.write(buffer, 0, bytesRead);
		}
		reader.close();
		out.flush();
	}

}
