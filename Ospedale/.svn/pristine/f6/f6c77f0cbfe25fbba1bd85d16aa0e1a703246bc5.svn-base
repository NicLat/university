package tests;

import java.util.List;

import convertitore.Convertitore;
import convertitore.FormatoA;
import convertitore.FormatoB;
import convertitore.Paziente;

public class Test01 {


	public static void main(String[] args) {
		
		Convertitore convertitore = new Convertitore(new FormatoA());
		List<Paziente> pazienti;
		
		convertitore.setFormato(new FormatoA());	
		
		pazienti = convertitore.leggiFile("inA.txt");
		
		convertitore.setFormato(new FormatoB());
		convertitore.scriviFile("out.txt", pazienti);
		
		
	}

}
