package com.qa.test;

import com.qa.main.Alphabet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {
    Alphabet alphabet;

    @Before
    public void setup() {
        alphabet = new Alphabet();
    }
    @After
    public void tearDown() {

    }

    @Test
    public void testApplication() {

        String testValue = "Hello World!";
        assertEquals("8 5 12 12 15 23 15 18 12 4", alphabet.replaceLetterWithIndex(testValue));
    }
}
