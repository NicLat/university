package model;

public class Calculator{

	private IOperator operator;
	private ScreenStr screen;
	private IParseString parser;
	
	public Calculator(ScreenStr screen) {
		super();
		this.screen = screen;
		this.parser = new ParseScreen();
		this.operator = null;
	}
	
	public void calculate(String str) throws CalculatorException{
		
		int[] op = parser.parse(str, operator);
		int[] res = operator.calculate(op[0], op[1]);
		
		screen.clearScreen();
		
		screen.appendScreen(String.valueOf(res[0]));
		if(res.length > 1){
			screen.appendScreen("%");
			screen.appendScreen(String.valueOf(res[1]));
		}
			
	}
	
	
	
	public IOperator getOperator() {
		return operator;
	}

	public void setOperator(IOperator operator) {
		this.operator = operator;
	}
		
}
	