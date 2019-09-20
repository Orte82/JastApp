package com.orte.javaessential.object_class.example6;

public class Main {
    public static void main(String[] args) {
        // Method hash is redefined
        Car car1 = new Car("1", 12, 1.8F);
        Car car2 = new Car("2", 21, 1.6F);
        Car car3 = new Car("3", 10, 1.4F);

        System.out.println(car1.hashCode());//681609171
        System.out.println(car2.hashCode());//707171748
        System.out.println(car3.hashCode());//888469740

    }

}
