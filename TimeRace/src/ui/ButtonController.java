package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Comparator;
import model.TimeFormat;

public class ButtonController{
	
	private Comparator confrontatore;
	private ResultArea results;
	private InputPanel input;
	private CheckController checkcontr;
	
	public ButtonController(Comparator confrontatore, ResultArea results, InputPanel input, CheckController checkcontr) {
		super();
		this.confrontatore = confrontatore;
		this.results = results;
		this.input = input;
		this.checkcontr = checkcontr;
	}
	
	public void setButton(JButton button) {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					confrontatore.setN(Integer.parseInt((input.getN().getText())));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Inserisci numero elementi collezione!");
				} catch (NException e) {
					JOptionPane.showMessageDialog(null, e.message);
				}
				
				results.setText("");
				//TODO exception limits N
				
				checkcontr.setOperators();
				
				ArrayList<TimeFormat> times = confrontatore.execute();
				results.setResults(input, times);
			}
		});
		
	}
	
}
