package com.orte.javaessential.nestedclasses.example2;

public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();
        instance.method(1);
    }
}

class MyClass{ //outer or top-level class
    private static int field = 0;
    public class Inner{
        public void method(int a) {
            field = a;
            System.out.println(field);
        }
    }
}
