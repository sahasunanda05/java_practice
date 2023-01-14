package com.jap;


import com.jap.ShortestWord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ShortestWordTest {
    ShortestWord shortestWord;

    @Before
    public void setUp() {
        shortestWord = new ShortestWord();
    }

    @After
    public void tearDown() {
        shortestWord = null;
    }

    // Test findShortestWord method by passing array of words as input
    @Test
    public void givenArrayOfWordsFindShortestWord() {
        // Test scenario: Input words with different length
        assertEquals("Pensive", shortestWord.findShortestWord(new String[]{"Atrocity", "Pensive", "Imperceptible", "Discordant" }));
        // Test scenario: Input words with same length
        assertEquals("looped", shortestWord.findShortestWord(new String[]{"looped", "poodle", "student", "calmed" }));
        // Test scenario: Input words with empty strings
        assertEquals("student", shortestWord.findShortestWord(new String[]{"Atrocity", "Language", "student"}));

    }
}
