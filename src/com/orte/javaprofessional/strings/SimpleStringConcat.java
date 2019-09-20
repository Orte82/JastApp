package com.orte.javaprofessional.strings;

public class SimpleStringConcat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        // what happens when creating str3
        String str4 = new StringBuilder().append(str1).append(str2).toString();
    }
}
