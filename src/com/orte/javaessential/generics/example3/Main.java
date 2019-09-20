package com.orte.javaessential.generics.example3;

class MyClass{
    public <T> void method(T argument){
       // T variable = argument;

        System.out.println(argument);
    }
}

public class Main {
    public static void main(String[] args){
        MyClass instance = new MyClass();

        instance.method("Hello world!");
    }
}
