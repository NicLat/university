package model;

public class CassaSpecifica implements ICassa{

	private IUfficio ufficio;
	private int servizio;

	
	public CassaSpecifica(IUfficio ufficio, int servizio) {
		super();
		this.ufficio = ufficio;
		this.servizio = servizio;
	}

	@Override
	public boolean servi(int numCassa) {
		boolean servito = ufficio.serviCliente(servizio);
		if(servito)
			ufficio.getPannelloTurni().aggiungiTurno(new Turno(servizio, numCassa));
		return servito;
	}

}
