package modello;

import java.util.ArrayList;
import java.util.Collections;

import files.LettoreFacolta;
import files.LettoreIncontro;
import files.LettoreTeam;
import files.MyFileReader;

public class Segreteria {
	
	private ArrayList<Team> teams = new ArrayList<Team>();
	private ArrayList<Facolta> facolta = new ArrayList<Facolta>();
	
	
	public void caricaTeams(String nomefile){	
		MyFileReader reader = new MyFileReader(nomefile, new LettoreTeam(teams));
		reader.loadFile();
	}
	
	public void caricaFacolta(String nomefile){	
		MyFileReader reader = new MyFileReader(nomefile, new LettoreFacolta(facolta, teams));
		reader.loadFile();
	}

	public void leggiIncontri(String nomefile){	
		MyFileReader reader = new MyFileReader(nomefile, new LettoreIncontro(teams));
		reader.loadFile();
	}
	
	
	public void ordinaTeams(){
		Collections.sort(teams);
	}
	public void ordinaFacolta(){
		Collections.sort(facolta);
	}
	
	
	public ArrayList<Team> getTeams() {
		return teams;
	}
	public ArrayList<Facolta> getFacolta() {
		return facolta;
	}

	
	public String getClassificaTeams(){
		String cl = "";
		
		ordinaTeams();
		for (Team team : teams) {
			cl += team.getPunteggio() + " " + team.getNome() + " Membri: ";
			for (String nome : team.getPartecipanti()) {
				cl += nome + ", ";
			}
			cl += "\n";
		}
		
		return cl;		
	}
	public String getClassificaFacolta(){
		String cl = "";
		
		ordinaFacolta();
		for (Facolta fac : facolta) {
			cl += fac.getPunteggio() + " " + fac.getNome() + " Teams: ";
			for (Team t : fac.getTeams() ) {
				cl += t.getNome()+", ";
			}
			cl += "\n";
		}
		
		return cl;			
	}

}
