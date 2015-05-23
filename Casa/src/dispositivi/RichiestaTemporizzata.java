package dispositivi;

import java.util.TimerTask;

/**
 * Processo timer che esegue la richiesta ricevuta
 * @author nicola
 */
public class RichiestaTemporizzata extends TimerTask{
	
	private Centralina centralina;
	private String richiesta;
	
	/**
	 * @param centralina Classe che gestisce la centralina di casa
	 * @param richiesta Stringa di richiesta azione da fare
	 */
	public RichiestaTemporizzata(Centralina centralina, String richiesta) {
		super();
		this.centralina = centralina;
		this.richiesta = richiesta;
	}

	@Override
	public void run() {
		centralina.getStati().put(Utils.separaRichiesta(richiesta).get(0),false);	// cerca il dispositivo nella mappa stati e lo setta a libero (false)
		centralina.getRisposta(richiesta);
	}
	
}
