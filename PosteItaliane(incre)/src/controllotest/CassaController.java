package controllotest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import modello.ICassa;

public class CassaController extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ICassa cassa;

	public CassaController(ICassa cassa) {
		super();
		this.cassa = cassa;
		this.setText("PROSSIMO CLIENTE");
		setControllo();
	}

	private void setControllo() {
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cassa.servinext();
			}
		});
	}

}
