package controllo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import modello.Campo;

public class Menu {
	
	private Campo campo;
	private vista.MenuBar bar;
	
	
	public Menu(Campo campo, vista.MenuBar bar) {
		super();
		this.campo = campo;
		this.bar = bar;
	}

	public void setListeners(){
		
		bar.getOpzioni()[0].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				campo.setup(8, 8, 5);
			}
		});
		bar.getOpzioni()[1].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				campo.setup(8, 8, 15);
			}
		});
		bar.getOpzioni()[2].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				campo.setup(12, 12, 20);
			}
		});
		bar.getOpzioni()[3].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				campo.setup(12, 12, 30);
			}
		});
		bar.getOpzioni()[4].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				campo.setup(16, 16, 50);
			}
		});
		bar.getOpzioni()[5].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				campo.setup(16, 16, 70);
			}
		});
		bar.getOpzioni()[6].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String input = JOptionPane.showInputDialog("Indica lato e mine (lato,mine):");
				if (input!= null){
					try{
						int lato,mine;
						StringTokenizer tokenizer = new StringTokenizer(input, ",");
						lato = Integer.parseInt(tokenizer.nextToken());
						mine = Integer.parseInt(tokenizer.nextToken());
						campo.setup(lato, lato,mine);
					} catch (NoSuchElementException e) {
						JOptionPane.showMessageDialog(null, "Formattazione errata");
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Formattazione errata");
					}
			    }
				
			}
		});
		

		bar.getNuova().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				campo.setup(campo.getRighe(), campo.getColonne(), campo.getMine());
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
