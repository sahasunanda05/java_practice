package com.jap.customexception;

public class Implementation {
    public static void main(String[] args) {
        Account account = new Account(9000);
        int newBalance = account.getAccountBalance();

        try {
            newBalance = account.withdraw(10000);
        } catch (InsufficientFundException e) {

            System.out.println(e.getMessage());

        } finally {
            System.out.println("New Balance  " + newBalance);
        }

    }
}
