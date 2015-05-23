package model;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ParseScreen implements IParseString {

	@Override
	public int[] parse(String str, IOperator op) throws CalculatorException{
		String temp;
		int[] vett = new int[2];
		
		StringTokenizer tokenizer = new StringTokenizer(str);
		
		try {
			try {
				temp = tokenizer.nextToken();
				vett[0] = Integer.parseInt(Utils.removeRest(temp));
				
				temp = tokenizer.nextToken();	
				if(temp.charAt(0) != op.toChar())
					throw new CalculatorException("Troppi operatori");
				
				temp = tokenizer.nextToken();
				vett[1] = Integer.parseInt(temp);
			} catch (NoSuchElementException e) {
				throw new CalculatorException("Espressione non completa");
			}
			
			try {
				temp = tokenizer.nextToken();
				throw new CalculatorException("Troppi operandi");
			} catch (NoSuchElementException e) {
				// tutto ok
			}
		} catch (NumberFormatException e) {
			throw new CalculatorException("Errore nell'espressione");
		}
	
		
		return vett;
	}
	
	
}
