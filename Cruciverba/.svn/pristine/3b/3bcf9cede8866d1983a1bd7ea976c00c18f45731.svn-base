package test;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.ProxyVerify;
import model.VerifyPalindrome;
import view.ResultsPanel;

public class Test03 {
	
	public static void main(String[] args) {
		
		ProxyVerify verifica = new ProxyVerify(new VerifyPalindrome());
		
		ResultsPanel pan = new ResultsPanel(verifica);
		
		JFrame frame = Utils.createFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,1));
		
		panel.add(pan.getLabel());
		
		verifica.verify("anna");
		
		
		frame.getContentPane().add(panel);	
		frame.setVisible(true);
	}

}
