package modello;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Interfaccia che disaccoppia dal modello il metodo di caricamento delle frasi, può essere 
 * implementata caricando le frasi da file, da database, o qualsiasi altro metodo
 * @author nicola
 */
public interface ICaricaFrasi {
	
	/**
	 * Funzione di caricamento frasi nella collezione
	 * @param sorgente Sorgente delle frasi: nome del file, link dal web, riferimento db...
	 * @return collezione di frasi con le possibili traduzioni
	 */
	HashMap<String, ArrayList<String>> caricaCollezioneFrasi(String sorgente);

}
