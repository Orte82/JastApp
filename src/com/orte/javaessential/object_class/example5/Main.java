package com.orte.javaessential.object_class.example5;

public class Main {
    public static void main(String[] args) {
        // Method equals is redefined
    Car car1 = new Car(12);
    Car car2 = new Car(12);
    Car car3 = new Car(15);

        System.out.println(car1.hashCode());//1922154895
        System.out.println(car2.hashCode());//883049899
        System.out.println(car3.hashCode());//2093176254

    }

}
