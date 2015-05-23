package model;

import java.awt.Color;

public class Hand implements IInstrument{

	IInstrument instrument;
	Icon icon;
	
	int dimension;  //only for the paintbrush
	
	Color color;

	public Hand(IInstrument instrument, Icon icon, int dimension, Color color) {
		super();
		this.instrument = instrument;
		this.icon = icon;
		this.color = color;
	}

	public IInstrument getInstrument() {
		return instrument;
	}

	public void setInstrument(IInstrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void use(Icon icon, int i, int j, Color color, int dimension) {
		instrument.use(icon, i, j, color, dimension);	
	}


	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	
}
