package com.orte.javaessential.object_class.example2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(160, "blue");


        //returns object class
        System.out.println(car.getClass());

        //overridden toString returns car obj in new way
        System.out.println(car);
    }

}
