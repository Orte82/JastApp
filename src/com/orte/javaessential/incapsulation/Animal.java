package com.orte.javaessential.incapsulation;

public class Animal {
    private int age;
    private int height;

    //  Constructor
    //  Number of parameters of constructor must be different
    public Animal() { //chaining
        this(0, 20);  // <== calling second constructor
    }

    public Animal(int age, int height) {
        this.age = age;
        this.height = height;
    }
}
