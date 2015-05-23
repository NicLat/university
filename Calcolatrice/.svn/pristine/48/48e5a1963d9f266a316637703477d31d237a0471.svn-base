package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import model.Calculator;
import model.CalculatorException;
import model.Divide;
import model.Multiply;
import model.ScreenStr;
import model.Subtract;
import model.Sum;

@Deprecated
public class KeyboardController implements KeyListener{

	Calculator calcolatrice;
	ScreenStr schermo;
	JPanel panel;

	public KeyboardController(Calculator calcolatrice, ScreenStr schermo,
			JPanel panel) {
		super();
		this.calcolatrice = calcolatrice;
		this.schermo = schermo;
		this.panel = panel;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
				
		switch (e.getKeyCode()){
		case KeyEvent.VK_NUMPAD0:		schermo.appendScreen("0");
								break;
		case KeyEvent.VK_NUMPAD1:		schermo.appendScreen("1");
								break;
		case KeyEvent.VK_NUMPAD2:		schermo.appendScreen("2");
								break;
		case KeyEvent.VK_NUMPAD3:		schermo.appendScreen("3");
								break;
		case KeyEvent.VK_NUMPAD4:		schermo.appendScreen("4");
								break;
		case KeyEvent.VK_NUMPAD5:		schermo.appendScreen("5");
								break;
		case KeyEvent.VK_NUMPAD6:		schermo.appendScreen("6");
								break;
		case KeyEvent.VK_NUMPAD7:		schermo.appendScreen("7");
								break;
		case KeyEvent.VK_NUMPAD8:		schermo.appendScreen("8");
								break;
		case KeyEvent.VK_NUMPAD9:		schermo.appendScreen("9");
								break;
		
		case KeyEvent.VK_PLUS:		calcolatrice.setOperator(new Sum());
									schermo.appendScreen(" + ");	
									break;
		case KeyEvent.VK_MINUS:		if (calcolatrice.getOperator() != null || schermo.isEmpty()){
										schermo.appendScreen("-");
									}else{
										calcolatrice.setOperator(new Subtract());
										schermo.appendScreen(" - ");
									}
									break;
		case KeyEvent.VK_MULTIPLY:	calcolatrice.setOperator(new Multiply());
									schermo.appendScreen(" * ");
									break;
		case KeyEvent.VK_DIVIDE:		calcolatrice.setOperator(new Divide());
									schermo.appendScreen(" / ");
									break;
									
		case KeyEvent.VK_C:			schermo.clearScreen();
									calcolatrice.setOperator(null);
									break;	
	
		case KeyEvent.VK_ENTER:
									try {
										calcolatrice.calculate(schermo.getScreen());
									} catch (CalculatorException e1) {
										schermo.clearScreen();
										schermo.setScreen(e1.getMessage());
									}
									calcolatrice.setOperator(null);
									break;
		default:break;
		}
		
		panel.setFocusable(true);
	}
	

	@Override
	public void keyTyped(KeyEvent e) {	}
	@Override
	public void keyReleased(KeyEvent e) {}
	
}
