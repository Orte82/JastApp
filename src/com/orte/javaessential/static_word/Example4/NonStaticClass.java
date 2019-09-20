package com.orte.javaessential.static_word.Example4;

public class NonStaticClass {
    // there ara can be multiple static blocks and they are called from top to bottom
    static int x;

    static {
        x = 1;
        System.out.println("Static block x = " + x);
    }

    static {
        x = 23;
        System.out.println("Static block x = " + x);
    }

    static {
        x = -99;
        System.out.println("Static block x = " + x);
    }

    public NonStaticClass(int x){
        this.x = x;
        System.out.println("Constructor X = " + x);
    }
}
