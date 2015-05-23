package tests;

import java.util.ArrayList;

import model.Comparator;
import model.TimeFormat;
import operations.InsertArrayListInteger;
import operations.InsertLinkedListInteger;
import operations.SortArrayIntegerArrSort;
import operations.SortArrayListIntegerCollSort;

public class Test01 {
	
	public static void main(String[] args) {
		Comparator confronto = new Comparator();
		
		confronto.addOperator(new InsertArrayListInteger());
		confronto.addOperator(new InsertLinkedListInteger());
		confronto.addOperator(new SortArrayIntegerArrSort());
		confronto.addOperator(new SortArrayListIntegerCollSort());
		
		ArrayList<TimeFormat> tempi;
		tempi = confronto.execute();
		
		for (TimeFormat timeFormat : tempi) {
			//System.out.println((timeFormat.getTimeDouble()));
			System.out.println((timeFormat.getTimeFormatted()));
		}
		
		
	}
	

}
