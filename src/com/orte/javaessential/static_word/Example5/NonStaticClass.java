package com.orte.javaessential.static_word.Example5;

public class NonStaticClass {
    // constructor is called only on object creation
    public NonStaticClass() {
        System.out.println("Constructor");
    }

    // static block is called anyway
    static {
        System.out.println("Static block");
    }

    // static method
    public static void staticMethod() {
        System.out.println("Statick method");
    }

    public void notStaticMethod() {
        System.out.println("not Static Method");
    }
}
