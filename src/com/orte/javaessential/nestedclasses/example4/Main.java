package com.orte.javaessential.nestedclasses.example4;

public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();
        instance.methodFromBase();
        instance.methodFromInner();
    }
}

class MyClass { // inheritance from BaseClass doesn't extend to outer class


    public class Inner extends BaseClass{
     public void methodFromInner(){
         System.out.println("Method from Inner class");
     }
    }
}
