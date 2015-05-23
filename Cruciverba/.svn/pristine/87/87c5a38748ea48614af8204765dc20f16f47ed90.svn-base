package test;


import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.ProxyVerify;
import view.LogUpdater;
import view.MenuBar;
import view.ResultsPanel;
import controller.ButtonController;
import controller.InputAreaController;
import controller.KeyboardController;
import controller.MenuController;

public class Utils {

	static JFrame createFrame() {
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Cruciverba Utility");
		return frame;
	}

	public static JPanel createOutputPanel(ProxyVerify verifica){
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2));
		
		JLabel ris = new JLabel("Risultato:");
		panel2.add(ris);
		
		
		LogUpdater file = new LogUpdater("Log.txt", verifica);
		ResultsPanel pan = new ResultsPanel(verifica);	
		panel2.add(pan.getLabel());
			
		return panel2;
	}

	static JPanel createInputPanel(ProxyVerify verifica) {
		JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(2,1));
		
				JTextField field = new JTextField("Scrivi quì la parola che vuoi controllare");
				
				field.addKeyListener(new KeyAdapter() {
					  public void keyTyped(KeyEvent e) {
					    char keyChar = e.getKeyChar();
					    if (Character.isLowerCase(keyChar)) {
					    	e.setKeyChar(Character.toUpperCase(keyChar));
					    }
					  }
					});
				
				InputAreaController areaCtrl = new InputAreaController();
				areaCtrl.areaClick(field);
				
				JButton button = new JButton("Controlla");
		
		
				ButtonController buttonCtrl = new ButtonController(verifica);
				buttonCtrl.buttonClick(field, button);
		
		
		KeyboardController KCtrl = new KeyboardController(verifica, field);
		field.addKeyListener(KCtrl);
		
		panel.add(field);
		panel.add(button);
		return panel;
	}

	static MenuBar createMenuBar(ProxyVerify verifica) {
		MenuBar bar = new MenuBar();
		MenuController MenuCtrl = new MenuController(verifica,bar);
		MenuCtrl.setListeners();
		return bar;
	}

}
