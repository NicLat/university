package tests;

import java.util.Scanner;

import modello.Generatore;
import modello.Partita;
import modello.ResocontoSuFile;
import modello.Verificatore;

public class Test04 {
	
	public static void main(String[] args) {
		
		Partita partita = new Partita(9,45,new Generatore(),new Verificatore(), new ResocontoSuFile("resoconto.txt"));
		
		partita.start(20);
		
		char[][] campo = partita.getMatrice();
		
		for (int i = 0; i < campo.length; i++) {
			for (int j = 0; j < campo[i].length; j++) {
				System.out.print(campo[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		
		Scanner scanner = new Scanner(System.in);
		String in = scanner.next();
		while(in.equals("basta") == false){
			
			System.out.println("punti: "+ partita.puntiParola(in));
			
			in = scanner.next();
		}
		
		
	}
	

}
