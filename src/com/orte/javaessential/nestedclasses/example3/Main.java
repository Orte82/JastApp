package com.orte.javaessential.nestedclasses.example3;

public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();
        instance.method(1);
    }
}

class MyClass { //outer or top-level class
    private int field = 0;

    public class Inner {
        MyClass instance = new MyClass();

        public void method(int a) {
            instance.field = a;
            System.out.println(instance.field);
        }
    }
}
