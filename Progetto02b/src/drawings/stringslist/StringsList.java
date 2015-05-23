package drawings.stringslist;

import java.awt.Color;
import java.awt.Graphics;

import drawings.Drawable;

public class StringsList implements Drawable {

		
	private String[] strings;
	
	private int index;
	
	private IPlacer placer;

	
	
	public void setPlacer(IPlacer placer){
		this.placer=placer;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}

	
	
	public StringsList(String... strings) {
		//super();
		this.strings = strings;
	}

	@Override
	public void draw(Graphics g) {
		for (int i = 0; i < strings.length; i++) {
			
			int position = i - index;
			
			if(position==0){
				g.setColor(Color.RED);
			} else {
				g.setColor(Color.BLACK);
			}
			
			int[] xy= new int[2];
			placer.place(position, xy);
			g.drawString(strings[i], xy[0], xy[1]);
		}	
	}

	public void up(){
		if(index >0)
			index--;
	}
	public void down(){
		if(index < strings.length-1)
			index++;
	}


}