package controllo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JTextArea;

import modello.Esercitatore;
import vista.Output;

public class ButtonController{
	
	private Esercitatore esercitatore;
	
	public ButtonController(Esercitatore esercitatore) {
		super();
		this.esercitatore = esercitatore;	
	}
	
	public void buttonClick(final Output out, final JTextArea in, JButton button, final int maxFrasi) {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				StringTokenizer tok = new StringTokenizer(out.getText(),":");
				String t = tok.nextToken();
				
				//System.out.println(t);
				
				if(t.equals("Corrette")){
					in.setText("");
					String frase = esercitatore.getNuovaFrase();
					if(frase != null)
						out.setText(frase);
					else
						out.setText("Frasi Finite");			
				}else{
					
					if(esercitatore.getNumeroFrasiTradotte()+1 >= maxFrasi){
						esercitatore.valutaFrase(out.getText(), in.getText());
						out.setText(esercitatore.getRisultati());
						esercitatore.iniziaEsercizio();
					}else{
						esercitatore.valutaFrase(out.getText(), in.getText());
						in.setText("");
						String frase = esercitatore.getNuovaFrase();
						if(frase != null)
							out.setText(frase);
						else
							out.setText("Frasi Finite");		
					}
	
				}
				
				

			}
		});
		
	}
	
}
