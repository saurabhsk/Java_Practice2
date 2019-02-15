package com.stackroute.javapractice2;

public class Question2 {
    public  boolean isPower(int num)
    {
        boolean result =false;
        for(int i=0;i<=20;i++){
            if(Math.pow(4,i)==num) {
                result = true;
                break;
            }
        }
        return result;
    }
}
