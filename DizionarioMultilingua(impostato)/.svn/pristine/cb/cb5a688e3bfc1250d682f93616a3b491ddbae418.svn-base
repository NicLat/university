package modello;

import java.util.HashMap;

import modello.GestoreDizionario.Traduzione;
import files.CaricaRiga;
import files.MyFileReader;

public class CaricaDaFile implements ICaricaDizionario{
	

	MyFileReader reader;

	@Override
	public HashMap<String, Traduzione> caricaNuovoDizionario(String sorgente) {
	
		HashMap<String, Traduzione> dizionario = new HashMap<String, GestoreDizionario.Traduzione>();
		reader = new MyFileReader(sorgente, new CaricaRiga(dizionario));
		
		return null;
	}

}
