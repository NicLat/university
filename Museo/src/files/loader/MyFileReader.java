package files.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * Legge un file riga per riga, implementare un apposito ILineReader per la formattazione
 * @author nicola
 */
public class MyFileReader {
	
	private String filename;
	private ILineReader implementation;
	
	public MyFileReader(String filename, ILineReader implementation) {
		super();
		this.filename = filename;
		this.implementation = implementation;
	}

	/**
	 * Legge il file
	 */
	public void loadFile() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
			
			String line = reader.readLine();
			while (line!=null) {
				implementation.readLine(line);
				line = reader.readLine();
			}
			
			reader.close();
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	


}
