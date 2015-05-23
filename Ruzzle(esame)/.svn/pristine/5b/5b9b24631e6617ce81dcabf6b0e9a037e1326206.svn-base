package files.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Scrive su file riga per riga formattandole secondo un'implementazione di ILineWriter
 * @author nicola
 */
public class ScrittoreFile {

	private String filename;
	private IScriviLinea format;

	/**
	 * 
	 * @param filename Nome del file
	 * @param format Implementazione custom di ILineWriter
	 * @throws IOException 
	 */
	public ScrittoreFile(String filename, IScriviLinea format) throws IOException {
		super();
		this.filename = filename;
		this.format = format;
		
		// cancella file precedente
		FileWriter writer = new FileWriter(new File(filename));
		writer.close();
	}

	/**
	 * Scrive una riga
	 * @param str Stringa di informazioni
	 * @throws IOException Eccezione sul file
	 */
	public void write(String parola, int punteggio) throws IOException {
		
		FileWriter writer = new FileWriter(new File(filename), true);
		writer.write( format.writeLine(parola,punteggio) + "\n" );
		writer.close();
	}
}