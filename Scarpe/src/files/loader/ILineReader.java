package files.loader;

	/**
	 * Carica una linea del file aggiornando le informazioni su carico e scarico del gestore magazzini 
	 * @author nicola
	 */
public interface ILineReader {

	/**
	 * Legge una riga e la elabora
	 * @param line riga del file
	 */
	public abstract void readLine(String line);

}