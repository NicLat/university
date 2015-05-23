package test;

import java.util.ArrayList;

import model.CassaCodaPiena;
import model.CassaSpecifica;
import model.PannelloTurni;
import model.Turno;
import model.Ufficio;

public class Test01 {
	
	public static void main(String[] args) {
		
		
		Ufficio ufficio = new Ufficio(new PannelloTurni(5));
		PannelloTurni pan = ufficio.getPannelloTurni();
		
		ufficio.addCassa(new CassaSpecifica(ufficio, 0));
		ufficio.addCassa(new CassaSpecifica(ufficio, 1));	
		ufficio.addCassa(new CassaSpecifica(ufficio, 2));	
		ufficio.addCassa(new CassaCodaPiena(ufficio));
		
		ufficio.getDistributore().ticketFinanziario();
		ufficio.getDistributore().ticketFinanziario();
		ufficio.getDistributore().ticketFinanziario();
		ufficio.getDistributore().ticketPostale();
		ufficio.getDistributore().ticketPostale();
		ufficio.getDistributore().ticketAltri();
		
		
		
		ufficio.getCasse().get(3).servi(3);stampaPannello(pan);
		ufficio.getCasse().get(3).servi(3);stampaPannello(pan);
		ufficio.getCasse().get(3).servi(3);stampaPannello(pan);
		ufficio.getCasse().get(3).servi(3);stampaPannello(pan);
		ufficio.getCasse().get(3).servi(3);stampaPannello(pan);
		ufficio.getCasse().get(3).servi(3);stampaPannello(pan);
		
		ufficio.getCasse().get(1).servi(1);stampaPannello(pan);
		
	}
	
	
	static void stampaPannello(PannelloTurni pan){
		
		ArrayList<Turno> turni = pan.getTurni();
		System.out.println("Cassa\tServizio");
		for (int i = turni.size()-1; i >= 0; i--) {
			System.out.println(turni.get(i).getNumeroCassa() + "\t" + turni.get(i).getServizio());
		}
	}

}
