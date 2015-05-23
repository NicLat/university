package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

import model.Phrases;

public class KeyboardController implements KeyListener{

	Phrases frasi;
	JTextField field;
		
	public KeyboardController(Phrases frasi,JTextField field) {
		super();
		this.frasi = frasi;
		this.field = field;
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			frasi.addString(field.getText());
			field.setText("");
		}
	}

	
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}
}
