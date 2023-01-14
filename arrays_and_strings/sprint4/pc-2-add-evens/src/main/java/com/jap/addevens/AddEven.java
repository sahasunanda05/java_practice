package com.jap.addevens;

public class AddEven {
    //Write the logic to add evens in the methods
    public long addEvens(int n){
        if (n<=0){
            return 0;
        }
        else if(n%2==0){
            return (addEvens(n-1)+ n);
        }
        else {
            return addEvens(n-1);

        }

    }
        public static void main(String[] args) {
        // Initialize the object of AddEven class
            AddEven addEven = new AddEven();
            // Declare a variable to give as input to the addEvens method
            int number=9;
            // Call the addEvens method and display the result
            long sum = addEven.addEvens(number);
            System.out.println("sum: " + sum);

        }


}

