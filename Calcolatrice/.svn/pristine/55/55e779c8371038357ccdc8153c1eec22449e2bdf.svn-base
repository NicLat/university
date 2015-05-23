package view;

import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

import model.ScreenStr;

public class ScreenField extends JTextField implements Observer{
	
	private static final long serialVersionUID = 1L;
	
	private ScreenStr screen;

	public ScreenField(ScreenStr screen) {
		this.screen = screen;
		screen.addObserver(this);
		
		setText("Ciao frate'");
		
		setEditable(false);
		setFont(new Font("Courier", Font.PLAIN, 20));
		setHorizontalAlignment(JTextField.RIGHT);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		setText(screen.getScreen());
	}

}
