package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseDigitTest {
    ReverseDigit reverseDigit;

    @Before
    public void setUp() {
        reverseDigit = new ReverseDigit();
    }
    @After
    public void tearDown() {
        reverseDigit = null;
    }

    @Test
    public void givenInputPositiveNumberReverseTheDigit(){
        int actualResult = reverseDigit.getReverse(105);
        assertEquals(501,actualResult);
    }

    @Test
    public void givenInputNegativeNumberReverseTheDigit(){
        int actualResult = reverseDigit.getReverse(-105);
        assertEquals(-501,actualResult);
    }



}