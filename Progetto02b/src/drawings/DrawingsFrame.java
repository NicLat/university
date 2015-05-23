package drawings;

import java.awt.Graphics;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingsFrame{
	
	private Drawable drawable;
	private JPanel panel;
	private JFrame frame;
	
	public DrawingsFrame(Drawable drawable) {
		this.drawable = drawable;
	}
	
	public void launchFrame() {
		this.panel = new JPanel() {
			
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				draw(g);
			}
		};
		this.frame = new JFrame();
		frame.setSize(600, 600);
		frame.setTitle("Drawings");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
	public void draw(Graphics g) {
		drawable.draw(g);						//a run-time un' istanza di drawable per implementare draw è un bridge
	}
	
	public JPanel getPanel() {
		return panel;
	}
	
	public void addKeyLisener(KeyListener keyListener){
		frame.addKeyListener(keyListener);
		panel.addKeyListener(keyListener);
	}
}
