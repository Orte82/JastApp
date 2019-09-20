package com.orte.javaessential.static_word.Example3;

public class Main {
    public static void main(String[] args) {
        System.out.println(NonStaticClass.X);

        NonStaticClass instance = new NonStaticClass();

        System.out.println(instance.X);//
        // static variable can be called from object notation
    }
}
