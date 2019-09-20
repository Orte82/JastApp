package com.orte.javaessential.nestedclasses.example5;

public class Main {
    public static void main(String[] args) {
       MyClass instance1 = new MyClass();
        instance1.methodFromBase();

        MyClass.Inner instance2 = new MyClass().new Inner();
        instance2.methodFromInner();
    }
}

class MyClass extends BaseClass {


    public class Inner {// inheritance from baseClass doesn't applied on inner class
     public void methodFromInner(){
         System.out.println("Method from Inner class");
     }
    }
}
