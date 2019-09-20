package com.orte.javaessential.nestedclasses.example1;

public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();
        instance.method();
    }
}
class MyClass{ //outer or top-level class
    public class Inner{
        public void method() {
            System.out.println("Method form Inner class");
        }
    }
}
