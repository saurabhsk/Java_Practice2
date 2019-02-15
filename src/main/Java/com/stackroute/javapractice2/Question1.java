package com.stackroute.javapractice2;

public class Question1 {
    public boolean checkPalindrome(String s)
    {
        String rev="";
        char input[] = s.toCharArray();
        for(int i=input.length-1;i>=0;i--){
            rev += input[i];
        }
        if(s.equalsIgnoreCase(rev))
            return true;
        else
            return false;
    }
}
