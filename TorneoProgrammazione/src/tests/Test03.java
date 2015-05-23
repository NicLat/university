package tests;

import modello.Facolta;
import modello.Segreteria;
import modello.Team;

public class Test03 {
	
	public static void main(String[] args) {
		
		Segreteria segreteria = new Segreteria();
		
		segreteria.caricaTeams("teams.txt");
		segreteria.caricaFacolta("facolta.txt");
		segreteria.leggiIncontri("incontri.txt");
		
		
		for (Facolta f : segreteria.getFacolta()) {
			System.out.print(f.getNome() + " ");
			for (Team t : f.getTeams() ) {
				System.out.print(t.getNome()+", ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		
		segreteria.ordinaFacolta();
		
		for (Facolta f : segreteria.getFacolta()) {
			System.out.print(f.getNome() + " " + f.getPunteggio() + ": ");
			for (Team t : f.getTeams() ) {
				System.out.print(t.getNome()+", ");
			}
			System.out.println();
		}
		
		
	}
	

}
