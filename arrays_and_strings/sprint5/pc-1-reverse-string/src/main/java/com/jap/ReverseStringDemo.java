package com.jap;

public class ReverseStringDemo {
    public static void main(String[] args) {
        //Create a String object.
        String string = new String("SunandaSaha");
        //Create an object of the class ReverseStringDemo
        ReverseStringDemo reverseStringDemo = new ReverseStringDemo();
        //Call the method getReverseString() and pass the parameter
        System.out.println(reverseStringDemo.getReverseString(string));
    }

    //Write the logic to reverse the String  inside the below method and return the reverse String.
    public String getReverseString(String string){
        String reverseString = "";
        for(int i=(string.length()-1);i>=0;i--){
            char c = string.charAt(i);
            reverseString = reverseString.concat(String.valueOf(c));
        }

        return reverseString;
    }
    
}

