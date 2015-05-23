package tests;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.Comparator;
import ui.ButtonController;
import ui.CheckController;
import ui.InputPanel;
import ui.ResultArea;

public class Test02 {

	public static void main(String[] args) {
		
		Comparator confrontatore = new Comparator();
		JFrame frame = Utils.createFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		InputPanel input = new InputPanel();
		input.addOperation("Inserimento di interi in un ArrayList");
		input.addOperation("Inserimento di interi in una LinkedList");
		input.addOperation("Ordinamento ArrayList di interi con Collections.sort()");
		input.addOperation("Ordinamento vettore di interi con Arrays.sort()");
		input.addOperation("Ordinamento ArrayList di interi con BubbleSort implementato");
		input.addOperation("Ordinamento ArrayList di stringhe con Collections.sort()");
		input.addOperation("Ordinamento LinkedList di stringhe con Collections.sort()");
		input.build();
		JScrollPane scrollInput = new JScrollPane(input);
		panel.add(scrollInput,BorderLayout.NORTH);
		
		
		JButton button = new JButton("Confronta");
		panel.add(button,BorderLayout.CENTER);
		
		ResultArea results = new ResultArea();
		panel.add(results,BorderLayout.SOUTH);
		
		CheckController checkcontr = new CheckController(confrontatore, input);
		ButtonController buttoncontr = new ButtonController(confrontatore, results, input, checkcontr);
		buttoncontr.setButton(button);
		
		
		
		frame.getContentPane().add(panel);	
		frame.setVisible(true);
	}
	
}
