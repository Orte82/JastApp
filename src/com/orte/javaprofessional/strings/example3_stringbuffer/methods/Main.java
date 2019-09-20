package com.orte.javaprofessional.strings.example3_stringbuffer.methods;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("length =>" + sb.length());
        System.out.println("capacity =>" + sb.capacity());
        // literals can be created only for String class
        sb.append("Java");
        System.out.println("string =>" + sb);
        System.out.println("length =>" + sb.length());
        System.out.println("capacity =>" + sb.capacity());
        System.out.println("reverse =>" + sb.reverse());
    }
}
