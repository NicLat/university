package dispositividitest;

import modello.ICassa;
import modello.ICentralSystem;

/**
 * Con questa classe testiamo il caso di una cassa la cui logica mira a offrire
 * il servizio per il quale c'è più coda
 * 
 * @author incre
 * 
 */
public class Cassa3 implements ICassa {

	private static final String SP = "SERVIZIO POSTALE";
	private static final String SF = "SERVIZIO FINANZIARIO";
	private static final String AS = "ALTRI SERVIZI";

	private ICentralSystem centralsystem;

	public Cassa3(ICentralSystem centralsystem) {
		super();
		this.centralsystem = centralsystem;
	}

	@Override
	public void servinext() {
		int codasp = centralsystem.getQueue().get(SP);
		int codasf = centralsystem.getQueue().get(SF);
		int codaas = centralsystem.getQueue().get(AS);
		String daservire = new String();
		if (codasp > codasf) {
			if (codasp > codaas) {
				daservire = SP;
			} else {
				daservire = AS;
			}
		} else if (codasf > codaas) {
			daservire = SF;
		} else {
			daservire = AS;
		}
		String nextbefore = centralsystem.getNext().get(daservire)+" "+daservire;
		centralsystem.getRichiesta(daservire);
		String nextafter = centralsystem.getNext().get(daservire)+" "+daservire;
		if ((centralsystem.getNext().get(daservire) > 0)&&(nextafter.compareTo(nextbefore))!=0) {
			System.out.println(centralsystem.getNext().get(daservire) + " "
					+ daservire);
		}
	}

}
