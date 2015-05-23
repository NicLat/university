package modello;

import java.util.ArrayList;

/**
 * Interfaccia con il metodo di confronto tra la soluzione proposta e quelle accettabili
 * @author nicola
 */
public interface IConfronta {
	
	/**
	 * @param frase Frase in italiano da cercare nelle possibili soluzioni
	 * @param soluzioni Collezione di possibili soluzioni
	 * @return Booleano che dice se la frase è accettata o meno (true o false)
	 */
	public boolean trovaTraduzioneAccettabile(String frase, ArrayList<String> soluzioni);

}
