package com.jap.prime;

public class PrimeCheckerImpl {


    public boolean primeNumberCheck(int number) {


        PrimeChecker primeChecker = num -> {
            //special
            if (num == 0 || num == 1)
                return false;

            for(int i =2; i < num;i++){
                if (num % i==0) {
                    return false;
                }
            }
            return true;
        };
        // write the logic here to check is a number is prime or not


        return primeChecker.isPrime(number);
    }

}
