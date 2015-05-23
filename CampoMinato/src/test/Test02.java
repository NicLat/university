package test;

import modello.Campo;
import modello.MineException;

public class Test02 {
	
	public static void main(String[] args) {
		Campo campo = Campo.getIstanzaCampo();
		
		campo.setup(9, 9, 10);
		
		for (int i = 0; i < campo.getRighe(); i++) {
			for (int j = 0; j < campo.getColonne(); j++) {
				System.out.print(campo.getCasellaIJ(i, j).getContenuto()+ " ");
			}
			System.out.println("");
		}
		System.out.println("");System.out.println("");
		
		
		
		for (int i = 0; i < campo.getRighe(); i++) {
			for (int j = 0; j < campo.getColonne(); j++) {
				System.out.print(campo.getCasellaIJ(i, j).getStato()+ " ");
			}
			System.out.println("");
		}
		System.out.println("");
			
		
		try {
			campo.setCasellaIJ(0, 0, 'F');
		} catch (MineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		for (int i = 0; i < campo.getRighe(); i++) {
			for (int j = 0; j < campo.getColonne(); j++) {
				System.out.print(campo.getCasellaIJ(i, j).getStato()+ " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
			
		
		
	}

}
