package model;

import java.util.ArrayList;
import java.util.Collections;

public class CassaCodaPiena implements ICassa{

	private IUfficio ufficio;

	public CassaCodaPiena(IUfficio ufficio) {
		super();
		this.ufficio = ufficio;
	}
	
	@Override
	public boolean servi(int numCassa) {
		int servizio =  codaPiuPiena();
		System.out.println(servizio);
		boolean servito = ufficio.serviCliente(servizio);
		if(servito)
			ufficio.getPannelloTurni().aggiungiTurno(new Turno(servizio, numCassa));
		return servito;
	}
	
	private int codaPiuPiena(){	
		ArrayList<Integer> attendenti = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			attendenti.add( ufficio.getCoda(i) - ufficio.getServito(i) );
		}
		return attendenti.indexOf(Collections.max(attendenti));
	}
	
}
