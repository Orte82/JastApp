package com.orte.pattern.singleton;

public class TestSingleton {
    private static TestSingleton instance;

    public static TestSingleton getInstance(){
        if (instance == null){
            instance = new TestSingleton();
        }
        return instance;
    }
    private TestSingleton(){

    }
    public void print(){
        System.out.println(this);
    }
}
