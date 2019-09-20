package com.orte.javaprofessional.collections.example5_comparator.with_anonymous;

import com.orte.algorithmthdeepdive.Array;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 20, 4000);
        Animal bird = new Animal("King Penguin", 15, 8, 50000);

        Animal[] c = {cat, dog, bird};
        Arrays.sort(c, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.price - o2.price;
            }
        });

        for (Animal animal : c) {
            System.out.println(animal);
//            Animal{breed='Labrador', weight=30, speed=20, price=4000}
//            Animal{breed='Oriental', weight=7, speed=25, price=5000}
//            Animal{breed='King Penguin', weight=15, speed=8, price=50000}
        }
    }
}
