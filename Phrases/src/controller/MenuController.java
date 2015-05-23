package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.AZOrder;
import model.Phrases;
import model.ShuffleOrder;
import model.ZAOrder;
import view.MenuBar;

public class MenuController {
	
	private Phrases frasi;
	private MenuBar bar;

	public MenuController(Phrases frasi, MenuBar bar) {
		super();
		this.frasi = frasi;
		this.bar = bar;
	}
	
	public void setListeners(){
		bar.getItems()[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frasi.setOrder(new AZOrder());
			}
		});
		
		bar.getItems()[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frasi.setOrder(new ZAOrder());
			}
		});
		
		bar.getItems()[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frasi.setOrder(new ShuffleOrder());
			}
		});
		
	}
	

}
