package com.orte.javaessential.generics.example1;

class MyClass<T>{
    public T field;

    public void method(){
        System.out.println(field.getClass());
    }
}

public class Main {
    public static void main(String[] args) {
        // Passing String type to a generic parameter
        MyClass<String> instance1 = new MyClass<>();
        instance1.field = "ABC";
        instance1.method(); //class java.lang.String

        // Can't pass primitives as parameter
//        MyClass<int> instance2 = new MyClass<>();
//        instance2.method();

        MyClass<Integer> instance2 = new MyClass<>();
        instance2.field = 1234;
        instance2.method(); //class java.lang.Integer
    }

}
