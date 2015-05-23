package tests;

import modello.Generatore;
import modello.IGeneraCampo;
import modello.IVerificaParola;
import modello.Verificatore;

public class Test03 {
	
	public static void main(String[] args) {
		IVerificaParola verificatore = new Verificatore();
		IGeneraCampo generatore = new Generatore();
		char[][] campo = generatore.generaCampo(9,45);
		
		//testo l'estrazione delle righe e colonne
		
		for (int i = 0; i < campo.length; i++) {
			for (int j = 0; j < campo[i].length; j++) {
				System.out.print(campo[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		verificatore.verificaParola(campo, "BO");
		
	}
	

}
