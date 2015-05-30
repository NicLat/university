package server;

import java.io.FileNotFoundException;
import java.io.IOException;

import server.services.ISendFile;

/**
 * Class to send a file to a client, a kind of sender must be set before any
 * sendFile
 * @author Nicola
 */
public class Sender {

	private ISendFile kind;

	/**
	 * It has to be set before any sendFile
	 * 
	 * @param kind
	 */
	public void setKind(ISendFile kind) {
		this.kind = kind;
	}

	/**
	 * Sends a file using the setted sender
	 * 
	 * @param filename
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void sendFile(String filename) throws FileNotFoundException,
			IOException {
		kind.sendFile(filename);
	}
}
