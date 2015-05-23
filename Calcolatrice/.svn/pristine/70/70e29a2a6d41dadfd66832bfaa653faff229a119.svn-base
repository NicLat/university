package test;

import java.io.IOException;
import java.io.InputStreamReader;

import model.Calculator;
import model.Divide;
import model.Multiply;
import model.CalculatorException;
import model.ScreenStr;
import model.Subtract;
import model.Sum;
import model.Utils;

public class Test01 {
	
	public static void main(String[] args) throws IOException {
		
	ScreenStr schermo = new ScreenStr();
	Calculator calcolatrice = new Calculator(schermo);
	char c;
	
	
	
	
	
	char buffer[] = new char[1];
	InputStreamReader isr = new InputStreamReader(System.in);
	try {isr.read(buffer,0,1);}
	catch (IOException e) {}
	c = buffer[0];

	System.out.println(c);
	
	while( c != 'q'){
		
		switch (c){
			case '+': 	calcolatrice.setOperator(new Sum());
						schermo.appendScreen(" + ");
						break;
			case '-': 	if (calcolatrice.getOperator() != null){
							schermo.appendScreen("-");
						}else{
							calcolatrice.setOperator(new Subtract());
							schermo.appendScreen(" - ");
						}
						break;
			case '*': 	calcolatrice.setOperator(new Multiply());
						schermo.appendScreen(" * ");
						break;
			case '/': 	calcolatrice.setOperator(new Divide());
						schermo.appendScreen(" / ");
						break;	
		}
		if (Character.getNumericValue(c) >= 0 && Character.getNumericValue(c) <= 9)
			schermo.appendScreen(String.valueOf(c));
		
		
		if (c=='=')
			try {
				calcolatrice.calculate(schermo.getScreen());
				calcolatrice.setOperator(null);
			} catch (CalculatorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				schermo.clearScreen();
				//JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		
		
		System.out.println("schermo:");
		System.out.println(schermo.getScreen());
		
		
		schermo.setScreen(Utils.removeRest(schermo.getScreen()));
		
		char buffer1[] = new char[1];
		InputStreamReader isr1 = new InputStreamReader(System.in);
		try {isr1.read(buffer1,0,1);}
		catch (IOException e) {}
		c = buffer1[0];
	}
	
	
	}
}
