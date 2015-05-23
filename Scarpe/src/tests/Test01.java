package tests;

import java.util.Date;

import gestore.GestoreMagazzini;

public class Test01 {
	
	public static void main(String[] args) {
		
		GestoreMagazzini gestore = new GestoreMagazzini();
		gestore.aggiungiVettura("ANGELO-ROSSI-4723");
		gestore.aggiungiVettura("CARLO-VERDI-4823");
		
		gestore.leggiReportNegozio("magazzino_centrale_oggi.txt", new Date());
		
		gestore.stampaReportVetture("report2.txt");
		
		
		
	}

}
