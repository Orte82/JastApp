package com.orte.javaprofessional.collections.example3_sorting.sorting_objects;

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
    // by speed and then price;
    @Override
    public int compareTo(Object o) {
        int tmp = this.speed - ((Animal)o).speed;

        if(tmp == 0){
            return this.price - ((Animal)o).price;
        }else{
            return tmp;
        }
    }
}
