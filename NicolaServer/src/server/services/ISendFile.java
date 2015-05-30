package server.services;

import java.io.IOException;

/**
 * Interface in order to abstract from the way to send a file
 * @author Nicola
 */
public interface ISendFile {
	
	/**
	 * Sends the file in the right way
	 * @param filename name of the file
	 * @throws IOException
	 */
	public void sendFile(String filename) throws IOException  ;

}
