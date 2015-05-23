package tests;

import utils.IntegerStack;


public class IntegerStackTest{

	public static final int SIZE = 3;

	public static void main(String[] args){

		IntegerStack stack = new IntegerStack(SIZE);

		stack.push(3);
		stack.push(4);
		stack.push(5);
		boolean verifica1=stack.push(6);
		System.out.println("Verifica1: "+verifica1+"==false");

		stack.pop();
		stack.pop();
		stack.pop();
		int verifica2=stack.pop();
		System.out.println("Verifica2: "+verifica2+"==0");


	}
}
