package test;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.ProxyVerify;
import model.VerifyPalindrome;
import view.MenuBar;

public class MainClass {
	
	public static void main(String[] args) {
		
		ProxyVerify verifica = new ProxyVerify(new VerifyPalindrome());
		
		JFrame frame = Utils.createFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		
		panel.add(Utils.createInputPanel(verifica));
		panel.add(Utils.createOutputPanel(verifica));	
		
		MenuBar bar = Utils.createMenuBar(verifica);
		frame.setJMenuBar(bar.getBar());
		
		frame.getContentPane().add(panel);	
		frame.setVisible(true);
	}
}
