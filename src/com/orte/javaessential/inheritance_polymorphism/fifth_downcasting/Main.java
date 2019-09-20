package com.orte.javaessential.inheritance_polymorphism.fifth_downcasting;

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        instance.field1 = 1;
        instance.field2 = 2;
        instance.field3 = 3;
        instance.field4 = 4;
        instance.field5 = 5;

        BaseClass newInstance  =  (BaseClass) instance; // upcast
        System.out.println(newInstance.field1);
        System.out.println(newInstance.field2);
        System.out.println(newInstance.field3);
//        System.out.println(newInstance.field4);
//        System.out.println(newInstance.field5);

        // Check
        System.out.println("instance Id: " + instance.hashCode()); //instance Id: 883049899
        System.out.println("newInstance Id: " + newInstance.hashCode());  //newInstance Id: 883049899
    }
}
