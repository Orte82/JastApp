package com.orte.javaprofessional.collections.example1_foreach.foreach;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Sphinx", 4000);
        Animal dog = new Animal("Malamute", 3000);
        Animal bird = new Animal("Crow", 2000);

        Animal[] c = {cat, dog, bird};
        for (Animal animal : c) {
            animal.price = animal.price +100; // object fields can be changed
            // animal = new Animal("Lion", 20000); // can't change objects in array
        }

        for (Animal animal : c) {
            System.out.println(animal.breed+ " " + animal.price);
//            Sphinx 4100
//            Malamute 3100
//            Crow 2100
        }
    }
}
