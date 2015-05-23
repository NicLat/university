package utils;

public class IntegerStack{

	private int counter;	// è già =0
	private int[] values;	// è già =null

	public IntegerStack(int size){
		this.values = new int[size];
		//this.counter = 0;
	}

	public boolean push(int value){
		if(counter<values.length){	//.length attributo della classe int[] che mi da la lunghezza del vettore di interi
			values[counter]=value;
			counter++;
			return true;
		}
		return false;		
	}

	public int pop(){
		if (counter>0){
			return values[--counter];
		}else{
			return 0;	//valore intero di default	
		}
	}

}
