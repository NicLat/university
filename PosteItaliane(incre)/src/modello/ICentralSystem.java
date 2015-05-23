package modello;

import java.util.HashMap;
/**
 * Questa interfaccia la creiamo per spezzare la dipendenza della cassa dal sistema centrale
 * @author incre
 *
 */
public interface ICentralSystem {

	
		public abstract void setRichiesta(String servizio);
		public abstract void getRichiesta(String servizio);
		public abstract HashMap<String, Integer> getQueue();
		public abstract HashMap<String, Integer> getNext();
}
