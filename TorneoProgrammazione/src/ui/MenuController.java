package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import modello.Segreteria;

public class MenuController {
	
	private Segreteria segreteria;
	private BarraMenu bar;
	private JTextArea output;
	
	
	public MenuController(Segreteria segreteria, BarraMenu bar, JTextArea output) {
		super();
		this.segreteria = segreteria;
		this.bar = bar;
		this.output = output;
	}

	public void setListeners(){

		bar.getTeam().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				output.setText(segreteria.getClassificaTeams());
			}
		});
		
		bar.getFacolta().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 output.setText(segreteria.getClassificaFacolta());
			}
		});
				
	}
	

}
