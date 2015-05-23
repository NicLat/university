package tests;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import modello.Generatore;
import modello.Partita;
import modello.ResocontoSuFile;
import modello.Verificatore;
import vista.MessageArea;
import controllo.ButtonController;
import controllo.KeyboardController;

public class Test10 {
	
	public static void main(String[] args) {
		
		Partita partita = new Partita(9,45,new Generatore(),new Verificatore(), new ResocontoSuFile("resoconto.txt"));
		
		JFrame frame = Utils.createFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		
		
		panel.setLayout(new GridLayout(2,2));
		
		JButton button = new JButton("Nuova Partita");
		panel.add(button);
		
		JTextPane matrixPane = new JTextPane();
		matrixPane.setEditable(false);
		panel.add(matrixPane);
		
		JTextField input = new JTextField();
		panel.add(input);
		
		MessageArea messageArea = new MessageArea(partita);
		messageArea.setEditable(false);
		JScrollPane scrollArea = new JScrollPane(messageArea);
		panel.add(scrollArea);
		
		
		KeyboardController controlloInvio = new KeyboardController(partita, input, messageArea);
		input.addKeyListener(controlloInvio);
		
		ButtonController controlloBottone = new ButtonController(partita, messageArea, matrixPane);
		controlloBottone.buttonClick(button);
		
		frame.getContentPane().add(panel);	
		frame.setVisible(true);
	}
	

}
