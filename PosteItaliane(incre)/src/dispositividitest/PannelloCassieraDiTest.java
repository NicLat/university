package dispositividitest;


import javax.swing.JFrame;
import javax.swing.JPanel;

import controllotest.CassaController;

public class PannelloCassieraDiTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private CassaController cassctrl;

	public PannelloCassieraDiTest(CassaController cassctrl) {
		super();
		this.cassctrl = cassctrl;
		JPanel panel = new JPanel();
		this.getContentPane().add(panel);
		panel.add(cassctrl);
		this.setTitle("PANNELLO CASSA");
		this.setSize(200, 200);
		this.setVisible(true);
	}
}
