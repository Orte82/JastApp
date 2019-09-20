package com.orte.javaessential.inheritance_polymorphism.first;

public class Inheritance {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
//        System.out.println(instance.privateField); //error only inside BaseClass or through getter method
        System.out.println(instance.protectedField);
        System.out.println(instance.publicField);

        instance.show();
        BaseClass up = new DerivedClass();  //Upcasting => typecasting from derived class to base class
        DerivedClass down = (DerivedClass) up;  //Downcasting => typecasting from base class class to derived class
    }
}
