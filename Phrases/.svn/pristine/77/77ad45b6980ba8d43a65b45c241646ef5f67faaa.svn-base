package test;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Phrases;
import view.MenuBar;
import view.PhrasesArea;
import controller.ButtonController;
import controller.InputAreaController;
import controller.KeyboardController;
import controller.MenuController;

public class MainClass {

	public static void main(String[] args) {
		
		Phrases frasi = new Phrases();
				
		JFrame frame = test.Utils.createFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		panel.add(createInputPanel(frasi));
		panel.add(createOutputPanel(frasi));
		
			
		MenuBar bar = createMenuBar(frasi);
		frame.setJMenuBar(bar.getBar());
		
		frame.getContentPane().add(panel);	
		frame.setVisible(true);
	}


	private static MenuBar createMenuBar(Phrases frasi) {
		MenuBar bar = new MenuBar();
		MenuController MenuCtrl = new MenuController(frasi,bar);
		MenuCtrl.setListeners();
		return bar;
	}
	
	
	private static JPanel createInputPanel(Phrases frasi) {
		JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(2,1));
		
				JTextField field = new JTextField("Scrivi quì");;
				InputAreaController areaCtrl = new InputAreaController();
				areaCtrl.areaClick(field);
				
				JButton button = new JButton("Aggiungi");
		
		
				ButtonController buttonCtrl = new ButtonController(frasi);
				buttonCtrl.buttonClick(field, button);
		
		
		// KeyboardController aggiunto all'area di testo che gestisce l'invio
		KeyboardController KCtrl = new KeyboardController(frasi, field);
		field.addKeyListener(KCtrl);
		
		panel.add(field);
		panel.add(button);
		return panel;
	}
	
	public static JPanel createOutputPanel(Phrases frasi){
		JPanel panel2 = new JPanel();
			panel2.setLayout(new GridLayout(1,1));
	
				PhrasesArea area =new PhrasesArea(frasi,new JTextArea());
					
				JScrollPane scrollPane = new JScrollPane(area.getArea());		//aggiunto io
			panel2.add(scrollPane);
			
		return panel2;
	}
		
}
