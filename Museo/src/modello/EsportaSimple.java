package modello;

import java.util.ArrayList;

public class EsportaSimple implements IEsportaCatalogo{

	@Override
	public void esportaCatalogo(ArrayList<Pezzo> pezzi) {
		
		for (Pezzo p : pezzi) {
			System.out.println(p.getSala() +"        "+ p.getAnno() +"\t"+ p.getCodiceIdentificativo() +"\t"+ p.getDescrizione());
		}
		
		
	}
}
