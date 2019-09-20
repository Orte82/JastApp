package com.orte.javaprofessional.strings;

import javax.sound.midi.Soundbank;

public class SimpleMethodsOfString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!!!";

        long time1 = System.nanoTime();
        String str = str1.concat(str2).concat(str3);
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);// 10195

        long time3 = System.nanoTime();
        String str6 = str1 + str2 + str3;
        long time4 = System.nanoTime();
        System.out.println(time4-time3);// 32222012
//        System.out.println(str1.substring(1,3));
//        System.out.println(str1.equals("Hello"));//true
//        System.out.println(str1.equalsIgnoreCase("HELLO"));//true
//        System.out.println(str1.startsWith("H"));//true
//        System.out.println(str1.endsWith("o"));//true
//        System.out.println(str1.regionMatches());
//        System.out.println(str1.substring(0, 2));//He
//
//        System.out.println(str1.length()); //5
//        System.out.println(str1.indexOf("e")); //1

//        Integer i1 = 55;
//        System.out.println(i1.toString());//55
//        System.out.println(Integer.toString(i1)); //55
//
//        Integer i2 = null;
//        System.out.println(String.valueOf(i1));//55
//        System.out.println(String.valueOf(i1) instanceof String);//true
//        System.out.println(String.valueOf(i2));//null
//        System.out.println(String.valueOf(null));//NullPointerException

//        System.out.println(str1.replace("l", "t")); //Hetto
//        System.out.println(str1.toLowerCase()); //hello
//        System.out.println(str1.toUpperCase()); //HELLO




    }
}
