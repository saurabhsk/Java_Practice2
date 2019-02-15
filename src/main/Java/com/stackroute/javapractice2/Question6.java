package com.stackroute.javapractice2;

public class Question6 {

    public int average(int arr[])
    {
        int sum=0;
        for(int m:arr){
            sum+=m;
        }
        return sum/arr.length;
    }
    public int lowest(int arr[])
    {
        int minimum=arr[0];
        for(int m:arr){
            if(m<minimum){
                minimum=m;
            }
        }
        return minimum;
    }
    public int highest(int arr[])
    {

        int maximum = arr[0];
        for(int m:arr){
            if(m>maximum){
                maximum=m;
            }
        }
        return maximum;
    }
}
