package com.jap.calculator;

public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the user defined exception with proper message
		//or else call ceil method of Math class and return the value
		if (num <=0){
			throw new CalculatorException("Number cannot be Zero or Negative");
		}
		double cL = Math.ceil(num);


		return cL;
	}

	public double floorOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call floor method of Math class and return the value
		if (num <=0){
			throw new CalculatorException("Number cannot be zero or Negative");
		}
		double fL = Math.floor(num);
		return fL;
	}

	public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		//else use Math pow method and return the value
		if (num1<0 || num2 <0){
			throw new CalculatorException("Both the number should be positive.");
		}
		double pwr = Math.pow(num1,num2);
		long pwrr = (long)pwr;
		return pwrr;
	}

	public double squareRoot(int num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call sqrt method of Math class and return the value

		if (num <= 0){
			throw new CalculatorException("Number cannot be zero or negative");
		}
		double sR = Math.sqrt(num);
		return sR;
	}

	public static void main(String[] args) throws CalculatorException {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			System.out.println("Ciel Of the Number= " + scientificCalculator.cielOfANumber(3.3f));
		} catch (CalculatorException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("floor Of the Number = " + scientificCalculator.floorOfANumber(0));
		}
		catch (CalculatorException e) {
			System.out.println( e.getMessage());
		}

		try {
			System.out.println("Power = " + scientificCalculator.power(5, 2));
		} catch (CalculatorException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Square Root = " + scientificCalculator.squareRoot(25));

		} catch (CalculatorException e) {
			System.out.println(e.getMessage());
		}
		//Call all the methods one by one and surround them by try and respective catch blocks.
	}
}
