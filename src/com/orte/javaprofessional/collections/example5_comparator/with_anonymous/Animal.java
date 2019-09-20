package com.orte.javaprofessional.collections.example5_comparator.with_anonymous;

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
