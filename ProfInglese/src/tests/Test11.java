package tests;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import modello.CaricatoreB;
import modello.Confrontatore;
import modello.Esercitatore;
import vista.BarraMenu;
import vista.Output;
import controllo.ButtonController;
import controllo.Menu;

public class Test11 {
	
	public static final int MAX_FRASI = 4;
	
public static void main(String[] args) {
	
		
		Esercitatore esercitatore = new Esercitatore(new CaricatoreB(), new Confrontatore());
		esercitatore.aggiungiFrasi("frasi1.txt");
		
		JFrame frame = Utils.createFrame();
		frame.setLayout(new BorderLayout());
		
			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			frame.add(panel);
			
				BarraMenu bar = new BarraMenu();
				panel.add(bar, BorderLayout.NORTH);
				Menu menu = new Menu(esercitatore, bar);
				menu.setListeners();
			
					JPanel subPanel = new JPanel();
					subPanel.setLayout(new GridLayout(6,1));
					panel.add(subPanel, BorderLayout.CENTER);
		
					subPanel.add(new JLabel("Frase:"));
					String frase = esercitatore.getNuovaFrase();
					Output out = new Output("");
					JScrollPane outS = new JScrollPane(out);
					if(frase != null)
						out.setText(frase);
					subPanel.add(outS);
			
					subPanel.add(new JLabel("Traduzione:"));
					JTextArea in = new JTextArea("");
					subPanel.add(in);
			
					subPanel.add(new JLabel());
					JButton button = new JButton("Avanti");
					ButtonController buttContr = new ButtonController(esercitatore);
					buttContr.buttonClick(out, in, button, MAX_FRASI);
					subPanel.add(button);
		

//		Menu menu = new Menu(campo, barra);
//		menu.setListeners();
		
		
		frame.getContentPane().add(panel);	
		frame.setVisible(true);
	}

}
