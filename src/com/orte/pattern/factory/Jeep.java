package com.orte.pattern.factory;

public class Jeep implements Car{
    @Override
    public void drive() {
        System.out.println("Geep drive");
    }

    @Override
    public void stop() {
        System.out.println("Geep stop");

    }
}
