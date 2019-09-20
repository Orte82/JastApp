package com.orte.javaessential.static_simple;

public class Car {
    String model;
    String color;
    private int count2;
   static double count;

    public static void main(String[] args) {
//        Car c1 = new Car();
//        c1.count = 1;
//        Car c2 = new Car();
//        c2.count = 2;
        Car.doSmth();  // Class call
        doSmth();  // inside class without Car.
//        System.out.println(Car.count2); // ^
    }                                //^
    // !!!!!!!!!!!!call non-static field from static context leads to compile error!!!!!!!!!!!

    public static void doSmth(){
        System.out.println("Hello !");
    }
}
