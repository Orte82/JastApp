package com.orte.javahowtostart;

public class BaseTypeCasting {
    // casting is a interchange from one type of variable to another
    // explicit
    // implicit = > automatic coercion without losing information
    // Secure casting
    static byte a = 10;
    static short b = 0;

    public static void main(String[] args) {
        // Secure casting
        BaseTypeCasting.b = BaseTypeCasting.a; // BUT NOT b to a
        // Unsecured casting => cant lose precision
        short a = 256;
        byte b = 0;
        b = (byte) a;
        System.out.println(b); // => 0

        byte c = 10;
        int i = c;
        int f = add(i, a);
        System.out.println(f);
        int i3 = 10;
        byte b3 = (byte) i3;
        System.out.println(b3);
        i3 = 200;
        b3 = (byte) i3;
        System.out.println(b3); // -> -56

        double d = 22.89;
//        int i4 = (int) d;
        int i4 = (int)Math.round(d);
        System.out.println(i4); // ->23
    }

    public static int add ( int i, int j){
        return i + j;
    }
}
