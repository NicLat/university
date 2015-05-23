package utils;

public class ProdottoDelSupermercato {
	private int codice;
	private int quantita;
	
	public ProdottoDelSupermercato(int codice, int quantita) {
		this.setCodice(codice);	
		this.setQuantita(quantita);
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		if(quantita<0)
			quantita=0;
		this.quantita = quantita;
	}
	
}
