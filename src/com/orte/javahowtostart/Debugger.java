package com.orte.javahowtostart;

public class Debugger {
    public static int sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int number = sum(10, 20);
        String str = "Helloooo";
        System.out.println(str);
        System.out.println(number);
    }
}
