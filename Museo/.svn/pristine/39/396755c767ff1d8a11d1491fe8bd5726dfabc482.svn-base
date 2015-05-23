package tests;

import files.loader.CaricaRiga;
import modello.CatalogoDigitale;
import modello.Pezzo;

public class Test01 {
	
	public static void main(String[] args) {
		
		CatalogoDigitale catalogo = new CatalogoDigitale(null);
		catalogo.caricaPezzi("catalogo.txt", new CaricaRiga(catalogo));
		
		for (Pezzo p : catalogo.elencoPezzi()) {
			System.out.println(p.getSala() +"-"+ p.getAnno() +"-"+ p.getCodiceIdentificativo() +"-"+ p.getDescrizione() +"\n");
		}
		
		
	}

}
