package appditest;

import javax.swing.JFrame;

/*
 * 
 */
public class FramesUtils {

	/**
	 * Crea un JFrame
	 * @param title
	 * @param dimX
	 * @param dimY
	 * @return JFrame
	 */
	public static JFrame createFrame(String title, int dimX, int dimY) {
		JFrame frame = new JFrame();
		frame.setSize(dimX, dimY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(title);
		return frame;
	}
	
	

}

