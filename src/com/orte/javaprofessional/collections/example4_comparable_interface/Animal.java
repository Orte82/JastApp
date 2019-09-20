package com.orte.javaprofessional.collections.example4_comparable_interface;

public class Animal implements Comparable{
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

    @Override
    public int compareTo(Object o) {
        return this.breed.compareTo(((Animal)o).breed);
    }
}
