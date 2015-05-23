package drawings.tests;

import java.awt.Color;

import drawings.Drawable;
import drawings.DrawingsFrame;
import drawings.drawables.Circle;
import drawings.drawables.ColouredDrawables;
import drawings.drawables.CompositeDrawable;
import drawings.drawables.Rectangle;

public class DrawablesTest03 {

	public static void main(String[] args) {
		
		Drawable[] drawables={	new ColouredDrawables(new Rectangle(10,10,50,50),Color.GREEN),
								new ColouredDrawables(new Rectangle(60,10,50,50),Color.WHITE),
								new ColouredDrawables(new Rectangle(110,10,50,50),Color.RED),
								new ColouredDrawables(new Circle(100,200,50),Color.YELLOW),
								new ColouredDrawables(new Circle(200,200,50),Color.GREEN)
							};
		
		
		DrawingsFrame frame2 = new DrawingsFrame(new CompositeDrawable(drawables));
		frame2.launchFrame();
		
		
		
		
		
	}
}
