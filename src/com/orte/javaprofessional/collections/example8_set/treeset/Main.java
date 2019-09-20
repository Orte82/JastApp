package com.orte.javaprofessional.collections.example8_set.treeset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> ts = new TreeSet<>();
        ts.add(7);
        ts.add(2);
        ts.add(14);
        NavigableSet<Car> tc = new TreeSet<>();
        tc.add(new Car(5000));
        tc.add(new Car(3000));
        System.out.println(tc);
        // create subcollection headSet not more than five inclusive
        NavigableSet<Integer> ts1 = ts.headSet(5, true);
        System.out.println(ts1);
        ts1.add(3);
        System.out.println(ts);
        System.out.println(ts1);
        ts.add(8);
        System.out.println(ts + "\n" + ts1);
        // ts1.add(6) => will throw IllegalArgumentException
        Iterator<Integer> iterator = ts.iterator(); //
        while (iterator.hasNext()){
            Integer temp =  iterator.next();
            temp++; // can't change value of temp

        }
        System.out.println(ts);
        Iterator<Car> carIterator =  tc.iterator();
        while (carIterator.hasNext()){
            Car temp = carIterator.next();
            temp.price++;
        }

        System.out.println(tc);


    }
}
class Car implements Comparable<Car>{
    int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "" + this.price;
    }

    @Override
    public int compareTo(Car o) {
        return this.price - o.price;
    }
}