package com.orte.javahowtostart;

public class Method2 {
    public static int divideByZero(int num1, int num2){
//        System.out.println(num1/num2);
        return num1 / num2;
    }
    public static void main(String[] args) {
        // method name must have sense value

        System.out.println(divideByZero(10, 2));
    }
}
