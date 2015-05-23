package controllo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import modello.Partita;

public class ButtonController{
	
	private Partita partita;
	private JTextArea messageArea;
	private JTextPane panMatrice;
		

	public ButtonController(Partita partita, JTextArea messageArea,
			JTextPane panMatrice) {
		super();
		this.partita = partita;
		this.messageArea = messageArea;
		this.panMatrice = panMatrice;
	}

	public void buttonClick(JButton button) {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				partita.start(30);
				
				messageArea.setText("");
				
				String t="";
				for (int i = 0; i < partita.getMatrice().length; i++) {
					for (int j = 0; j < partita.getMatrice()[i].length; j++) {
						t += partita.getMatrice()[i][j] + " ";
					}
					t += "\n";
				}
				panMatrice.setText(t);
				
			}
		});
		
	}
	
}
