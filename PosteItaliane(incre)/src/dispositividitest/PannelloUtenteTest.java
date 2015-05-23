package dispositividitest;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controllotest.ASbutton;
import controllotest.SFbutton;
import controllotest.SPbutton;

public class PannelloUtenteTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private SPbutton spbutton;
	@SuppressWarnings("unused")
	private SFbutton sfbutton;
	@SuppressWarnings("unused")
	private ASbutton asbutton;
	
	public PannelloUtenteTest(SPbutton spbutton, SFbutton sfbutton,ASbutton asbutton){
		super();
		this.spbutton=spbutton;
		this.sfbutton=sfbutton;
		this.asbutton=asbutton;
		JPanel panel = new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3,1));
		panel.add(spbutton);
		panel.add(sfbutton);
		panel.add(asbutton);
		this.setTitle("Scegliere servizio");
		this.setSize(200, 200);
		this.setVisible(true);
	}
}
