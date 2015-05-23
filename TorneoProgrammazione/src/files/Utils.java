package files;

import java.util.ArrayList;
import java.util.StringTokenizer;

import modello.Team;

public class Utils {
	
	
	/**
	 * Estrae da una stringa un vettore di stringhe parti di essa
	 * @param p stringa sorgente
	 * @param delim delimitatore
	 * @return {@link ArrayList} di stringhe
	 */
	public static final ArrayList<String> estraiVettoreDaElenco(String p, String delim) {
		
		ArrayList<String> vett = new ArrayList<String>();
		StringTokenizer tokenizer = new StringTokenizer(p,delim);
		
		while(tokenizer.hasMoreTokens()){
			vett.add(tokenizer.nextToken());
		}
		
		return vett;
	}
	
	
	/**
	 * Cerca un team per nome nei vettore dei team e lo ritorna
	 * @param nome nome del team
	 * @return team trovato
	 */
	public static final Team trovaTeam(ArrayList<Team> teams,String nome){
		for (Team t : teams) {
			if(t.getNome().equals(nome))
				return t;
		}
		return null;
	}

}
