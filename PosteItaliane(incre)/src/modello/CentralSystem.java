package modello;

import java.util.HashMap;

public class CentralSystem implements ICentralSystem {

	private static final String SP = "SERVIZIO POSTALE";
	private static final String SF = "SERVIZIO FINANZIARIO";
	private static final String AS = "ALTRI SERVIZI";

	private HashMap<String, Integer> next = new HashMap<String, Integer>();
	private HashMap<String, Integer> counters = new HashMap<String, Integer>();
	private HashMap<String, Integer> queue = new HashMap<String, Integer>();
	private IDisplay display;
	private ITicketMachine ticketmachine;

	public CentralSystem(IDisplay display, ITicketMachine ticketmachine) {
		super();
		next.put(SP, 0);
		next.put(SF, 0);
		next.put(AS, 0);
		queue.put(SP, 0);
		queue.put(SF, 0);
		queue.put(AS, 0);
		counters.put(SP, 0);
		counters.put(SF, 0);
		counters.put(AS, 0);
		this.display = display;
		this.ticketmachine = ticketmachine;
	}

	/**
	 * Con questo metodo, che si suppone verrà chiamato tramite il pannello a
	 * disposizione del cliente, il quale formulerà la stringa relativa al
	 * servizio richiesto, viene incrementato il contatore e la coda relativi al
	 * servizio
	 * 
	 * @param servizio
	 */
	public void setRichiesta(String servizio) {
		int newcounter = counters.get(servizio) + 1;
		counters.put(servizio, newcounter);
		int newqueue = queue.get(servizio) + 1;
		queue.put(servizio, newqueue);
		stampabiglietto(servizio, counters.get(servizio));
	}

	private void stampabiglietto(String servizio, Integer integer) {
		ticketmachine.printticket(servizio, counters.get(servizio));
	}

	/**
	 * Con questo metodo, che si suppone verrà chiamato da una cassa, la quale
	 * seguendo un qualche criterio prioritario formulerà la stringa da passare
	 * al metodo stesso, viene decrementata la coda relativa a quel servizio e
	 * viene aggiornato il pannello con il prossimo numero e relativo servizio
	 * da servire
	 * 
	 * @param servizio
	 */
	public void getRichiesta(String servizio) {
		if (queue.get(servizio) > 0) {
			int newqueue = queue.get(servizio) - 1;
			queue.put(servizio, newqueue);
			int newnext = next.get(servizio) + 1;
			next.put(servizio, newnext);
			aggiornapannello(servizio);
		}
	}

	private void aggiornapannello(String servizio) {
		String damostrare = (next.get(servizio)) + " " + servizio;
		display.aggiorna(damostrare);
	}

	public HashMap<String, Integer> getQueue() {
		return queue;
	}

	@Override
	public HashMap<String, Integer> getNext() {
		return next;
	}

}
