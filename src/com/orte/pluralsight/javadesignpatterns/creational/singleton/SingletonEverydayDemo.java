package com.orte.pluralsight.javadesignpatterns.creational.singleton;

public class SingletonEverydayDemo {
    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);
        Runtime anotherRuntime = Runtime.getRuntime();
        System.out.println(anotherRuntime);
        if(singletonRuntime == anotherRuntime){
            System.out.println("They are the same instance");
        }
    }
}
