package test;

import java.util.Scanner;
import java.util.StringTokenizer;

import modello.Campo;
import modello.MineException;

public class Test04 {
	
	public static void main(String[] args) {
		Campo campo = Campo.getIstanzaCampo();
		
		campo.setup(9, 9, 10);
		
		
		while(campo.isFinita() != true){
			
			//mostra sotto terra
			for (int i = 0; i < campo.getRighe(); i++) {
				for (int j = 0; j < campo.getColonne(); j++) {
						System.out.print(campo.getCasellaIJ(i, j).getContenuto()+ " ");
				}
				System.out.println("");
			}
			System.out.println("");

			//mostra la mia vista
			
			for (int j = 0; j < campo.getColonne(); j++)
				System.out.print("__");
			System.out.print("\n|");
			
			for (int i = 0; i < campo.getRighe(); i++) {
				for (int j = 0; j < campo.getColonne(); j++) {
					if(campo.getCasellaIJ(i, j).getStato() == 'F')
						System.out.print(campo.getCasellaIJ(i, j).getContenuto()+ " ");
					else if(campo.getCasellaIJ(i, j).getStato() == 'P')
						System.out.print("P"+ " ");
					else
						System.out.print(" "+ " ");
				}
				System.out.print("|\n|");
			}
			for (int j = 0; j < campo.getColonne(); j++)
				System.out.print("__");
			System.out.println("|");
			
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
		
		for (int j = 0; j < campo.getColonne(); j++)
			System.out.print("__");
		System.out.print("\n|");
		
		for (int i = 0; i < campo.getRighe(); i++) {
			for (int j = 0; j < campo.getColonne(); j++) {
				if(campo.getCasellaIJ(i, j).getStato() == 'F')
					System.out.print(campo.getCasellaIJ(i, j).getContenuto()+ " ");
				else if(campo.getCasellaIJ(i, j).getStato() == 'P')
					System.out.print("P"+ " ");
				else
					System.out.print(" "+ " ");
			}
			System.out.print("|\n|");
		}
		for (int j = 0; j < campo.getColonne(); j++)
			System.out.print("__");
		System.out.println("|");
		System.out.println("Partita Finita!");
		
		
	}

}
