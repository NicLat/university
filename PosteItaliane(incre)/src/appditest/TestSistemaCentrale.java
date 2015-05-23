package appditest;

import javax.swing.JFrame;
import modello.CentralSystem;
import modello.ICassa;
import modello.ICentralSystem;
import modello.ITicketMachine;
import controllotest.ASbutton;
import controllotest.CassaController;
import controllotest.SFbutton;
import controllotest.SPbutton;
import dispositividitest.Cassa1;
import dispositividitest.Cassa2;
import dispositividitest.Cassa3;
import dispositividitest.Display;
import dispositividitest.PannelloCassieraDiTest;
import dispositividitest.PannelloUtenteTest;
import dispositividitest.TicketMachine;

public class TestSistemaCentrale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			JFrame frame = FramesUtils.createFrame("Pannello di Test", 400, 400);
			Display display = new Display();
			ITicketMachine ticketmachine = new TicketMachine();
			ICentralSystem cs = new CentralSystem(display, ticketmachine);
			frame.getContentPane().add(display);
			frame.setVisible(true);
			ICassa cassa1 = new Cassa1(cs);
			ICassa cassa2 = new Cassa2(cs);
			ICassa cassa3 = new Cassa3(cs);
			CassaController cassctrl1 = new CassaController(cassa1);
			CassaController cassctrl2 = new CassaController(cassa2);
			CassaController cassctrl3 = new CassaController(cassa3);
			SPbutton spbutton = new SPbutton(cs);
			SFbutton sfbutton = new SFbutton(cs);
			ASbutton asbutton = new ASbutton(cs);
			@SuppressWarnings("unused")
			PannelloUtenteTest put = new PannelloUtenteTest(spbutton, sfbutton, asbutton);
			@SuppressWarnings("unused")
			PannelloCassieraDiTest pct1 = new PannelloCassieraDiTest(cassctrl1);
			@SuppressWarnings("unused")
			PannelloCassieraDiTest pct2 = new PannelloCassieraDiTest(cassctrl2);
			@SuppressWarnings("unused")
			PannelloCassieraDiTest pct3 = new PannelloCassieraDiTest(cassctrl3);
	}

}
