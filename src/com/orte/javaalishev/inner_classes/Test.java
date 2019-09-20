package com.orte.javaalishev.inner_classes;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();
//        Motor 1 is starting...
//        Electrocar 1 is starting...

        // don't have to create Electrocar object
        Electrocar.Battary battary = new Electrocar.Battary();
        battary.charge();
       // Battery is charging..
    }
}
