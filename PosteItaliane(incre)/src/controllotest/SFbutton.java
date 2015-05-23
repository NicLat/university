package controllotest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import modello.ICentralSystem;

public class SFbutton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ICentralSystem centralsystem;

	public SFbutton(ICentralSystem centralsystem) {
		super();
		this.centralsystem = centralsystem;
		this.setText("SERVIZIO FINANZIARIO");
		setButton();
	}

	private void setButton() {
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				centralsystem.setRichiesta("SERVIZIO FINANZIARIO");
			}
		});
	}
}

