package com.orte.javaprofessional.collections.example5_comparator.with_objects;

import java.util.Comparator;

public class Animal {
    String breed;
    int weight;
    int speed;
    int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
class ComparatorByPrice implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).price - ((Animal)o2).price;
    }

}
class ComparatorBySpeed implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).speed - ((Animal)o2).speed;
    }

}

class ComparatorByColor implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).breed.compareTo(((Animal)o2).breed);
    }

}