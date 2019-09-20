package com.orte.javaessential.abstract_interface.first;



public class Penguin extends Bird{
    @Override
    public void move(){ // mod of access must be broader same or broader than parents
        System.out.println("Swim");
    }




    @Override
    public void eat() {
        System.out.println("Eat fish");
    }
}
