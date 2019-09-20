package com.orte.javaessential.inheritance_polymorphism;

public class Super {
    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass();// Base \n Derived
    }

}

class BaseClass{
    public BaseClass(){
        System.out.println("Base");
    }
}

class DerivedClass extends BaseClass{
    public DerivedClass(){
        super();  /// must be first
        System.out.println("Derived");
    }
}
