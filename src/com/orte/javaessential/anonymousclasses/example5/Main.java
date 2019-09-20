package com.orte.javaessential.anonymousclasses.example5;


interface Interface {
    void method();

    int getValue();
}

public class Main {
    public static void main(String[] args) {
        Interface instaince1  = new Interface() {
            int field  =0;
            @Override
            public void method() {
                field =100;
            }

            @Override
            public int getValue() {
                return field;
            }
        };
        Interface instance2 = new Interface() {
            int field = -1;

            @Override
            public void method() {
                field = instaince1.getValue();
            }

            @Override
            public int getValue() {
                return field;
            }
        };
        instaince1.method();
        instance2.method();
        System.out.println("instaince1: field = " + instaince1.getValue() +"    instance2: field = " + instance2.getValue());
    }
}
