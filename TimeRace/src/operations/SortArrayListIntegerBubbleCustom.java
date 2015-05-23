package operations;

import java.util.ArrayList;
import java.util.Random;

import model.IOperation;

public class SortArrayListIntegerBubbleCustom implements IOperation{

	private ArrayList<Integer> array;
	long start;
	
	public SortArrayListIntegerBubbleCustom() {
		super();
		array = new ArrayList<Integer>();
	}

	@Override
	public long timeOperation(int n) {
		initialize(n);
		
		start = System.nanoTime();
		bubbleSort();
		
		return System.nanoTime() - start;
	}

	private void initialize(int n) {
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			array.add(rand.nextInt());
		}
	}
	
	private void bubbleSort(){
		for (int i = 0; i < array.size(); i++) {
			for (int j = i+1; j < array.size(); j++) {
				if( array.get(i) > array.get(j) ){
					int temp = array.get(i);
					array.set(i, array.get(j));
					array.set(j, temp);
				}
			}
		}
		
	}
	
}
