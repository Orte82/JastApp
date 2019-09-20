package com.orte.javahowtostart;

public class Concat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String general = str1 + str2;
        System.out.println(general); // HelloWorld
        System.out.println(10 + "10"); // 1010
        System.out.println("10" + 10); // 1010
        System.out.println(10 + "10" + 10); // 101010
//        System.out.println(10 + "10" -10); // Compile error
        System.out.println(10 + 10 +"10"); // 2010
        System.out.println("10" + 10 + 10); // 101010
        System.out.println("10" +(10+10)); // 1020
        System.out.println("10" + 10 + "10"); //101010
    }
}
