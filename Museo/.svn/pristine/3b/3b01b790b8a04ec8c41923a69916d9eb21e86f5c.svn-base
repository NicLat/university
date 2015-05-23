package modello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;

import files.loader.ILineReader;
import files.loader.MyFileReader;

/**
 * Catalogo digitale che contiene un {@link ArrayList} di pezzi
 * da la possibilità di verificare l'esistenza di un pezzo e quindi l'inserimento 
 * prevede l'unicità del codice identificativo
 * @author cl411531
 *
 */
public class CatalogoDigitale extends Observable{
	
	private ArrayList<Pezzo> pezzi;
	private IEsportaCatalogo esportazione;

	public CatalogoDigitale(IEsportaCatalogo esportazione) {
		super();
		this.pezzi = new ArrayList<Pezzo>();
		this.esportazione = esportazione;
	}
	
	
	
	public Pezzo getPezzo(String codiceIdentificativo){
		for (Pezzo p : pezzi) {
			if(p.getCodiceIdentificativo().equals(codiceIdentificativo))
				return p;
		}
		return null;
	}
	public void inserisciPezzo(Pezzo p) throws Exception{
		if(getPezzo(p.getCodiceIdentificativo()) != null){
			throw new Exception("Pezzo già presente (codice duplicato)");
		}	
		pezzi.add(p);
		ordinaPezzi();
		
		setChanged();
		notifyObservers();
	}
	
	
	public void caricaPezzi(String nomefile, ILineReader lettoreRiga){
		MyFileReader reader = new MyFileReader(nomefile, lettoreRiga);
		reader.loadFile();	
	}
	
	
	public void esportaCatalogo(){
		esportazione.esportaCatalogo(pezzi);
	}
	
	
	private void ordinaPezzi(){
		Collections.sort(pezzi);
	}
	public ArrayList<Pezzo> elencoPezzi() {
		ordinaPezzi();
		return pezzi;
	}

}
