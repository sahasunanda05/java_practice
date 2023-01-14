package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhLevelAnalyserTest {

    PhLevelAnalyser phLevelAnalyser;

    @Before
    public void setUp()  {
        phLevelAnalyser = new PhLevelAnalyser();
    }


    @Test
    public void getPhValueOfWaterForInputPhSeven(){
        String aquariumStatus = phLevelAnalyser.getPhValueOfWater(7);
        assertEquals("pH value is fine",aquariumStatus);
    }

    @Test
    public void getPhValueOfWaterForInputPhEight(){
        String aquariumStatus = phLevelAnalyser.getPhValueOfWater(8);
        assertEquals("pH value is fine",aquariumStatus);
    }

    @Test
    public void getPhValueOfWaterForInputPhTen(){
        String aquariumStatus = phLevelAnalyser.getPhValueOfWater(10);
        assertEquals("pH value is high, partial water change required",aquariumStatus);
    }

    @After
    public void tearDown()  {
        phLevelAnalyser = null;
    }
}