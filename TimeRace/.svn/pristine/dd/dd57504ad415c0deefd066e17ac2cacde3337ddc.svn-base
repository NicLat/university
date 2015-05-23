package operations;

import java.util.ArrayList;

import model.IOperation;

public class InsertArrayListInteger implements IOperation{
	
	private ArrayList<Integer> array;
	long start;
	
	public InsertArrayListInteger() {
		super();
		array = new ArrayList<Integer>();
	}

	@Override
	public long timeOperation(int n) {
		
		start = System.nanoTime();
		
		for (int i = 0; i < n; i++) {
			array.add(i);
		}
		
		return System.nanoTime() - start;
	}

}
