package com.orte.javaessential.static_word.example7;

abstract class BaseClass {
    // static member can't be abstract
    // static member can't be redefined
    public static void staticMethod() {
        System.out.println("BaseClass.staticMethod");
    }


}

class DerivedClass extends BaseClass {
    public static void staticMethod() {
        System.out.println("DerivedClass.staticMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        BaseClass.staticMethod();
        DerivedClass.staticMethod();
    }
}
