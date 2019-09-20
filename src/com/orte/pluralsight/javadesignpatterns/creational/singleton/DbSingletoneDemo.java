package com.orte.pluralsight.javadesignpatterns.creational.singleton;

public class DbSingletoneDemo    {
    public static void main(String[] args) {
        DbSingleton singleton = DbSingleton.getInstance();
        //DbSingleton testConstructor = new DbSingleton(); // error

        System.out.println(singleton);

        DbSingleton anotherSingleton = DbSingleton.getInstance();
        System.out.println(anotherSingleton);
    }
}
