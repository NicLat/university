package controllo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

import modello.Esercitatore;

public class Menu {
	
	private Esercitatore esercitatore;
	private vista.BarraMenu bar;
	
	
	public Menu(Esercitatore esercitatore, vista.BarraMenu bar) {
		super();
		this.esercitatore = esercitatore;
		this.bar = bar;
	}

	public void setListeners(){

		bar.getApri().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser filechooser = new JFileChooser();
				filechooser.showOpenDialog(bar);
				File f = filechooser.getSelectedFile();
				String nomefile = f.getName();
				
				esercitatore.aggiungiFrasi(nomefile);
			}
		});
		
		bar.getEsci().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 System.exit(0);
			}
		});
				
	}
	

}
