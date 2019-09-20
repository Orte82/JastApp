package com.orte.javaprofessional.strings;



public class SimpleWrappers {
    // all wrapper classes are immutable
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;

        System.out.println(i1 == i2);//true
        // more than 1 byte
        Integer i3 = 1000;
        Integer i4 = 1000;
        System.out.println(i3 == i4);//false

        // Byte, Short, Integer, Long, Character
        // -128 -- 127 return true
        // they are placed in constants pool
        Character c1 = 100;
        Character c2 = 100;
        System.out.println(c1 == c2);//true

        Long l1 = 100L;
        Long l2 = 100L;
        System.out.println(l1 == l2); //true

        //Float and Double will be false
    }
}
