package operations;

import java.util.Arrays;
import java.util.Random;

import model.IOperation;

public class SortArrayIntegerArrSort implements IOperation{

	private int[] array;
	long start;
	
	public SortArrayIntegerArrSort() {
		super();
	}

	@Override
	public long timeOperation(int n) {
		initialize(n);
		
		start = System.nanoTime();
		Arrays.sort(array);
		
		return System.nanoTime() - start;
	}

	private void initialize(int n) {
		
		array = new int[n];
		
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = rand.nextInt();
		}
	}
	
}
