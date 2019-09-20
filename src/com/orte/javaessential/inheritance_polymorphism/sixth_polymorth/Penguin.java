package com.orte.javaessential.inheritance_polymorphism.sixth_polymorth;

public class Penguin extends Bird{
    @Override
    public void move(){ // mod of access must be broader same or broader than parents
        System.out.println("Swim");
    }
}
