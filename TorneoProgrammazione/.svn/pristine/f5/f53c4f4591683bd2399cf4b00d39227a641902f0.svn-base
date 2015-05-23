package modello;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Facolta partecipante al torneo, con un {@link HashMap} di team
 * @author cl411531
 *
 */
public class Facolta implements Comparable<Facolta> {
	
	private String nome;
	private ArrayList<Team> teams;
	
	public Facolta(String nome, ArrayList<Team> teams) {
		super();
		this.nome = nome;
		this.teams = teams;
	}

	public String getNome() {
		return nome;
	}
	public ArrayList<Team> getTeams() {
		return teams;
	}
	
	public int getPunteggio(){
		int somma = 0;
		for (Team t : teams) {
			somma += t.getPunteggio();
		}
		return somma/teams.size();
	}
	
	@Override
	public int compareTo(Facolta f) {
		if(this.getPunteggio() > f.getPunteggio())
			return -1;
		else if(this.getPunteggio() < f.getPunteggio())
			return 1;
		return 0;
	}
	
	
	

}
