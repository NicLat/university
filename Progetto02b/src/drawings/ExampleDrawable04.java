package drawings;

import java.awt.Graphics;

public class ExampleDrawable04 implements Drawable {

	@Override
	public void draw(Graphics g) {
		g.drawOval(100, 100, 100, 100);
		g.drawOval(50, 50, 50, 50);
		
	}
	
	
	
	
}
