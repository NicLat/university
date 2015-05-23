package tests;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import modello.CatalogoDigitale;
import vista.BarraMenu;
import vista.LeggiCatalogo;
import controllo.MenuController;
import files.loader.CaricaRiga;

public class Test10 {
	
	public static void main(String[] args) {
		
		CatalogoDigitale catalogo = new CatalogoDigitale(null);
		catalogo.caricaPezzi("catalogo.txt", new CaricaRiga(catalogo));
		
		LeggiCatalogo textpane = new LeggiCatalogo(catalogo, "Tutti");
		
		JFrame frame = Utils.createFrame();
		frame.setLayout(new BorderLayout());
		
			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			frame.add(panel);
			
				panel.add(textpane, BorderLayout.CENTER);
				
				BarraMenu bar = new BarraMenu();
				panel.add(bar, BorderLayout.NORTH);
				MenuController menu = new MenuController(catalogo, bar, textpane);
				menu.setListeners();

				
		frame.getContentPane().add(panel);	
		frame.setVisible(true);
		
	}

}
