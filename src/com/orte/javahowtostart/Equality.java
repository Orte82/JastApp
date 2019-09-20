package com.orte.javahowtostart;

public class Equality {
    public static void main(String[] args) {
//        int i = 10;
//        int b = 10;
//        System.out.println(i == b);  //true
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2); //true

        str1 = str1 + 1;
        str2 = str2 + 1;
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1==str2); //false
        System.out.println(str1.equals(str2)); //true
        // if string is changed jvm creates new object

        Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println(i1==i2); //false
        System.out.println(i1.equals(i2)); //false

    }
}
