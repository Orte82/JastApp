package com.orte.javaessential.inheritance_polymorphism.fourth;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(5, "Marsel", 6, "Sphinx");
        Cat cat2 = new Cat(3, "Barsik", 6, "Maine Coon");
        System.out.println(cat.age + " " + cat.name + " " + cat.getWeight() + " " + cat.getBrade());
        System.out.println(cat2.age + " " + cat2.name + " " + cat2.getWeight() + " " + cat2.getBrade());
    }
}
