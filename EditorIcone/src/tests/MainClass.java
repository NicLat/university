package tests;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import model.Hand;
import model.Icon;
import model.Pencil;
import view.Board;
import view.GrayPanel;
import view.MenuBar;
import controller.DataController;
import controller.MenuController;
import controller.MouseController;
import files.PNGSaver;
import files.Saver;

public class MainClass {
	
	public static void main(String[] args) {
		
		Icon icon = new Icon(16);
		Hand hand = new Hand(new Pencil(), icon, 1, new Color(131, 29, 28) );
				
		JFrame frame = Utils.createFrame();
		frame.setLayout(new BorderLayout());
		
		DataController dataContr = new DataController(hand, icon);
		frame.add(dataContr, BorderLayout.NORTH);
		
		Board board = new Board(icon);
		frame.add(board, BorderLayout.CENTER);
		
		GrayPanel graypan = new GrayPanel(icon);
		frame.add(graypan, BorderLayout.SOUTH);
		
		Saver saver = new Saver(icon, new PNGSaver());
		

		MenuBar bar = new MenuBar();
		frame.setJMenuBar(bar.getBar());
		
		
		MouseController mouseContr = new MouseController(icon,hand,board);
		board.addMouseListener(mouseContr);
		board.addMouseMotionListener(mouseContr);
		
		MenuController menuContr = new MenuController(hand, icon, bar, saver);
		menuContr.setListeners();
		
		
		frame.getContentPane().add(board);	
		frame.setVisible(true);
	}

}
