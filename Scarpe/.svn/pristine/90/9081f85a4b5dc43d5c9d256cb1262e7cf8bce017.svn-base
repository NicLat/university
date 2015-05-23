package gestore;

import java.util.Date;

/**
 * Uno stock di scarpe con informazioni sulla data di carico sul veicolo e la quantità
 * @author nicola
 */
public class StockScarpe {
	
	private Date dataCarico;
	private int quantita;
	
	public StockScarpe(Date dataCarico, int quantita) {
		super();
		this.dataCarico = dataCarico;
		this.quantita = quantita;
	}
	
	public int getQuantita() {
		return quantita;
	}
	public Date getDataCarico() {
		return dataCarico;
	}
	
	/**
	 * Aggiorna la quantita di scarpe nello stock controllando che non vada in negativo
	 * @param aggiunta somma positiva o negativa con cui aggiornare lo stock
	 * @throws Exception eccezione riguardante errori possibili
	 */
	public void aggiornaQuantita(int aggiunta) throws Exception{
	
		if (quantita + aggiunta < 0)
			throw new Exception("La quantita diventerebbe negativa");
		if (quantita + aggiunta == 0)
			throw new Exception("Scarpe finite");
		
		quantita += aggiunta;	
	}
	
	/**
	 * Calcola la differenza di giorni tra l'inserimento dello stock in vettura e la data nei parametri
	 * @param data data per la differenza
	 * @return numero giorni
	 */
	public int giorniInVettura(Date data){
		long millisecondi = data.getTime() - dataCarico.getTime() ;
		return (int) (millisecondi / (1000 * 60 * 60 * 24));	
	}


}
