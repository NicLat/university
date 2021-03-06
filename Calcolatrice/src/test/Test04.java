package test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Calculator;
import model.ScreenStr;
import view.ScreenField;
import controller.ButtonPanel;
import controller.ButtonsController;
import controller.KeyBindingsActions;

public class Test04 {

	public static void main(String[] args) {
		
		JFrame frame = Utils.createFrame();
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		frame.add(panel);
		
		ScreenStr schermo = new ScreenStr();
		Calculator calcolatrice = new Calculator(schermo);
		
		ScreenField field= new ScreenField(schermo);
		panel.add(field,BorderLayout.CENTER);
		
		ButtonPanel butt = new ButtonPanel();
		panel.add(butt, BorderLayout.PAGE_END);
		
		ButtonsController buttContr = new ButtonsController(calcolatrice, butt, schermo);
		buttContr.setListeners();
		
		KeyBindingsActions bind = new KeyBindingsActions(calcolatrice, schermo, frame);
		bind.setBindings();
		
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
}
