package com.orte.javaessential.abstract_interface.first;



public class Straus extends Bird{
    public void move(){
        System.out.println("Run");
    }

    @Override
    public void eat() {
        System.out.println("Eat rodents");
    }
}
