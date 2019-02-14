package com.stackroute.javapractice2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class Question4Test {

    private static Question4 q4;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        q4 = new Question4();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        q4 = null;
    }

    @Test
    public void getUpperCase() {
        // getting the file from resources folder
        File file = new File("src/main/tests/resources/text4.txt");
        assertEquals("hello, is it me you are looking for? i can see it in your eyes 12345678@#$%.",q4.getUpperCase(file.getAbsolutePath()));
        assertNull("The return value should be null",q4.getUpperCase(""));
    }
}