package dispositivi;

import java.util.LinkedList;
import java.util.StringTokenizer;

public class Utils {
	
	/**
	 * Separa una richiesta in sottoparti: dispositivo, comando, ed eventuale ritardo
	 * @param richiesta Stringa della richiesta
	 * @return Lista linkata delle parti
	 */
	public static LinkedList<String> separaRichiesta(final String richiesta){
		LinkedList<String> parti = new LinkedList<String>();
		StringTokenizer tokenizer = new StringTokenizer(richiesta);
		
		parti.add(tokenizer.nextToken());
		parti.add(tokenizer.nextToken());
		if (tokenizer.hasMoreTokens())
			parti.add(tokenizer.nextToken());
		
		return parti;
	}
	
	/**
	 * Traduce un ritardo da stringa a long in millisecondi
	 * @param ritardo Stringa formattata in "hh:mm"
	 * @return 
	 * @return Long tempo in millisecondi
	 */
	public static long traduciRitardo (String ritardo){
		long minuti;
		
		StringTokenizer tokenizer = new StringTokenizer(ritardo,":");
		minuti = Long.parseLong(tokenizer.nextToken()) * 24;
		minuti += Long.parseLong(tokenizer.nextToken());
		
		return minuti * 60 * 1000;
	}
	

}
