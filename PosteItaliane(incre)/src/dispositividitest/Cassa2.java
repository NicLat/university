package dispositividitest;

import java.util.Random;

import modello.ICassa;
import modello.ICentralSystem;

/**
 * Con questa classe testiamo il caso di una cassa che segue una logica
 * prioritaria.In particolare la priorità è data ai servizi finanziari.Se però
 * per questo servizio non c'è coda, la cassa si dedica in modo casuale ad uno
 * degli altri due servizi
 * 
 * @author incre
 * 
 */
public class Cassa2 implements ICassa {

	private final static String SERVIZIOPRIORITARIO = "SERVIZIO FINANZIARIO";
	private static final String SP = "SERVIZIO POSTALE";
	private static final String AS = "ALTRI SERVIZI";

	private ICentralSystem centralsystem;

	public Cassa2(ICentralSystem centralSystem) {
		super();
		this.centralsystem = centralSystem;
	}

	@Override
	public void servinext() {
		String daservire = new String();
		if (centralsystem.getQueue().get(SERVIZIOPRIORITARIO) == 0) {
			Random random = new Random();
			int coin = random.nextInt(2);
			if (coin == 0) {
				daservire = SP;
				stampa(daservire);
				return;
			} else if(coin == 1) {
				daservire = AS;
				stampa(daservire);
				return;
			}
		}
		daservire = SERVIZIOPRIORITARIO;
		stampa(daservire);
	}

	
	private void stampa(String daservire) {
		String nextbefore = centralsystem.getNext().get(daservire)
				+ " " + daservire;
		centralsystem.getRichiesta(daservire);
		String nextafter = centralsystem.getNext().get(daservire) + " "
				+ daservire;
		if ((centralsystem.getQueue().get(daservire) >= 0)
				&& (nextafter.compareTo(nextbefore) != 0)) {
			System.out.println(centralsystem.getNext().get(daservire)
					+ " " + daservire);
		}
	}
}
