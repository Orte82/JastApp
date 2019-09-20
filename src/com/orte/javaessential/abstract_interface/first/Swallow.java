package com.orte.javaessential.abstract_interface.first;



public class Swallow extends Bird {
    @Override
    public void move(){
        System.out.println("Fly");
    }

    @Override
    public void eat() {
        System.out.println("Eat bugs");
    }
}
