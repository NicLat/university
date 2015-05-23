package tests;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import modello.Segreteria;
import ui.BarraMenu;
import ui.MenuController;

public class Test10 {

	public static void main(String[] args) {
		
		Segreteria segreteria = new Segreteria();

		segreteria.caricaTeams("teams.txt");
		segreteria.caricaFacolta("facolta.txt");
		segreteria.leggiIncontri("incontri.txt");
		
		
		JFrame frame = Utils.createFrame();
		frame.setLayout(new BorderLayout());
		
			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			frame.add(panel);
			
			
				JTextArea output = new JTextArea(segreteria.getClassificaTeams());
				output.setEditable(false);
				JScrollPane outPane = new JScrollPane(output);
				panel.add(outPane, BorderLayout.CENTER);
				
				BarraMenu bar = new BarraMenu();
				panel.add(bar, BorderLayout.NORTH);
				MenuController menu = new MenuController(segreteria, bar, output);
				menu.setListeners();

				
		frame.getContentPane().add(panel);	
		frame.setVisible(true);
		
	}
}
