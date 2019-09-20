package com.orte.javahowtostart;

public class Method3Overload {
    public static void sum() {
        System.out.println(5 + 5);
    }

    public static void sum(int a) {
        System.out.println(a + 5);

    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(int a, int b, String str) {
        System.out.println(a + b + str);
    }

    public static void main(String[] args) {
        // method with different parameter signature
        sum(); // 10
        sum(5);//10
        sum(10, 15);//25
        sum(5, 10, "100");//15100 => 5 + 10 = 15 concat 100
    }
}
