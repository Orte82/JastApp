package com.orte.javaessential.static_word.Example5;

public class Main {
    public static void main(String[] args) {
        // 1. Only static constructor
        //NonStaticClass.staticMethod();
//
//        Static block
//        Statick method

        // 2. Both constructors
        NonStaticClass instance1 =  new NonStaticClass();
        NonStaticClass instance2 =  new NonStaticClass();
        NonStaticClass.staticMethod();
//        Static block
//        Constructor
//                Constructor
//        Statick method
    }
}
