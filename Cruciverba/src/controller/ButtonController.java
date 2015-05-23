package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import model.ProxyVerify;

public class ButtonController{
	
	private ProxyVerify verifica;
	
	public ButtonController(ProxyVerify verifica) {
		super();
		this.verifica = verifica;	
	}
	
	public void buttonClick(final JTextField field, JButton button) {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String str = field.getText();
				if (!str.isEmpty())
					verifica.verify(field.getText());
				field.setText("");
			}
		});
		
	}
	
}
