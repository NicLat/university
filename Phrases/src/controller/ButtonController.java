package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import model.Phrases;

public class ButtonController{
	
	private Phrases frasi;
	
	public ButtonController(Phrases frasi) {
		super();
		this.frasi = frasi;	
	}
	
	public void buttonClick(final JTextField field, JButton button) {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frasi.addString(field.getText());
				field.setText("");
			}
		});
		
	}
	
}
