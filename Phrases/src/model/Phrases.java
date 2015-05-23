package model;

import java.util.ArrayList;
import java.util.Observable;

public class Phrases extends Observable{

	private ArrayList<String> array;
	private IOrder sorter;
	
	
	public Phrases() {
		super();
		this.sorter = new AZOrder();
		this.array = new ArrayList<String>();
		updateView();
	}

	public Phrases(IOrder sorter) {
		super();
		this.sorter = sorter;
		this.array = new ArrayList<String>();
		updateView();
	}
	
	public void setOrder(IOrder sorter){
		this.sorter = sorter;
		this.sorter.sort(array);
		updateView();
	}
	
	public String getElem(int index){
		if(index<this.getSize())
			return array.get(index);
		return null;
	}
	
	public int getSize(){
		return array.size();
	}

	public boolean addString(String str) {
		if(str.contentEquals(""))
			return false;
		
		boolean added = array.add(str);
		sorter.sort(array);
		updateView();
		return added;
	}
	
	public boolean removeString(String str) {
		boolean rem=array.remove(str);
		updateView();
		return rem;
	}
	
	public void resetList() {
		while(array.size()!=0){
			array.remove(getSize()-1);
		}
		updateView();
	}
	
	private void updateView(){
		setChanged();
		notifyObservers();
	}
	
	
	/*
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>(){
				
			@Override
			public boolean hasNext() {
				if(i<array.size())
					return true;
				return false;
			}

			@Override
			public String next() {
				return array.get(i++);
			}

			@Override
			public void remove() {
				array.remove(i-1);
			}
		
		};
	}
	*/
}
