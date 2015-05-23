package gestore;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Vettura di trasporto scarpe che può contenere diversi stock
 * @author nicola
 *
 */
public class Vettura {
	
	private HashMap<String, StockScarpe> carico;
	
	public Vettura() {
		super();
		this.carico = new HashMap<String, StockScarpe>();
	}

	
	/**
	 * Modifica la quantità di uno stock in una vettura, oppure se non è presente la inserisce (carico), con l'ora.
	 * In sostanza gestisce carico e scarico da una vettura.
	 * @param scarpa Stringa contenente modello e numero "Modello(Numero)"
	 * @param aggiunta Numero positivo o negativo che viene sommato alla quantità presente nel furgone o viene settato come quantità
	 * @param data	Data di avvenimento della modifica, utile per il carico di merce
	 * @throws Exception Eccezione sull'aggiunta che rende negativo il carico
	 */
	public void modificaPresenze(String scarpa, int aggiunta, Date data) throws Exception{
		
		if(carico.containsKey(scarpa) == false){
			carico.put(scarpa, new StockScarpe( data, aggiunta));
		}else {
			try {
				carico.get(scarpa).aggiornaQuantita(aggiunta);
			} catch (Exception eccezione) {
				if(eccezione.getMessage() == "Scarpe finite")
					carico.remove(scarpa);
				else
					throw eccezione;
			}
		}	
	}
	
	/**
	 * 
	 * @param modello Modello di scarpe formattato come "Modello, Numero"
	 * @return Numero di presenze per quel modello, 0 se non presente
	 */
	public int getPresenze(String scarpa){
		
		if(carico.get(scarpa) == null){
			return 0;
		}
		return carico.get(scarpa).getQuantita();
	}
	
	
	/**
	 * Crea una mappa con gli stock di scarpe presenti da più di tot giorni nella vettura
	 * @param giorni giorni di presenza
	 * @return mappa con gli stock
	 */
	public HashMap<String, StockScarpe> getScarpeVecchie(int giorni){
		HashMap<String, StockScarpe> mappa = new HashMap<String, StockScarpe>();
		
		for (Map.Entry<String, StockScarpe> temp : carico.entrySet()) {
			if(temp.getValue().giorniInVettura(new Date()) >= giorni ){
				mappa.put(temp.getKey(), temp.getValue());
			}
		}
		return mappa;
	}

	/**
	 * Restituisce tutti gli stock nella vettura
	 * @return
	 */
	public HashMap<String, StockScarpe> getCarico() {
		return carico;
	}
		
	

}
