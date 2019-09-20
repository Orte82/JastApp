package com.orte.javaessential.inheritance_polymorphism.fourth;

public class Animal {
    private int weight;
    private String brade;
    public Animal(){}
    public Animal(int weight, String brade) {
        this.weight = weight;
        this.brade = brade;
    }

    public int getWeight() {
        return weight;
    }

    public String getBrade() {
        return brade;
    }
}
