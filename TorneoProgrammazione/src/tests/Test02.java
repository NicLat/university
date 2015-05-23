package tests;

import modello.Segreteria;
import modello.Team;

public class Test02 {
	
	public static void main(String[] args) {
		
		Segreteria segreteria = new Segreteria();
		
		segreteria.caricaTeams("teams.txt");
		segreteria.caricaFacolta("facolta.txt");
		segreteria.leggiIncontri("incontri.txt");
		
		for (Team t : segreteria.getTeams()) {
			System.out.println(t.getNome() + " " + t.getPunteggio() + " ");
			for (String string : t.getPartecipanti()) {
				System.out.println(string);
			}
			System.out.println();
		}
		

		System.out.println();
		System.out.println();
		
		segreteria.ordinaTeams();
		
		for (Team t : segreteria.getTeams()) {
			System.out.println(t.getNome() + " " + t.getPunteggio() + " ");
			for (String string : t.getPartecipanti()) {
				System.out.println(string);
			}
			System.out.println();
		}
		
		
	}
	

}
