package com.stackroute.javapractice2;



import org.junit.*;

import static org.junit.Assert.*;

public class Question3Test {



    Question3 app;
    Question3.MemberVariable app2;

    @BeforeClass
    public static void setUpOnce() {
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce() {
        System.out.println("Inside teardown once");

    }

    @Before
    public void setUp() {
        System.out.println("object created");
        app = new Question3();
        app2 = app.new MemberVariable();
    }

    @After
    public void tearDown() {
        System.out.println("object destroyed");
        app = null;
    }

    @Test
    public void FirstPalindromeSuccess() {
        //Arrange
        String [] expectedValue = {"Harry Potter", "30", "2500.3"};

        //Act
        String [] actualValue = app2.isMember("Harry Potter",30,2500.3);
        //Assert
        assertArrayEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }


}