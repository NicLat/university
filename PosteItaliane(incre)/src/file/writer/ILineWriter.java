package file.writer;


	/**
	 * Scrive una riga su file con le informazioni riguardo al Veicolo, al modello e alla quantità di scarpe
	 * @author nicola
	 */
public interface ILineWriter {

	public abstract String writeLine(String str);

}