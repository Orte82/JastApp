package com.orte.javahowtostart;

public class Variables {
    static byte by;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean b;
    static char c; // default '\u0000';
    //constant = > name memory area which can't be changed
    final int MY_FIRST_VALUE = 100;
    // value = 10; compile error



    public static void main(String[] args) {
        System.out.println(by);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);
        System.out.println(c);
        byte counter = 0; //variable created in method must be initialized
        int num = 100;
        int numb = 100;
        int eval = num++ > numb ? num : 50;
        System.out.println(eval);

    }
}
