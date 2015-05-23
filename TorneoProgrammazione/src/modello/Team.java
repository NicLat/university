package modello;

import java.util.ArrayList;

/**
 * Team partecipante al torneo, con partecipanti e punteggio
 * @author cl411531
 *
 */
public class Team implements Comparable<Team> {
	
	private String nome;
	private ArrayList<String> partecipanti;
	private int punteggio = 0;

	/**
	 * Crea un nuovo team controllando il numero partecipanti
	 * @param partecipanti {@link ArrayList} di partecipanti
	 * @throws Exception eccezione numero partecipanti errato
	 */
	public Team(ArrayList<String> partecipanti, String nome) throws Exception {
		super();
		
		if(partecipanti.size() < 4 || partecipanti.size() > 6)
			throw new Exception("Numero partecipanti non compatibile");
		
		this.nome = nome;
		this.partecipanti = partecipanti;
		this.punteggio = 0;
	}
	
	/**
	 * Aggiorna il punteggio del team
	 * @param p punti da aggiungere
	 */
	public void aggiungiPunti(int p){
		punteggio += p;		
	}

	@Override
	public int compareTo(Team t) {
		if(this.getPunteggio() > t.getPunteggio())
			return -1;
		else if(this.getPunteggio() < t.getPunteggio())
			return 1;
		return 0;
	}	

	public String getNome() {
		return nome;
	}
	public ArrayList<String> getPartecipanti() {
		return partecipanti;
	}
	public int getPunteggio() {
		return punteggio;
	}


}
