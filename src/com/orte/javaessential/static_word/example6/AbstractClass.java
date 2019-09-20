package com.orte.javaessential.static_word.example6;

public abstract class AbstractClass {
    // Fabric static method
    public static AbstractClass CreateObject(){
        return new ConcreteClass();
    }
    public abstract void method();
}
