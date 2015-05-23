package operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import model.IOperation;

public class SortArrayListIntegerCollSort implements IOperation{

	private ArrayList<Integer> array;
	long start;
	
	public SortArrayListIntegerCollSort() {
		super();
		array = new ArrayList<Integer>();
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
			array.add(rand.nextInt());
		}
	}
	
}
