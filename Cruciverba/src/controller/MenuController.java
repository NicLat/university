package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ProxyVerify;
import model.VerifyCrosses;
import model.VerifyOccurrences;
import model.VerifyPalindrome;
import view.MenuBar;

public class MenuController {
	
	private ProxyVerify verifica;
	private MenuBar bar;

	public MenuController(ProxyVerify verifica, MenuBar bar) {
		super();
		this.verifica = verifica;
		this.bar = bar;
	}
	
	public void setListeners(){
		bar.getItems()[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				verifica.setVerifica(new VerifyPalindrome());
			}
		});
		
		bar.getItems()[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				verifica.setVerifica(new VerifyOccurrences());
			}
		});
		
		bar.getItems()[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				verifica.setVerifica(new VerifyCrosses());
			}
		});
				
	}
	

}
