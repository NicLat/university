package model;


public class DistributoreBiglietti{

	private IUfficio ufficio;
	
	public DistributoreBiglietti(IUfficio ufficio) {
		super();
		this.ufficio = ufficio;
	}

	public int ticketPostale() {
		ufficio.incrementaCoda(0);
		return ufficio.getCoda(0);
	}

	public int ticketFinanziario() {
		ufficio.incrementaCoda(1);
		return ufficio.getCoda(1);
	}

	public int ticketAltri() {
		ufficio.incrementaCoda(2);
		return ufficio.getCoda(2);
	}
	
}
