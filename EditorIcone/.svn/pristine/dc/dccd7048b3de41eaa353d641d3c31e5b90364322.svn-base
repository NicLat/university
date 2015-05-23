package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import model.Hand;
import model.Icon;

public class MouseController implements MouseListener,MouseMotionListener{

	JPanel panel;
	Icon icon;
	Hand hand;
		
	public MouseController(Icon icon, Hand hand, JPanel panel) {
		super();
		this.icon = icon;
		this.panel = panel;
		this.hand = hand;
	}
	
	private void paintSomething(MouseEvent e){
		
		int heightInterval = panel.getHeight()/icon.getDimension();
		int witdhInterval = panel.getWidth()/icon.getDimension();
		
		int i = e.getY() / heightInterval;
		int j = e.getX() / witdhInterval;
		
		//System.out.println(i+" "+j);
		hand.use(icon, i, j, hand.getColor(), hand.getDimension());
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		paintSomething(e);		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		paintSomething(e);	
	}
	

	
	
	
	
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
