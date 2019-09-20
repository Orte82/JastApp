package com.orte.pattern.factory;

public class NewJeep implements Car{
    @Override
    public void drive() {
        System.out.println("NewJeep drives");
    }

    @Override
    public void stop() {
        System.out.println("NewJeep stops");
    }
}
