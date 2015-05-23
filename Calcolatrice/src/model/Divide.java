package model;

public class Divide implements IOperator{
	
	@Override
	public int[] calculate(int op1, int op2) {
		int [] res = new int[2];
		res[0] = op1 / op2;
		res[1] = op1 % op2;
		return res;
	}
	
	@Override
	public char toChar() {
		return '/';
	}

}
