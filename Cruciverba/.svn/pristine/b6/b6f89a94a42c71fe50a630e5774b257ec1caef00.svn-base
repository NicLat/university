package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

import model.ProxyVerify;

public class KeyboardController implements KeyListener{

	ProxyVerify verifica;
	JTextField field;
		
	public KeyboardController(ProxyVerify verifica,JTextField field) {
		super();
		this.verifica = verifica;
		this.field = field;
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			String str = field.getText();
			if (!str.isEmpty())
				verifica.verify(field.getText());
			field.setText("");
		}
	}

	
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}
}
