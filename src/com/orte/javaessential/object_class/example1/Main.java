package com.orte.javaessential.object_class.example1;

public class Main {
    public static void main(String[] args) {
        // Object of type Student has methods of Object class
        Main main = new Main();

        // object of type Car has methods of Object class
        Car car = new Car();

    }
}

// class Car explicitly extends Object
class Car extends Object{}

//class A{//=> extends Object, creates constructor() and call Object.constructor())}
