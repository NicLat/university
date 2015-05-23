package tests;

import javax.swing.JFrame;

public class Utils {
	
	static JFrame createFrame() {
		JFrame frame = new JFrame();
		frame.setSize(500,630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Editor di Icone");
		return frame;
	}

}
