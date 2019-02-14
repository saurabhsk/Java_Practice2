package com.stackroute.javapractice2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class Question9Test {

    private static Question9 q9;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        q9 = new Question9();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        q9 = null;
    }

    @SuppressWarnings("deprecation")
    @Test
    public void checkWordFrequency() {
        File file = new File("src/main/tests/resources/text9.txt");
        assertEquals(new String[]{"i-3","am-1","like-1","have-1","have-1","ab-2","cd-2","ol-1","lo-1","o-1"},q9.checkWordFrequency(file.getAbsolutePath()));
        assertNull("null is expected",q9.checkWordFrequency(""));
    }
}