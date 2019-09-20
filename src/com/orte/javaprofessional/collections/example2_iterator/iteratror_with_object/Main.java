package com.orte.javaprofessional.collections.example2_iterator.iteratror_with_object;


import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> al  = new ArrayList<>();
        al.add(new Animal("Sphinx", 5000));
        al.add(new Animal("Malamute", 4000));

        Iterator<Animal> carIterator = al.iterator();

        while (carIterator.hasNext()){
            Animal tmp = carIterator.next();
            tmp.price += 1000;
        }
        System.out.println(al);//[Sphinx = 6000, Malamute = 5000
    }
}
