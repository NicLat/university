package controller;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Hand;
import model.Icon;

public class DataController extends JPanel implements KeyListener{
	
	private static final long serialVersionUID = 1L;
	
	private Hand hand;
	Icon icon;
	JTextField r,g,b,dim;
	
	public DataController(Hand hand, Icon icon) {
		super();
		this.hand = hand;
		this.icon = icon;
		
		setLayout(new GridLayout(2,3));
		JLabel dimL = new JLabel("Dimensione");
		dim = new JTextField();
		dim.setText(String.valueOf(hand.getDimension()));
		dim.addKeyListener(this);
		JLabel colL = new JLabel("Colore");
		
		JPanel panColor = new JPanel();
		panColor.setLayout(new GridLayout(1,6));	
		panColor.add(new JLabel("R: ", JLabel.RIGHT));
		r = new JTextField();
		r.setText(String.valueOf(hand.getColor().getRed()));
		r.addKeyListener(this);
		panColor.add(r);
		panColor.add(new JLabel("G: ", JLabel.RIGHT));
		g = new JTextField();
		g.setText(String.valueOf(hand.getColor().getGreen()));
		g.addKeyListener(this);
		panColor.add(g);
		panColor.add(new JLabel("B: ", JLabel.RIGHT));
		b = new JTextField();
		b.setText(String.valueOf(hand.getColor().getBlue()));
		b.addKeyListener(this);
		panColor.add(b);
		
		
		add(dimL);
		add(new JLabel());
		add(colL);
		add(dim);
		add(new JLabel());
		add(panColor);
		
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			
			try {
				hand.setColor(new Color(Integer.parseInt(r.getText()), Integer.parseInt(g.getText()), Integer.parseInt(b.getText()) ));
				hand.setDimension(Integer.parseInt(dim.getText()));
			} catch (NumberFormatException e1) {
				// Nada
			} catch (IllegalArgumentException e2) {
				// Nada
			}
			
		}
	}

	
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}
}
