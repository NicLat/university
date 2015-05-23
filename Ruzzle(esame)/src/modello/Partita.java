package modello;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;


/**
 * Classe che gestisce una partita di "Trova Parole" 
 * E' Observable solo per il suo stato, se in corso o meno, in modo che i componenti grafici
 * possano agire di conseguenza
 * @author esame_16
 */
public class Partita extends Observable{
	
	private char[][] matrice;
	private int lato,vocaliMinime;
	
	private IVerificaParola verificatore;
	private IGeneraCampo generatore;
	IResoconto generatoreResoconto;
	
	private ArrayList<ParolaTrovata> paroleTrovate;
	
	/**
	 * Descrive lo stato della partita (osservato)
	 */
	private boolean statoPartita = false;
	
	
	public Partita(int lato, int vocaliMinime, IGeneraCampo generatore, IVerificaParola verificatore, IResoconto resoconto) {
		super();
		this.lato = lato;
		this.vocaliMinime = vocaliMinime;
		
		this.verificatore = verificatore;
		this.generatore = generatore;
		this.generatoreResoconto = resoconto;
	}


	/**
	 * Avvia la partita, creando la tabella di caratteri, allocando un nuovo vettore di parole 
	 * trovate e settando la partita come "in corso" (notifica agli osservatori)
	 * Inoltre avvia un timer
	 * @param tempo Durata della partita in secondi
	 */
	public void start(int tempo){
		
		matrice = generatore.generaCampo(lato, vocaliMinime);
		paroleTrovate = new ArrayList<ParolaTrovata>();
		statoPartita = true;
		
		setChanged();
		notifyObservers();
		
		final Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				
				stop();
				timer.cancel();
			}
		},tempo*1000);
	}
	
	/**
	 * Termina la partita (la setta "finita" avvisando gli osservatori) e 
	 * utilizza un componente apposito per creare un report
	 */
	public void stop(){
		statoPartita = false;
		System.out.println("fine partita");
		
		setChanged();
		notifyObservers();
		
		generatoreResoconto.scriviResoconto(paroleTrovate);
	}
	
	/**
	 * Riceve una parola dal giocatore, ne verifica la presenza e l'eventuale punteggio relativo
	 * @param parola parola in ingresso
	 * @return 0 se la parola non è presente, altrimenti i punti relativi
	 */
	public int puntiParola(String parola){
		int punti = verificatore.verificaParola(getMatrice(), parola);
		
		if(punti > 0){
			paroleTrovate.add(new ParolaTrovata(parola, punti));
		}

		return punti;
	}
	
	

	public boolean getStatoPartita() {
		return statoPartita;
	}
	public char[][] getMatrice() {
		return matrice;
	}

}
