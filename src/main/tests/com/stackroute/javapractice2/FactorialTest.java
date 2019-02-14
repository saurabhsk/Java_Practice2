package com.stackroute.javapractice2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestlongFactorial() {
        assertEquals(120,Factorial.longFactorial(5));
        assertEquals(2,Factorial.longFactorial(2));
        assertEquals(1,Factorial.longFactorial(0));
        assertEquals(null,Factorial.longFactorial(10));
        assertEquals(null,Factorial.longFactorial(21));
    }

}