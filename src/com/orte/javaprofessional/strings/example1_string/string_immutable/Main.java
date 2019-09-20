package com.orte.javaprofessional.strings.example1_string.string_immutable;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;
        System.out.println(s1 == s2); //true

        // Executing concatenation
        s1 += " World";
        s2 += " World";
        System.out.println(s1 == s2);//false
        System.out.println(s1);// Hello World
        System.out.println(s2);// Hello World
    }
}
