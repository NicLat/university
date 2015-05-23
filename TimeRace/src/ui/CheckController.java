package ui;

import model.Comparator;
import operations.InsertArrayListInteger;
import operations.InsertLinkedListInteger;
import operations.SortArrayIntegerArrSort;
import operations.SortArrayListIntegerBubbleCustom;
import operations.SortArrayListIntegerCollSort;
import operations.SortArrayListStringCollSort;
import operations.SortLinkedListStringCollSort;

public class CheckController{
	
	private Comparator confrontatore;
	private InputPanel input;
		
	public CheckController(Comparator confrontatore, InputPanel input) {
		super();
		this.confrontatore = confrontatore;
		this.input = input;
	}
	
	public void setOperators(){
		confrontatore.emptyOperators();
		if (input.getOperations().get(0).isSelected())
			confrontatore.addOperator(new InsertArrayListInteger());
		if (input.getOperations().get(1).isSelected())
			confrontatore.addOperator(new InsertLinkedListInteger());
		if (input.getOperations().get(2).isSelected())
			confrontatore.addOperator(new SortArrayListIntegerCollSort());
		if (input.getOperations().get(3).isSelected())
			confrontatore.addOperator(new SortArrayIntegerArrSort());
		if (input.getOperations().get(4).isSelected())
			confrontatore.addOperator(new SortArrayListIntegerBubbleCustom());
		if (input.getOperations().get(5).isSelected())
			confrontatore.addOperator(new SortArrayListStringCollSort());
		if (input.getOperations().get(6).isSelected())
			confrontatore.addOperator(new SortLinkedListStringCollSort());
		
	}
	

	
	
	/*
	public void setListeners(){
		
		input.getOperations().get(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				confrontatore.addOperator(new InsertArrayListInteger());
			}
		});
		input.getOperations().get(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				confrontatore.addOperator(new InsertLinkedListInteger());
			}
		});
		input.getOperations().get(2).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				confrontatore.addOperator(new SortArrayListIntegerCollSort());
			}
		});
		input.getOperations().get(3).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				confrontatore.addOperator(new SortArrayIntegerArrSort());
			}
		});		
	}
	*/
	
}
