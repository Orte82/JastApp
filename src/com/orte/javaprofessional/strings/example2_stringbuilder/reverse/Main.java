package com.orte.javaprofessional.strings.example2_stringbuilder.reverse;

public class Main {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse(); // reverse it
        System.out.println(sb); // doT saw I was toD
    }
}
