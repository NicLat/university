package tests;

import javax.swing.JFrame;

import model.Icon;
import view.Board;
import view.MenuBar;

public class Test01 {
	
	public static void main(String[] args) {
		
		Icon icon = new Icon(32);
		JFrame frame = Utils.createFrame();
		
	
		Board board = new Board(icon);
		frame.add(board);
		
		//MouseController contr = new MouseController(icon,board);
		//board.addMouseListener(contr);
		//board.addMouseMotionListener(contr);
		
		
		MenuBar bar = new MenuBar();
		frame.setJMenuBar(bar.getBar());
		
		frame.getContentPane().add(board);	
		frame.setVisible(true);
	}

}
