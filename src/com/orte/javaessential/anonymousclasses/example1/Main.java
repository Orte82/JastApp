package com.orte.javaessential.anonymousclasses.example1;

public class Main {
    public static void main(String[] args) {
        //anonymous internal class declaration
        Interface1 instance = new Interface1() {
            @Override
            public void method() {
                System.out.println("Call method() from anonymous class.");
            }
        };

        System.out.println(instance.getClass().toString());
        instance.method();
    }
}
interface Interface1 {
    void method();
}
