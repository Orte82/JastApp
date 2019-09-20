package com.orte.javaessential.object_class.example3;

public class Main {
    public static void main(String[] args) {
        // Method equals aren't redefined
    Car car1 = new Car(1);
    Car car2 = new Car(2);
    Car car3 = car1;

    // compare objects by ref (different objects)
        System.out.println(car1.equals(car2)); // false

     // refer to the same object
        System.out.println(car1.equals(car3)); // true

        System.out.println(car1 == car2); //false

        System.out.println(car1 == car3); // true

    }

}
