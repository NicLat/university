package dispositividitest;

import java.awt.Color;

import javax.swing.JTextArea;

import modello.IDisplay;

public class Display extends JTextArea implements IDisplay {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Display() {
		super();
		this.setEnabled(false);
		this.setBackground(Color.BLACK);
		this.setDisabledTextColor(Color.red);
	}

	String schermata = new String();

	@Override
	public void aggiorna(String damostrare) {
		schermata = schermata.substring(0) + damostrare + "\n";
		this.setText(schermata);
	}

}
