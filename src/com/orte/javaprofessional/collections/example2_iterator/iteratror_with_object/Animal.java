package com.orte.javaprofessional.collections.example2_iterator.iteratror_with_object;

public class Animal {
    String breed;
    int price;

    Animal(String breed, int price){
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed + " = " + price;
    }
}
