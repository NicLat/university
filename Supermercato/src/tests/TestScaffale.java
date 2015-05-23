package tests;

import utils.Scaffale;

public class TestScaffale {
	public static void main(String[] args) {
		Scaffale frutta = new Scaffale();
		
		frutta.nuovoProdotto(1, 4);
		frutta.nuovoProdotto(2, 3);
		
		
		System.out.println("ris : "+frutta.trovaProdotto(1));
		
		
	}
}
