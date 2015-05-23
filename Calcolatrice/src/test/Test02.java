package test;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test02 {

	public static void main(String[] args) {
		
		JFrame frame = Utils.createFrame();
		frame.setLayout(new BorderLayout());
		
		JTextField field = new JTextField("ciao CIAO");
		field.setEditable(false);
		field.setHorizontalAlignment(JTextField.RIGHT);
		frame.add(field,BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4,4));
		
	
		buttonPanel.add(new JButton("1"));
		buttonPanel.add(new JButton("2"));
		buttonPanel.add(new JButton("3"));
		buttonPanel.add(new JButton("+"));
		buttonPanel.add(new JButton("4"));
		buttonPanel.add(new JButton("5"));
		buttonPanel.add(new JButton("6"));
		buttonPanel.add(new JButton("-"));
		buttonPanel.add(new JButton("7"));
		JButton b = new JButton("8");
		b.setFont(new Font("Courier", Font.BOLD, 40));
		buttonPanel.add(b);
		buttonPanel.add(new JButton("9"));
		buttonPanel.add(new JButton("*"));

		buttonPanel.add(new JLabel());
		buttonPanel.add(new JLabel());
		buttonPanel.add(new JButton("0"));
		buttonPanel.add(new JButton("/"));
		
		
		
		frame.add(buttonPanel, BorderLayout.PAGE_END);
		
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
