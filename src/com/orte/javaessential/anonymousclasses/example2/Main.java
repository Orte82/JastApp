package com.orte.javaessential.anonymousclasses.example2;

public class Main {
    public static void main(String[] args) {
        Interface instance = new Interface() {

            public double d = 1.3;
            protected String str = "Anonymous class";
            private int num = 10;

            @Override
            public void method() {
                num = 1234;
                System.out.println("instance1: d = " + d + ", str = " + str + ", num = " + num);
            }
        };
        instance.method();
//        System.out.println(instance.d); error => anonymous fields only seen within anon brackets
    }
}

interface Interface {
    void method();
}