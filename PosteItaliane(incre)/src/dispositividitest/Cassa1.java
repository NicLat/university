package dispositividitest;

import modello.ICassa;
import modello.ICentralSystem;

/**
 * Con questa classe testiamo una cassa che segua la logica di svolgere un solo
 * servizio(in questo caso il Servizio Postale)
 * 
 * @author incre
 * 
 */
public class Cassa1 implements ICassa {

	private final static String SERVIZIOCASSA = "SERVIZIO POSTALE";

	private ICentralSystem centralsystem;

	public Cassa1(ICentralSystem centralsystem) {
		super();
		this.centralsystem = centralsystem;
	}

	@Override
	public void servinext() {
		String nextbefore=centralsystem.getNext().get(SERVIZIOCASSA)+" "+SERVIZIOCASSA;
		centralsystem.getRichiesta(SERVIZIOCASSA);
		String nextafter=centralsystem.getNext().get(SERVIZIOCASSA)+" "+SERVIZIOCASSA;
		if ((centralsystem.getNext().get(SERVIZIOCASSA) > 0)&&(nextbefore.compareTo(nextafter)!=0)) {
			System.out.println(centralsystem.getNext().get(SERVIZIOCASSA) + " "
					+ SERVIZIOCASSA);
		}
	}
}
