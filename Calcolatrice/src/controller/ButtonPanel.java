package controller;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JButton[] numbers;
	private JButton[] operators;
	private JButton equal,c;
	
	public ButtonPanel() {
		super();
		
		numbers = new JButton[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = new JButton(String.valueOf(i));
			numbers[i].setFont(new Font("Courier", Font.BOLD, 40));
		}
		
		operators = new JButton[4];
		operators[0] = new JButton("+");
		operators[1] = new JButton("-");
		operators[2] = new JButton("*");
		operators[3] = new JButton("/");
		for (int i = 0; i < 4; i++) {
			operators[i].setFont(new Font("Courier", Font.BOLD, 40));
		}
		
		c = new JButton("C");
		c.setFont(new Font("Courier", Font.BOLD, 40));
		
		equal = new JButton("=");
		equal.setFont(new Font("Courier", Font.BOLD, 40));
		

		setLayout(new GridLayout(4,4));
		add(numbers[1]);
		add(numbers[2]);
		add(numbers[3]);
		add(operators[0]);
		add(numbers[4]);
		add(numbers[5]);
		add(numbers[6]);
		add(operators[1]);
		add(numbers[7]);
		add(numbers[8]);
		add(numbers[9]);
		add(operators[2]);
		add(numbers[0]);
		add(c);
		add(equal);		
		add(operators[3]);
	}

	public JButton[] getNumbers() {
		return numbers;
	}

	public JButton[] getOperators() {
		return operators;
	}

	public JButton getEqual() {
		return equal;
	}

	public JButton getC() {
		return c;
	}
	

}
