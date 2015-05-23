package model;

import java.awt.Color;
import java.util.Observable;

public class Icon extends Observable{
	
	private Color[][] matrix;
	int dimension;
	
	public Icon(int dim) {
		super();
		setDim(dim);
	}

	public void setColorIJ(Color color, int i, int j) {
		try {
			matrix[i][j] = color;
			setChanged();
			notifyObservers();
		} catch (ArrayIndexOutOfBoundsException e) {
			//Niente
		}
	}
	
	public Color getColorIJ(int i, int j) {
		try {
			return matrix[i][j];
		} catch (ArrayIndexOutOfBoundsException e) {
			return Color.WHITE;
		}
	}

	public void setDim(int dim) {
		if (dim<=16)
			this.dimension = 16;
		else if (dim<=24)
			this.dimension = 24;
		else
			this.dimension = 32;
		
		initializeMatrix();
		
		setChanged();
		notifyObservers();
	}
	
	private void initializeMatrix(){
		this.matrix = new Color[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				matrix[i][j] = Color.WHITE;
			}
		}
	}
	
	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	
	

}
