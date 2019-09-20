package com.orte.javaessential.generics.example2;


class MyGenerics<TYPE1, TYPE2>{

    public TYPE1 variable1;
    public TYPE2 variable2;

    public MyGenerics(TYPE1 variable1, TYPE2 variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }
}

public class Main {
    public static void main(String[] args) {
        MyGenerics<Integer, Integer> instance1 = new MyGenerics<>(1,2);
        System.out.println(instance1.variable1 + instance1.variable2); //3

        MyGenerics<String, Integer> instance2 = new MyGenerics<>("Number ",2);
        System.out.println(instance2.variable1 + instance2.variable2); // Number 2

        MyGenerics<String, String> instance3 = new MyGenerics<>("Hello ","World");
        System.out.println(instance3.variable1 + instance3.variable2); // Hello World
    }
}
