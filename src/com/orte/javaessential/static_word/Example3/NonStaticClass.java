package com.orte.javaessential.static_word.Example3;

public class NonStaticClass {

    // static blocks are created when class is loaded to memory
    public static final int X;
    static {
        X=10;
        System.out.println("Static block X = " + X);
    }

    public NonStaticClass(){
        // X = 4; // error because static block is called earlier than constructor
        System.out.println("Constructor X= " + X);
    }
}
