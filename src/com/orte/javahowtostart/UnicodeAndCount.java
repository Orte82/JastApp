package com.orte.javahowtostart;

public class UnicodeAndCount {
    public static void main(String[] args) {
        int i10 = 10;
        int i2 = 0b1010; //double count
        int i8 = 010;
        int i16 = 0xfabc;

        System.out.println(i10);
        System.out.println(i2);
        System.out.println(i8);
        System.out.println(i16);

        char c = 'a';
        System.out.println(c);
        char hourse = '\u265E';
        char hourse2 = 0x265E; //hexidecimal char code
        System.out.println(hourse);
        System.out.println(hourse2);
    }
}
