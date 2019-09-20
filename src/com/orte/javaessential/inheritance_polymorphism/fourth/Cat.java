package com.orte.javaessential.inheritance_polymorphism.fourth;

public class Cat extends Animal{
    int age;
    String name;

    public Cat(int age, String name, int weigth, String brade){
        super(weigth, brade);
        this.age = age;
        this.name = name;
    }
}
