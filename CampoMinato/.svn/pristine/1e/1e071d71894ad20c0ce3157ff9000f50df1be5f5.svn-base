package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import modello.Campo;

public class Terra extends JPanel implements Observer{
	
	private static final long serialVersionUID = 1L;
	
	Campo campo;

	public Terra(Campo campo) {
		super();
		this.campo = campo;
		this.campo.addObserver(this);
		
		repaint();
	}
 
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int dimFissa = min(getHeight(),getWidth());
		
		int latoAltezza = dimFissa / campo.getRighe();		
		int latoLarghezza = dimFissa / campo.getColonne();
		int currentX = 0, currentY = 0;
		
		g.setFont(new Font("Courier", Font.BOLD, (latoAltezza+latoLarghezza)/4));	//dimFissa/18
				
		for (int i = 0; i < campo.getRighe(); i++) {
			for (int j = 0; j < campo.getColonne(); j++) {

				char stampa = campo.getCarattereVista(i, j);
				g.setColor(getColore(stampa));
				g.drawString(String.valueOf(stampa), currentX+latoAltezza*3/8, currentY+latoLarghezza*2/3);
				g.setColor(Color.BLACK);	
				// g.drawString(String.valueOf(campo.getCasellaIJ(i, j).getContenuto()), currentX+latoAltezza*3/8, currentY+latoLarghezza*2/3);

				g.drawRect(currentX, currentY, latoLarghezza, latoAltezza);
				currentX += latoLarghezza;
			}
			currentX = 0;
			currentY += latoAltezza;
		}
		
		
	}

	private Color getColore(char num){
		switch (num) {
		case '1': 
			return Color.BLUE;
		case '2': 
			return Color.GREEN;
		case '3':
			return Color.RED;
		case '4': 
			return new Color(153,0,153);
		case '5': 
			return new Color(102,0,0);
		case '6':
			return Color.CYAN;
		case '7': 
			return Color.BLACK;
		case '8': 
			return Color.GRAY;
		}
		return Color.BLACK;
	}
	
	private int min(int a, int b){
		if(a<b)
			return a;
		return b;		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}

}
