package com.thinkitive.junit;

public class MyMath {
    public int calculation(int[] numbers){
        int sum = 0;

        for(int number:numbers){
            sum += number;
        }
        return sum;
    }
}
