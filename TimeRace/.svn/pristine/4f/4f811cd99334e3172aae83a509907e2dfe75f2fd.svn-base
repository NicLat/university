package ui;

import java.awt.TextArea;
import java.util.ArrayList;

import model.TimeFormat;

public class ResultArea extends TextArea{

	private static final long serialVersionUID = 1L;
	
	public void setResults(InputPanel input, ArrayList<TimeFormat> times){
		
		for (int i=0,j=0; i < input.getOperations().size() ; i++) {
			
			if(input.getOperations().get(i).isSelected()){
				String temp = input.getOperations().get(i).getText() + " " + times.get(j).getTimeFormatted();
				this.append(temp + "\n");
				j++;
			}
	
		}
	}
	
	
}
