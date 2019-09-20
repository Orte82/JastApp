package com.orte.javahowtostart;

public class LogicSample {
    public static void main(String[] args) {
        final int MIN_VALUE =1;
        int denominator = 0, item = 2;

        if((denominator != 0) && (item / denominator) > MIN_VALUE){
            System.out.println("Inside if");
        }else{
            System.out.println("Inside else");
        }
    }
}
