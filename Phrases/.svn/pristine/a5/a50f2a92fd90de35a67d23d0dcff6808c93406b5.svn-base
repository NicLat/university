package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;

public class InputAreaController{
	
	public InputAreaController() {
		super();
	}
	
	public void areaClick(final JTextField field) {
		field.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				field.setText("");
				super.mouseClicked(e);
			}
		});
		
	}
	
}
