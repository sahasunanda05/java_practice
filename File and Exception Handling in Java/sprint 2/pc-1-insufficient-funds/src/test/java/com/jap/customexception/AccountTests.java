package com.jap.customexception;

import com.jap.customexception.Account;
import com.jap.customexception.InsufficientFundException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class AccountTests {

    private Account account;

    @Before
    public void setUp() {
        account = new Account(5000);
    }

    @After
    public void tearDown() {
        account = null;
    }

    @Test
    public void givenValidWithdrawAmountThenReturnNewBalance() throws InsufficientFundException {
        double newBalance = account.withdraw(500);

        assertEquals(4500.0,newBalance,500);
    }

    @Test
    public void givenZeroWithdrawAmountThenReturnSameBalance() throws InsufficientFundException {
        double newBalance = account.withdraw(0);
        assertEquals(5000.0, newBalance,0);
    }


}



