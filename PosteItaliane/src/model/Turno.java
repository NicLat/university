package model;

public class Turno {
	private int servizio;
	private int numeroCassa;
	
	public Turno(int servizio, int numeroCassa) {
		super();
		this.servizio = servizio;
		this.numeroCassa = numeroCassa;
	}


	public int getServizio() {
		return servizio;
	}


	public void setServizio(int servizio) {
		this.servizio = servizio;
	}


	public int getNumeroCassa() {
		return numeroCassa;
	}


	public void setNumeroCassa(int numeroCassa) {
		this.numeroCassa = numeroCassa;
	}

}
