package com.orte.javaprofessional.strings;

public class StringClass {
    // + concatenates strings
    // strings are immutable
    // String is array of chars!!!!

    // String s1 = "I love Java";
    // String s2 =  new String("I love Java");

    // all actions with String creates new string object

    // String methods

    // String concat(String s) or + => concatenation of strings
    // boolean equals(Object ob), boolean equalsIgnoreCase(String s) => string equation
    // int compareTo(String s) int compareToIgnoreCase(String s) => lexicographic string equation
            // returns 0 if true
    // boolean contentEquals(StringBuffer ob) => string equation with StringBuffer object content
    // String substring(int n, int m)
    // String substring(int n)
    // int length() => string length
    // int indexOf(char ch) => index of first found char
    // static String valueOf(val) => converts base type variable to string
    // String replace(char c1, char c2) => replace all char inputs of first arg in string by second arg char
    // String intern() => puts string in pool of literals and returns its object reference.
        // Allows to compare strings with "=="
    // String trim() => removes blanks at the beginning and at the end of string
    // char charAt(int position) => returns char value of given position
    // boolean isEmpty() => returns true if string length == 0
    // byte[] getBytes() => converts string into array of bytes or symbols
    // void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) => copy string into char array dst

    // static String format(String format, Object ...args);
    // static String format(Locale I, String format, Object ...args);
//    public static void main(String[] args) {
//        String aString = "world";
//        int aInt = 20;
//       String formatted = String.format("Hello, %s on line %d", aString,aInt);
//        System.out.println(formatted);//Hello, world on line 20
//        double d = 20.3333333;
//        System.out.printf("%.2f",d);// 20,33
//
//    }
    // String[] split(String regex), String[] split(String regex, int limit) => splitting string into Sting array by
    // separator
}
