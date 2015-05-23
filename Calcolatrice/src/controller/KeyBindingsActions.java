package controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

import model.Calculator;
import model.CalculatorException;
import model.Divide;
import model.Multiply;
import model.ScreenStr;
import model.Subtract;


public class KeyBindingsActions{

	private Calculator calcolatrice;
	private ScreenStr schermo;
	private JFrame frame;
	
	
	
	public KeyBindingsActions(Calculator calcolatrice, ScreenStr schermo, JFrame frame) {
		super();
		this.calcolatrice = calcolatrice;
		this.schermo = schermo;
		this.frame = frame;
	}
	

	public void setBindings(){
		
		Action enter = new EnterAction();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "enter");
		frame.getRootPane().getActionMap().put("enter", enter);
		
		
		Action plus = new SumAction();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_ADD,0), "plus");
		frame.getRootPane().getActionMap().put("plus", plus);
		
		Action minus = new SubtractAction();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT,0), "minus");
		frame.getRootPane().getActionMap().put("minus", minus);
		
		Action slash = new DivideAction();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE,0), "slash");
		frame.getRootPane().getActionMap().put("slash", slash);
		
		Action asterisc= new MultiplyAction();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY,0), "asterisc");
		frame.getRootPane().getActionMap().put("asterisc", asterisc);
		
		Action clear = new ClearAction();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_C,0), "clear");
		frame.getRootPane().getActionMap().put("clear", clear);
		
		
		Action zero = new Number0();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0,0), "zero");
		frame.getRootPane().getActionMap().put("zero", zero);
		
		Action one = new Number1();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1,0), "one");
		frame.getRootPane().getActionMap().put("one", one);
		
		Action two = new Number2();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2,0), "two");
		frame.getRootPane().getActionMap().put("two", two);
		
		Action three = new Number3();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3,0), "three");
		frame.getRootPane().getActionMap().put("three", three);
		
		Action four = new Number4();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4,0), "four");
		frame.getRootPane().getActionMap().put("four", four);
		
		Action five = new Number5();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5,0), "five");
		frame.getRootPane().getActionMap().put("five", five);
		
		Action six = new Number6();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6,0), "six");
		frame.getRootPane().getActionMap().put("six", six);
		
		Action seven = new Number7();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7,0), "seven");
		frame.getRootPane().getActionMap().put("seven", seven);
		
		Action eight = new Number8();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8,0), "eight");
		frame.getRootPane().getActionMap().put("eight", eight);
		
		Action nine = new Number9();
		frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put( KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9,0), "nine");
		frame.getRootPane().getActionMap().put("nine", nine);
		
	}



	public class EnterAction extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				calcolatrice.calculate(schermo.getScreen());
			} catch (CalculatorException e1) {
				schermo.clearScreen();
				schermo.setScreen(e1.getMessage());
			}
			calcolatrice.setOperator(null);
		}
	}

	public class SumAction extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			calcolatrice.setOperator(new model.Sum());
			schermo.appendScreen(" + ");
		}
	}
	public class SubtractAction extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			if (calcolatrice.getOperator() != null || schermo.isEmpty()){
				schermo.appendScreen("-");
			}else{
				calcolatrice.setOperator(new Subtract());
				schermo.appendScreen(" - ");
			}
		}
	}
	public class MultiplyAction extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			calcolatrice.setOperator(new Multiply());
			schermo.appendScreen(" * ");
		}
	}
	public class DivideAction extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			calcolatrice.setOperator(new Divide());
			schermo.appendScreen(" / ");
		}
	}
	public class ClearAction extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			schermo.clearScreen();
			calcolatrice.setOperator(null);
		}
	}
	

	public class Number0 extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			schermo.appendScreen("0");
		}
	}
	public class Number1 extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			schermo.appendScreen("1");
		}
	}
	public class Number2 extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			schermo.appendScreen("2");
		}
	}
	public class Number3 extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			schermo.appendScreen("3");
		}
	}
	public class Number4 extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			schermo.appendScreen("4");
		}
	}
	public class Number5 extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			schermo.appendScreen("5");
		}
	}
	public class Number6 extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			schermo.appendScreen("6");
		}
	}
	public class Number7 extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			schermo.appendScreen("7");
		}
	}
	public class Number8 extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			schermo.appendScreen("8");
		}
	}
	public class Number9 extends AbstractAction{
		private static final long serialVersionUID = 1L;
		@Override
		public void actionPerformed(ActionEvent e) {
			schermo.appendScreen("9");
		}
	}
	
}
