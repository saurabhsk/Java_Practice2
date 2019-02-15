package com.stackroute.javapractice2;

import org.junit.*;
import static org.junit.Assert.*;

public class Question1Test {
    private Question1 palindrome;
    private String s;

    @Before
    public void setUp() throws Exception {


        palindrome = new Question1();

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void emptyStringTest() throws Exception {

        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void multipleWhiteSpaceTest() throws Exception {
        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("Str ess ed   De sse rts");
        assertEquals(expectedValue, actualValue);


    }

    @Test
    public void singleCharTest() throws Exception {
        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("U");
        assertEquals(expectedValue, actualValue);


    }

    @Test
    public void punctuationTest() throws Exception {
        Boolean expectedValue = false;

        Boolean actualValue = palindrome.checkPalindrome("Hey, how are you?");
        assertEquals(expectedValue, actualValue);


    }

    @Test
    public void unicodeTest() throws Exception {
        Boolean expectedValue = false;

        Boolean actualValue = palindrome.checkPalindrome("\\u0048\\u0065\\u006C\\u006C\\u006F World");
        assertEquals(expectedValue, actualValue);


    }

    @Test
    public void alphaNumericPalindromeTest() throws Exception {
        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("My5 g 5ym");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void validPalindromeTest() throws Exception {

        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("No pot top on");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void invalidPalindromeTest() throws Exception {
        Boolean expectedValue = false;

        Boolean actualValue = palindrome.checkPalindrome("I am good");
        assertEquals(expectedValue, actualValue);


    }

}