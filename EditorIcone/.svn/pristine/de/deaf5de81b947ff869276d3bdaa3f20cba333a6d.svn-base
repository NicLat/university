package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import files.Saver;

import model.Eraser;
import model.Hand;
import model.Icon;
import model.Paintbrush;
import model.Pencil;
import view.MenuBar;

public class MenuController {
	
	private Hand hand;
	private Icon icon;
	private MenuBar bar;
	private Saver saver;

	public MenuController(Hand hand, Icon icon, MenuBar bar, Saver saver) {
		super();
		this.hand = hand;
		this.icon = icon;
		this.bar = bar;
		this.saver = saver;
	}
	
	public void setListeners(){
		bar.getItemsDim()[0].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				icon.setDim(16);
			}
		});
		
		bar.getItemsDim()[1].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				icon.setDim(24);
			}
		});
		
		bar.getItemsDim()[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				icon.setDim(32);
			}
		});
		
		

		bar.getItemsStrumenti()[0].addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				hand.setInstrument(new Pencil());
			}
		});
		bar.getItemsStrumenti()[1].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				hand.setInstrument(new Eraser());
			}
		});
		bar.getItemsStrumenti()[2].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				hand.setInstrument(new Paintbrush());
			}
		});
		
		
		bar.getSalva().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				saver.save(icon, "icona.png");
			}
		});
				
	}
	

}
