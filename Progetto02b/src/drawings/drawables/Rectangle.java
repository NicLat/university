package drawings.drawables;

import java.awt.Graphics;

import drawings.Drawable;

public class Rectangle implements Drawable {
	
	private int x,y,width,heigth;
	
	public Rectangle(int x, int y, int width, int heigth) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
	}


	@Override
	public void draw(Graphics g) {
		g.fillRect(x, y, width, heigth);
		//g.drawRect(y, x, heigth, width);

	}

}
