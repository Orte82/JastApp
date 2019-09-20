package com.orte.javaprofessional.strings;

public class SimpleString {
    public static void main(String[] args) {
        String str ="Hello";// literal
        String str2 = new String("Hello");// new


        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(arr);
        System.out.println(str3); //Hello
        String str4 = new String(arr, 0, 2); // using offset in array of chars
        System.out.println(str4);// He

    }
}
