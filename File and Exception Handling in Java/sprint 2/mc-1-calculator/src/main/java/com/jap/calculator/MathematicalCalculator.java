package com.jap.calculator;

public class MathematicalCalculator {

	public int add(int num1, int num2)
	{
		int add = num1 + num2;
		return add;
	}
	public int subtract(int num1, int num2)
	{
		int sub = num1 - num2;
		return sub;
	}
	public int multiply(int num1, int num2) {
		int mul = num1 * num2;
		return mul;
	}
	public int divide(int num1, int num2) throws CalculatorException{
		int div = 0;
		try {
			div = num1 / num2;
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
			//throw new CalculatorException(e.getMessage());
			System.exit(0);
		}
		return div;

	}
	public int modulo(int num1, int num2)
	{	int mod = num1 % num2;
		return mod;
	}

	public static void main(String[] args) {
		MathematicalCalculator mathematicalCalculator = new MathematicalCalculator();
		System.out.println("addition result=  " + mathematicalCalculator.add(10,5));

		System.out.println("subtraction result= " + mathematicalCalculator.subtract(10,5));

		System.out.println("multiplication result = " + mathematicalCalculator.multiply(10, 5));

		try {
			System.out.println("Division result = " + mathematicalCalculator.divide(10,0));

		} catch (CalculatorException e) {
			System.out.println(e.getMessage());
		}
	}
}
