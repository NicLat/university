package modello;
/**
 * Questa interfaccia è fatta per astrarre sulla tecnologia che starà alla base della macchina che stampa
 * i ticket
 * @author incre
 *
 */
public interface ITicketMachine {

	
		public abstract void printticket(String servizio, int counter);
}
