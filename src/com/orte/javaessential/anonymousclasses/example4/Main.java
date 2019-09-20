package com.orte.javaessential.anonymousclasses.example4;


interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        //local vars are accessible within anonymous class block declaration
        int n = 100;

        // anonymous inner class declaration
        Interface instance = new Interface() {
            public int publicField = 11;

            @Override
            public void method() {
//                n  = 200;
                publicField = n; //n must be final or effectively final and can't be changed
                System.out.println("instance: n = " + publicField);
            }
        };
        instance.method();
    }
}
