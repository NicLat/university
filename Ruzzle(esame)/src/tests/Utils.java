package tests;


import javax.swing.JFrame;

public class Utils {

	static JFrame createFrame() {
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Trova Parole");
		return frame;
	}


}
