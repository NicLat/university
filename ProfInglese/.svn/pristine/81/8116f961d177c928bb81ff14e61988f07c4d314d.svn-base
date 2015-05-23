package modello;

import java.util.ArrayList;
import java.util.HashMap;

import files.LeggiRiga;
import files.MyFileReader;

public class CaricatoreA implements ICaricaFrasi{

	MyFileReader reader;
	HashMap<String, ArrayList<String>> frasiCaricate;

	public CaricatoreA() {
		super();
		frasiCaricate = new HashMap<String, ArrayList<String>>();
	}

	@Override
	public HashMap<String, ArrayList<String>> caricaCollezioneFrasi(String sorgente) {
		
		reader = new MyFileReader(sorgente, new LeggiRiga(frasiCaricate));
		reader.loadFile();

		return frasiCaricate;
	}
	
}
