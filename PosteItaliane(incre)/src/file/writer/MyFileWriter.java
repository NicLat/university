package file.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Scrive su file riga per riga formattandole secondo un'implementazione di ILineWriter
 * @author Alessandro
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
	public void write(String str) throws IOException {   //N.B.: a seconda dei casi possiamo cambiare i parametri da passare(es:decidere se passare una o più stringhe)
		
		FileWriter writer = new FileWriter(new File(filename), true);
		writer.write(format.writeLine(str)+"\n");       
		writer.close();
	}
}