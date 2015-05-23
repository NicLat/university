package tests;

import java.util.Scanner;

import modello.CaricatoreB;
import modello.Confrontatore;
import modello.Esercitatore;

public class Test02 {
	
	public static void main(String[] args) {
		
		Esercitatore esercitatore = new Esercitatore(new CaricatoreB(), new Confrontatore());
		
		esercitatore.aggiungiFrasi("frasi1.txt");
		
		esercitatore.iniziaEsercizio();
		
		String inglese;
		Scanner input = new Scanner(System.in);
		
		inglese = esercitatore.getNuovaFrase();
		if (inglese != null) {
			System.out.println("Traduci: " + inglese);
			esercitatore.valutaFrase(inglese, input.nextLine());
		}
		
		inglese = esercitatore.getNuovaFrase();
		if (inglese != null) {
			System.out.println("Traduci: " + inglese);
			esercitatore.valutaFrase(inglese, input.nextLine());
		}
		
		inglese = esercitatore.getNuovaFrase();
		if (inglese != null) {
			System.out.println("Traduci: " + inglese);
			esercitatore.valutaFrase(inglese, input.nextLine());
		}
		
		
		System.out.println(esercitatore.getRisultati());
	}

}
