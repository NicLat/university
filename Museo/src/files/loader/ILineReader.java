package files.loader;

import modello.CatalogoDigitale;
import modello.Pezzo;

	/**
	 * carica una linea del file e crea un {@link Pezzo} che poi inserisce nel {@link CatalogoDigitale}
	 * raccoglie tutte le eccezioni riguardanti la creazione del pezzo e le duplicazioni essendo la classe meno 
	 * riutilizzabile
	 * @author NL
	 */
public interface ILineReader {

	/**
	 * Per ogni riga letta la spezzetta e crea il pezzo e lo inserisce
	 * @param line
	 */
	public abstract void readLine(String line);

}