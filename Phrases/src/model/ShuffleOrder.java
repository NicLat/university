package model;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleOrder implements IOrder{
	
	@Override
	public void sort(ArrayList<String> array) {
		Collections.shuffle(array);
	}
	
}
