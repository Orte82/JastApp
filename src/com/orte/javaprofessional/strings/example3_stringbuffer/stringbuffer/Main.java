package com.orte.javaprofessional.strings.example3_stringbuffer.stringbuffer;

public class Main {
    public static void main(String[] args) {

        String str1 = "Cat has ";
        String str2 = " legs";
        int paws =4;
        StringBuffer sb = new StringBuffer(20);
        sb.append(str1).append(paws).append(str2);
        System.out.println(sb.capacity()); // 20
        System.out.println(sb); //Cat has 4 legs
    }
}
