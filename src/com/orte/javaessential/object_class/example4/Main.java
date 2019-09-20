package com.orte.javaessential.object_class.example4;

public class Main {
    public static void main(String[] args) {
        // Method equals is redefined
    Car car1 = new Car(2);
    Car car2 = new Car(2);
    Car car3 = car1;

        System.out.println(car1.equals(car2)); //true
        System.out.println(car1.equals(car3)); //true

    }

}
