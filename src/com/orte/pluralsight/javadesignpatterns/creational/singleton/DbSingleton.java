package com.orte.pluralsight.javadesignpatterns.creational.singleton;

public class DbSingleton {
    // eager load
    private static volatile DbSingleton instance;// = new DbSingleton();

    private DbSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        // lazy load
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }
}
