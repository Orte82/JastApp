package com.orte.javaalishev.generics;

public class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }
    public void eat(){
        System.out.println("Eating");
    }
    public String toString() {
        return String.valueOf(id);
    }
}
