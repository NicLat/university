package modello;

import java.util.Random;

public class Generatore implements IGeneraCampo{
		
	@Override
	public char[][] generaCampo(int lato, int vocaliMinime) {
		
		char[][] matrice = new char[lato][lato];
		
		caratteriCasuali(matrice, lato);
		sistemaVocali(lato, vocaliMinime, matrice);

		return matrice;
	}


	private void sistemaVocali(int lato, int vocaliMinime, char[][] matrice) {
		int vocali = vocaliMinime;
		Random randomizzatore = new Random();
		
		while(vocali > 0){
			int i = randomizzatore.nextInt(lato);
			int j = randomizzatore.nextInt(lato);
			
			if( isVocale(matrice[i][j]) == false ){
				matrice[i][j] = generaVocale();
				vocali--;
			}else{
				vocali--;
			}			
		}
	}

	
	private char generaVocale(){
		Random randomizzatore = new Random();
		int r = randomizzatore.nextInt(5);
		switch (r) {
			case 0: return 'A';
			case 1: return 'E';
			case 2: return 'I';
			case 3: return 'O';
			case 4: return 'U';
		}
		return 'A';
	}
	
	private boolean isVocale(char c){
		if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			return true;
		return false;		
	}
	

	private void caratteriCasuali(char[][] matrice, int lato) {
		Random randomizzatore = new Random();
		for (int i = 0; i < lato; i++) {
			for (int j = 0; j < lato; j++) {
				matrice[i][j] = (char) (65 + randomizzatore.nextInt(25));
			}
		}
	}
	
	
}
