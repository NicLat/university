package modello;


public class ParolaTrovata implements Comparable<ParolaTrovata>{
	private String parola;
	private int punteggio;
	
	
	public ParolaTrovata(String parola, int punteggio) {
		super();
		this.parola = parola;
		this.punteggio = punteggio;
	}	
	public String getParola() {
		return parola;
	}
	public int getPunteggio() {
		return punteggio;
	}


	@Override
	public int compareTo(ParolaTrovata p) {
		if(this.punteggio < p.getPunteggio())
			return 1;
		else if(this.punteggio > p.getPunteggio())
			return -1;
		return this.parola.compareTo(p.getParola());
	}
	
}