package com.jap;

public class GameDemo {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 0;
        GameDemo obj = new GameDemo();
        System.out.println(obj.divideByNumber(firstNumber,secondNumber));
    }

    public String divideByNumber(int firstNumber, int secondNumber){
        //create local variable
        int finalNumber = 0;
        try {
            //write logic
            finalNumber = (firstNumber / secondNumber);
            //Handle specific exception
        }catch (ArithmeticException e) {
            return String.valueOf(e);
        }
        return String.valueOf(finalNumber);
    }

}



