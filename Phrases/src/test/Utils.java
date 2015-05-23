package test;


import javax.swing.JFrame;

public class Utils {

	static JFrame createFrame() {
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Phrases Sorter");
		return frame;
	}

}
