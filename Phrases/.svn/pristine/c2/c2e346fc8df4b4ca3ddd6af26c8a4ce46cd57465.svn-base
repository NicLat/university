package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ZAOrder implements IOrder, Comparator<String>{
	
	@Override
	public void sort(ArrayList<String> array) {
		Collections.sort(array, this);
	}
		
	@Override
	public int compare(String a, String b) {
		return b.compareTo(a);
	}
	
}
