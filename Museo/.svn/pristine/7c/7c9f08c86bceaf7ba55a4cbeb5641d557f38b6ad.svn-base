package files.loader;

import java.util.StringTokenizer;

import modello.CatalogoDigitale;
import modello.Pezzo;

public class CaricaRiga implements ILineReader{
	
	CatalogoDigitale museo;

	public CaricaRiga(CatalogoDigitale museo) {
		super();
		this.museo = museo;
	}
	
	/**
	 * gestisce errori di formattazione dati nel pezzo, e errori di duplicazione pezzi
	 */
	@Override
	public void readLine(String line) {
		
		Pezzo p;
		StringTokenizer tok = new StringTokenizer(line,",");
		String cod = tok.nextToken();
		int anno = Integer.parseInt(tok.nextToken());
		String descrizione = tok.nextToken();
		String sala = tok.nextToken();
		
		try {
			p = new Pezzo(cod, anno, descrizione, sala);
			museo.inserisciPezzo(p);
		} catch (Exception e) {
			// gestisce errori di formattazione dati nel pezzo, e errori di duplicazione pezzi
			System.err.println(e.getMessage());
		}
		
	}

}
