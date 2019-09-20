package com.orte.javaessential.anonymousclasses.example3;

public class Main {
    public static void main(String[] args) {
        Interface instance = new Interface() {
            public int publicField = 3;
            @Override
            public void method() {
                publicField = 1234;
                System.out.println("instance1: publicField = " + getPublicField());
            }
            public int getPublicField(){return publicField;}
        };
        instance.method();
        //method can't be accessed
//        System.out.println(instance.getPublicField());
    }
}
interface Interface{
    void method();
}