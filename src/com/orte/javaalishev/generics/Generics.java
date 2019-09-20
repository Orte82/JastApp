package com.orte.javaalishev.generics;

import com.orte.buchankajava.arrays.ArrayListExample;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dog");
        list.add("cat");
        list.add("bird");
        String animal = list.get(1);
        System.out.println(animal); //cat
        /// wildcards
        List <Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(3));
        listOfDogs.add(new Dog(4));

        test(listOfAnimals);
        test(listOfDogs); //without wildcards will be error

    }
    private static void test(List<? extends Animal> list){//wildcard => any class which is inherited from Animal
        // if <? super Animal> excepts objects derived from classes who are upper on a line of inheritance
        for(Animal animal: list){
            System.out.println(animal);
            animal.eat();
        }
    }
}
