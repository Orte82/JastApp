package com.orte.javaprofessional.strings.example1_string.string_pool;

public class Main {
    public static void main(String[] args) {
        // Value in pool
        String s1 = "World"; //pool
        String s2 = "World"; //pool

        // Create string value through constructor and doesn't apply it to pool
        String s3 = new String("World");
        String s4 = new String("World");

        System.out.println(s1 == s2);// true
        System.out.println(s1 == s3);// false
        System.out.println(s3 == s2);// false
        System.out.println();

        Integer a = 10;
        Integer b = 10;
        Integer c1 = 128;
        Integer c2 = 128;
//
//        Integer aNew = new Integer(10);
//        Integer bNew = new Integer(10);
//        System.out.println(aNew == bNew); //false;
        // Integer value wrapper classes put their value in pool
        System.out.println(a == b);// true
        // if leaving 1 byte range receive false
        System.out.println(c1 == c2);// false

    }
}
