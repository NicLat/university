package test;

import model.AZOrder;
import model.Phrases;
import model.ShuffleOrder;

public class Test01 {

	
	public static void main(String[] args) {
		Phrases prova = new Phrases(new ShuffleOrder());
		
		prova.addString("aiooo");
		prova.addString("trrr");
		prova.addString("leee");
		
		for (int i = 0; i < prova.getSize(); i++) {
			System.out.println(prova.getElem(i));
		}
		
		System.out.println();
		prova.setOrder(new AZOrder());
		for (int i = 0; i < prova.getSize(); i++) {
			System.out.println(prova.getElem(i));
		}
	}
}
