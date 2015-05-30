package server.services;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ISendFile {
	
	public void sendFile(String filename) throws FileNotFoundException, IOException  ;

}
