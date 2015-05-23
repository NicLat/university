package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.Icon;

public class Board extends JPanel implements Observer {
	
	private static final long serialVersionUID = 1L;
	
	Icon icon;
	
	public Board(Icon icon) {
		this.icon=icon;	
		icon.addObserver(this);
			
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics a) {
		super.paintComponent(a);
		
		int singleHeight = getHeight() /  icon.getDimension();
		int singleWidth = getWidth() / icon.getDimension();
		int currentX = 0, currentY = 0;
		
		
		for (int i = 0; i < icon.getDimension(); i++) {
			for (int j = 0; j < icon.getDimension(); j++) {
				a.setColor(icon.getColorIJ(i, j));
				a.fillRect(currentX, currentY, singleWidth, singleHeight);
				currentX += singleWidth;
			}
			currentX = 0;
			currentY += singleHeight;
		}
		
	}
	
	@Override
	public void update(Observable o, Object a) {
		//paint();
		repaint();
	}
	
	
	
	/*
	private void paint(){	
		// rifare con le drawRect
		this.setLayout(new GridLayout(icon.getDim(),icon.getDim()));
		this.removeAll();
		
		JPanel[][] p = new JPanel[icon.getDim()][icon.getDim()];
		
		for (int i = 0; i < icon.getDim(); i++) {
			for (int j = 0; j < icon.getDim(); j++) {
				p[i][j] = new JPanel();
				p[i][j].setBackground(icon.getColorIJ(i, j));
				this.add(p[i][j]);				
			}
		}
		validate();		
	}
	*/
}
