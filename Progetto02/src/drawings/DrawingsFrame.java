package drawings;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingsFrame{
	
	private Drawable drawable;
	
	public DrawingsFrame(Drawable drawable) {
		this.drawable = drawable;
	}
	
	public void launchFrame() {
		JPanel panel = new JPanel() {
			
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				draw(g);
			}
		};
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setTitle("Drawings");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
	public void draw(Graphics g) {
		drawable.draw(g);						//a run-time un' istanza di drawable per implementare draw è un bridge
	}
}
