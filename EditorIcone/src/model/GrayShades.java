package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class GrayShades implements Observer{
	
	Icon icon;
	ArrayList<Float> shades;
	
	public GrayShades(Icon icon) {
		super();
		this.icon = icon;
		
		icon.addObserver(this);
		
		shades = new ArrayList<Float>();
		updateArray(icon);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		updateArray(icon);
	}

	private void updateArray(Icon icon) {
		shades.clear();
		for (int i = 0; i < icon.getDimension(); i++) {
			for (int j = 0; j < icon.getDimension(); j++) {
				float gray = getGrayShade(icon.getColorIJ(i, j));	
				shades.add(gray);
			}
		}
	}

	public float getMin() {
		float min = (float) 255;
		for (int i = 0; i < shades.size(); i++) {
			if (shades.get(i) < min)
				min = shades.get(i);
		}
		
		return min;
	}
	
	public float getMax() {
		float max = 0;
		for (int i = 0; i < shades.size(); i++) {
			if (shades.get(i) > max)
				max = shades.get(i);
		}
		return max;
	}
	
	public float getAvg() {
		double sum = 0;
		for (int i = 0; i < shades.size(); i++) {
			sum += shades.get(i);
		}
		return (float) sum/shades.size();
	}
	
	private float getGrayShade(Color color) {
		int red = color.getRed();
		int green = color.getGreen();
		int blue = color.getBlue();
		float grey = (float) (0.3*red + 0.59*green + 0.11*blue);
		return grey;
	}
	
}
