package drawings;

import java.awt.Graphics;

public class ExampleDrawable03 implements Drawable {

	@Override
	public void draw(Graphics g) {
		g.drawRect(60, 68, 29, 100);
		g.draw3DRect(216, 96, 6, 6, true);
		
	}
	
	
	
	
}
