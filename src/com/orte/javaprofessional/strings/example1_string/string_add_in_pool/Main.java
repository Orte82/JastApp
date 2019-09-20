package com.orte.javaprofessional.strings.example1_string.string_add_in_pool;

public class Main {
    public static void main(String[] args) {
        String s1 = "World"; //poll
        String s2 = "World"; //poll

        // create text with constructor
        String s3 = new String("World");
        String s4 = new String("World");
        System.out.println(s1==s2); // true

        //using intern() to put values in pool
        System.out.println(s1 == s3.intern()); //true
        System.out.println(s3.intern() == s4.intern());//true
        System.out.println();
    }
}
