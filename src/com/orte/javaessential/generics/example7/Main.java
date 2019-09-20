package com.orte.javaessential.generics.example7;




public class Main {
    public static void main(String[] args) {
        MyClass<Base> mc1 = new MyClass<>();
        MyClass<Derived> mc2 = new MyClass<>();
       // MyClass<String> mc3 = new MyClass<>(); error


    }
}

class Base {
}

class Derived extends Base {
}

class MyClass<T extends Base>{

}