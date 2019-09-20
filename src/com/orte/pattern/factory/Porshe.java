package com.orte.pattern.factory;

public class Porshe implements Car {
    @Override
    public void drive() {
        System.out.println("Porshe drives");
    }

    @Override
    public void stop() {
        System.out.println("Porshe stops");
    }
}
