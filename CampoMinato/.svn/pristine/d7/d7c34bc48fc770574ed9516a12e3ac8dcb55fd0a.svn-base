package controllo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import modello.MineException;
import modello.Campo;

public class Mouse implements MouseListener{

	JPanel panel;
	Campo campo;
		
	
	public Mouse(JPanel panel, Campo campo) {
		super();
		this.panel = panel;
		this.campo = campo;
	}

	private void paintSomething(MouseEvent e){
		
		int dimFissa = min(panel.getHeight(),panel.getWidth());
		
		int latoAltezza = dimFissa / campo.getRighe();		
		int latoLarghezza = dimFissa / campo.getColonne();
		
		int i = e.getY() / latoAltezza;
		int j = e.getX() / latoLarghezza;
		
		
		try {
			if(e.getButton() == MouseEvent.BUTTON1)
				campo.setCasellaIJ(i, j, 'F');
			else if(e.getButton() == MouseEvent.BUTTON3)
				campo.setCasellaIJ(i, j, 'P');
		} catch (MineException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
			campo.setup(campo.getRighe(), campo.getColonne(), campo.getMine());
		}
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
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
	

	private int min(int a, int b){
		if(a<b)
			return a;
		return b;		
	}
	
}
