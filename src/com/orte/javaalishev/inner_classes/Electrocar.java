package com.orte.javaalishev.inner_classes;

public class Electrocar {
    private int id;

    // inner non-static class
    // have access to Electrocar field
    // usually mada private

    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }

    // static nested class
    // doesn't have access to outer class fields
    // but have access to static fields
    // only logically connected to outer class
    public static class Battary{
        public void charge(){
            System.out.println("Battery is charging..");
        }
    }



    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        // inner class in outer class method
        // has access to outer fields and method vars (must be final or effectively final)
        final int x = 1;
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        System.out.println("Electrocar " + id + " is starting...");
    }
}
