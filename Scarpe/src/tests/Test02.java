package tests;

import java.util.Date;

import gestore.GestoreMagazzini;

public class Test02 {
	
	public static void main(String[] args) {
		
		final long giornoInMillisecondi = (24*60*60*1000);
		
		GestoreMagazzini gestore = new GestoreMagazzini();
		gestore.aggiungiVettura("ANGELO-ROSSI-4723");
		gestore.aggiungiVettura("CARLO-VERDI-4823");
		
		gestore.leggiReportNegozio("magazzino_centrale_3giornifa.txt", new Date(System.currentTimeMillis()-3*giornoInMillisecondi));
		gestore.leggiReportNegozio("milano_ieri.txt", new Date(System.currentTimeMillis()-1*giornoInMillisecondi));
		gestore.leggiReportNegozio("verona_oggi.txt", new Date(System.currentTimeMillis()-1*giornoInMillisecondi));
		
		gestore.stampaReportVetture("report2.txt");
		gestore.stampaStockVecchi("vett_vecchie.txt", 3);
		
		
		
	}

}
