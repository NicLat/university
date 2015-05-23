package operations;

import java.util.LinkedList;

import model.IOperation;

public class InsertLinkedListInteger implements IOperation{
	
	private LinkedList<Integer> array;
	long start;
	
	public InsertLinkedListInteger() {
		super();
		array = new LinkedList<Integer>();
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
