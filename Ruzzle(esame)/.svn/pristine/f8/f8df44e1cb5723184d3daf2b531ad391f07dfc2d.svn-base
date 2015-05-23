package modello;

import java.util.ArrayList;

public class Verificatore implements IVerificaParola{
	
	@Override
	public int verificaParola(char[][] matrice, String parola) {
		
		ArrayList<String> righeEColonne = ricavaStringhe(matrice);
		
		for (String string : righeEColonne) {
			if(string.indexOf(parola) != -1){
				
				return punteggioParola(parola);	
			}
		}
		return 0;
	}
	
	
	private ArrayList<String> ricavaStringhe(char[][] matrice) {
		ArrayList<String> righeEColonne = new ArrayList<String>();
		
		righeSxDx(matrice, righeEColonne);
		colonneAltoBasso(matrice, righeEColonne);
		
		//TODO inserimento delle righe DXSX e delle colonne basso alto
		return righeEColonne;
	}
	
	
	//TODO classe che assegna i punteggi
	private int punteggioParola(String str){
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			sum += punteggioLettera(str.charAt(i));
		}
		return sum;
	}
	
	private int punteggioLettera(char c){
		if(c == 'Z' || c == 'H')
			return 2;
		else if(c == 'Q')
			return 3;
		return 1;
	}

	private void colonneAltoBasso(char[][] matrice, ArrayList<String> righeEColonne) {
		
		//System.out.println("colonne:");
		for (int i = 0; i < matrice.length; i++) {
			String temp="";
			for (int j = 0; j < matrice[i].length; j++) {
				temp+= matrice[j][i];
			}
			righeEColonne.add(temp);
			//System.out.println(temp);
		}
	}


	private void righeSxDx(char[][] matrice, ArrayList<String> righeEColonne) {
		
		//System.out.println("righe:");
		for (int i = 0; i < matrice.length; i++) {
			righeEColonne.add(String.valueOf(matrice[i]));
			//System.out.println(String.valueOf(matrice[i]));
		}
	}

}
