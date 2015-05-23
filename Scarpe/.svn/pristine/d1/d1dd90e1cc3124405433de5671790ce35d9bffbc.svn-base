package files.writer;

import gestore.StockScarpe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Scrive su file riga per riga formattandole secondo un'implementazione di ILineWriter
 * @author nicola
 */
public class MyFileWriter {

	private String filename;
	private ILineWriter format;

	/**
	 * 
	 * @param filename Nome del file
	 * @param format Implementazione custom di ILineWriter
	 */
	public MyFileWriter(String filename, ILineWriter format) {
		super();
		this.filename = filename;
		this.format = format;
	}

	/**
	 * Scrive una riga
	 * @param str Stringa di informazioni
	 * @throws IOException Eccezione sul file
	 */
	public void write(String furgone, String modello, StockScarpe stock) throws IOException {
		
		FileWriter writer = new FileWriter(new File(filename), true);
		writer.write(format.writeLine(furgone,modello,stock)+"\n");
		writer.close();
	}
}