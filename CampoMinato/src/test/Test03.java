package test;

import java.util.Scanner;
import java.util.StringTokenizer;

import modello.Campo;
import modello.MineException;

public class Test03 {
	
	public static void main(String[] args) {
		Campo campo = Campo.getIstanzaCampo();
		
		campo.setup(10, 10, 6);
		
		for (int i = 0; i < campo.getRighe(); i++) {
			for (int j = 0; j < campo.getColonne(); j++) {
				System.out.print(campo.getCasellaIJ(i, j).getContenuto()+ " ");
			}
			System.out.println("");
		}
		System.out.println("");System.out.println("");
		
		
		
		while(campo.isFinita() != true){
			
			for (int i = 0; i < campo.getRighe(); i++) {
				for (int j = 0; j < campo.getColonne(); j++) {
					System.out.print(campo.getCasellaIJ(i, j).getStato()+ " ");
				}
				System.out.println("");
			}
			System.out.println("");
			
			System.out.print("Azione:");
			Scanner input = new Scanner(System.in);
			String in = input.next();
			StringTokenizer tok = new StringTokenizer(in,",");
			int I = Integer.parseInt(tok.nextToken());
			int J = Integer.parseInt(tok.nextToken());
			String A = String.valueOf(tok.nextToken());;
			
			
			try {
				campo.setCasellaIJ(I, J, A.charAt(0));
			} catch (MineException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
		}
		
		
	}

}
