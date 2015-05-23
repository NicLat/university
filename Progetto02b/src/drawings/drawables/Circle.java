package drawings.drawables;

import java.awt.Graphics;

import drawings.Drawable;

public class Circle implements Drawable {
	
	private int x,y,ray;
	
	public Circle(int x, int y, int ray) {
		super();
		this.x = x;
		this.y = y;
		this.ray = ray;
	}


	@Override
	public void draw(Graphics g) {
		//g.setColor(Color.BLUE);
		g.fillOval(x-ray, y-ray, ray<<1, ray<<1);	//ray<<1 shifta di 1 a sx, equivale a moltiplicare per 2
	}

}
