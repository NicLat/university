package modello;

import java.util.Random;

public class Utility {
	
	public static boolean vinto(Campo campo) {
		for (int i = 0; i < campo.getRighe(); i++) {
			for (int j = 0; j < campo.getColonne(); j++) {
				
				if(campo.getCasellaIJ(i, j).getStato() == Casella.STATO_OSCURA)
					return false;
				
				if( ( campo.getCasellaIJ(i, j).getStato() == Casella.STATO_BANDIERINA ) &&
						campo.getCasellaIJ(i, j).getContenuto() != Casella.CONTENUTO_BOMBA)
					return false;
			}
		}
		return true;
	}

	public static void inizializzaCampo(Casella[][] caselle) {
		for (int i = 0; i < caselle.length; i++) {
			for (int j = 0; j < caselle[i].length; j++) {
				caselle[i][j] = new Casella(Casella.CONTENUTO_LIBERA, Casella.STATO_OSCURA);
			}
		}
	}	
	
	public static void piazzaMine(Campo campo, int mine) {
		Random rand = new Random();
		while(mine>0){
			int r = rand.nextInt(campo.getRighe());
			int c = rand.nextInt(campo.getColonne());
			if(campo.getCasellaIJ(r, c).getContenuto() == Casella.CONTENUTO_LIBERA){
				campo.getCasellaIJ(r, c).setContenuto(Casella.CONTENUTO_BOMBA);
				mine--;
			}
		}
	}
		
	public static void contaVicinanze(Campo campo) {
		for (int i = 0; i < campo.getRighe(); i++) {
			for (int j = 0; j < campo.getColonne(); j++) {
				
				if(campo.getCasellaIJ(i, j).getContenuto() != Casella.CONTENUTO_BOMBA){
					int vicinanze = 0;
					
					if(campo.getCasellaIJ(i-1, j-1) != null) 
						if(campo.getCasellaIJ(i-1, j-1).getContenuto()==Casella.CONTENUTO_BOMBA) vicinanze ++;
					if(campo.getCasellaIJ(i-1, j) != null) 
						if(campo.getCasellaIJ(i-1, j).getContenuto()==Casella.CONTENUTO_BOMBA) vicinanze ++;					
					if(campo.getCasellaIJ(i-1, j+1) != null) 
						if(campo.getCasellaIJ(i-1, j+1).getContenuto()==Casella.CONTENUTO_BOMBA) vicinanze ++;
					
					if(campo.getCasellaIJ(i, j-1) != null) 
						if(campo.getCasellaIJ(i, j-1).getContenuto()==Casella.CONTENUTO_BOMBA) vicinanze ++;
					if(campo.getCasellaIJ(i, j+1) != null) 
						if(campo.getCasellaIJ(i, j+1).getContenuto()==Casella.CONTENUTO_BOMBA) vicinanze ++;
					
					if(campo.getCasellaIJ(i+1, j-1) != null) 
						if(campo.getCasellaIJ(i+1, j-1).getContenuto()==Casella.CONTENUTO_BOMBA) vicinanze ++;
					if(campo.getCasellaIJ(i+1, j) != null) 
						if(campo.getCasellaIJ(i+1, j).getContenuto()==Casella.CONTENUTO_BOMBA) vicinanze ++;					
					if(campo.getCasellaIJ(i+1, j+1) != null) 
						if(campo.getCasellaIJ(i+1, j+1).getContenuto()==Casella.CONTENUTO_BOMBA) vicinanze ++;
					
					/*try {
						if(campo[i-1][j-1].getContenuto()=='M') vicinanze ++;
					} catch (IndexOutOfBoundsException e) {}
					try {
						if(campo[i-1][j].getContenuto()=='M') vicinanze ++;
					} catch (IndexOutOfBoundsException e) {}
					try {
						if(campo[i-1][j+1].getContenuto()=='M') vicinanze ++;
					} catch (IndexOutOfBoundsException e) {}
					try {
						if(campo[i][j-1].getContenuto()=='M') vicinanze ++;
					} catch (IndexOutOfBoundsException e) {}
					try {
						if(campo[i][j+1].getContenuto()=='M') vicinanze ++;
					} catch (IndexOutOfBoundsException e) {}
					try {
						if(campo[i+1][j-1].getContenuto()=='M') vicinanze ++;
					} catch (IndexOutOfBoundsException e) {}
					try {
						if(campo[i+1][j].getContenuto()=='M') vicinanze ++;
					} catch (IndexOutOfBoundsException e) {}
					try {
						if(campo[i+1][j+1].getContenuto()=='M') vicinanze ++;
					} catch (IndexOutOfBoundsException e) {}
					*/
					if(vicinanze != 0){
						campo.getCasellaIJ(i, j).setContenuto((char) (vicinanze + 48));
					}
				}
			}
		}
	}
	

}
