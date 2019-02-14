package com.stackroute.javapractice2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question6Test {
    Question6 question6;

    @Before
    public void setUp() throws Exception {
        question6=new Question6();
    }

    @After
    public void tearDown() throws Exception {
        question6=null;
    }

    @Test
    public void average() {
        int inputArray[]={25,25,25,25};
        assertEquals(25,question6.average(inputArray));
        assertNotEquals(100,question6.average(inputArray));
    }
    @Test
    public void averageExceeded() {
        int inputArray[]={25,25,101,25};
        assertNull("Null is Expected!",question6.average(inputArray));
    }

    @Test
    public void lowest() {
        int inputArray[]={49,33,34,57};
        assertEquals(33,question6.average(inputArray));
        assertNotEquals(49,question6.average(inputArray));
    }

    @Test
    public void highest() {
        int inputArray[]={241,243,2504,294};
        assertEquals(2504,question6.average(inputArray));
        assertNotEquals(294,question6.average(inputArray));
    }
}