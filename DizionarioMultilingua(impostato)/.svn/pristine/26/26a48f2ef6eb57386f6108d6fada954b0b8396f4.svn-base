package modello;

import java.util.HashMap;

public class GestoreDizionario {

	public class Traduzione{
		private String termine;
		private String esempio;
		
		public Traduzione(String termine, String esempio) {
			super();
			this.termine = termine;
			this.esempio = esempio;
		}

		public String getTermine() {
			return termine;
		}
		public String getEsempio() {
			return esempio;
		}	
	}
	
	HashMap<String, Traduzione> dizionario;
	ICaricaDizionario caricatore;

	public GestoreDizionario() {
		super();
		this.dizionario = new HashMap<String, GestoreDizionario.Traduzione>();
	}
	
	public void aggiungiParola(String parola, String traduzione, String esempio) throws Exception{
		if(dizionario.containsKey(parola) == false){
			Traduzione trad = new Traduzione(traduzione, esempio);
			dizionario.put(parola, trad);		
		}else{
			throw new Exception("Parola già esistente");
		}
		
	}
	
}
