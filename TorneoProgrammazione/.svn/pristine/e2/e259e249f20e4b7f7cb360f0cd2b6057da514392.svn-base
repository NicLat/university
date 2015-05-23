package tests;

import modello.Facolta;
import modello.Segreteria;
import modello.Team;

public class Test01 {
	
	public static void main(String[] args) {
		
		Segreteria segreteria = new Segreteria();
		segreteria.caricaTeams("teams.txt");
		
		for (Team t : segreteria.getTeams()) {
			System.out.println(t.getNome() + " " + t.getPunteggio() + " ");
			for (String string : t.getPartecipanti()) {
				System.out.println(string);
			}
			System.out.println();
		}
		
		
		segreteria.caricaFacolta("facolta.txt");
		
		for (Facolta f : segreteria.getFacolta()) {
			System.out.print(f.getNome() + " ");
			for (Team t : f.getTeams() ) {
				System.out.print(t.getNome()+", ");
			}
			System.out.println();
		}
		
	}

}
