package operations;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

import model.IOperation;

public class SortLinkedListStringCollSort implements IOperation{

	private LinkedList<String> array;
	long start;
	
	public SortLinkedListStringCollSort() {
		super();
		array = new LinkedList<String>();
	}

	@Override
	public long timeOperation(int n) {
		initialize(n);
		
		start = System.nanoTime();
		Collections.sort(array);
		
		return System.nanoTime() - start;
	}

	private void initialize(int n) {
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			String s="";
			for (int j = 0; j < 6; j++) {
				s += (char)(97 + rand.nextInt(25));
			}
			array.add(s);
		}
	}
	
}
