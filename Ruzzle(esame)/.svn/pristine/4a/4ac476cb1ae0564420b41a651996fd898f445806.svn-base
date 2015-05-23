package controllo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import modello.Partita;

public class KeyboardController implements KeyListener{

	Partita partita;
	JTextField field;
	JTextArea messageArea;
	
	
	public KeyboardController(Partita partita, JTextField field,
			JTextArea messageArea) {
		super();
		this.partita = partita;
		this.field = field;
		this.messageArea = messageArea;
	}


	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			
			String str = field.getText();
			
			if(partita.getStatoPartita() == true){
				if (str.isEmpty() == false){
					int punti = partita.puntiParola(str.trim());
					
					if (punti <= 0){			
						messageArea.setText(str.trim() + " [Errata]" + "\n" + messageArea.getText()  );
					}else{
						messageArea.setText(str.trim() + " [Corretta]" + "\n" + messageArea.getText()  );
					}
				}
			}
			
			field.setText("");
			
		}
	}

	
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}
}
