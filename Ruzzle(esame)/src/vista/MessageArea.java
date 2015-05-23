package vista;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextArea;

import modello.Partita;

public class MessageArea extends JTextArea implements Observer{
	
	private static final long serialVersionUID = 1L;
	private Partita partita;
		
	public MessageArea(Partita partita) {
		super();
		this.partita = partita;
		this.partita.addObserver(this);
		
		setText("\n\n\nPer iniziare una nuova partita premi\nl'apposito bottone\n\nScrivi nel campo a sinistra \n le parole che trovi");
	}

	private void aggiornaMessaggio(){
		if(partita.getStatoPartita() == false)
			setText("\n\n\nPartita terminata!\nPer iniziare una nuova partita premi\nl'apposito bottone\n\nScrivi nel campo a sinistra \nle parole che trovi");
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		aggiornaMessaggio();
	}

}
