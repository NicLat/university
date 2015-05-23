package utils;

import utils.ProdottoDelSupermercato;

public class Scaffale {
	private ProdottoDelSupermercato[] prod;
	private static final int N = 20;
	
	public Scaffale() {
		this.prod = new ProdottoDelSupermercato[N];
	}
	public int trovaProdotto(int codice){
		for (int i = 0; i < prod.length; i++) {
			if(this.prod[i].getCodice()==codice)
				return i;
		}
		return -1;
	}
	public boolean nuovoProdotto(int codice, int quantita){
		if(prod.length<N){
			if(this.trovaProdotto(codice)!=-1)
				return false;
			prod[prod.length].setCodice(codice);
			prod[prod.length].setQuantita(quantita);
			return true;
		}
		return false;
	}
	public boolean incrementaProdotto(int codice, int quantita){
		int elem = trovaProdotto(codice);
		if (elem!=-1){
			int base = prod[elem].getQuantita();
			prod[elem].setQuantita(base+quantita);
			return true;
		}
		return false;
	}
	
}
