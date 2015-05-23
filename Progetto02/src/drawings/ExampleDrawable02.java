package drawings;

import java.awt.Graphics;

public class ExampleDrawable02 implements Drawable {

	@Override				//source->override implements method
	public void draw(Graphics g) {
		g.drawOval(10, 10, 1000, 1000);
		g.drawOval(50, 20, 50, 50);
		
	}
	
	
	
	
}
