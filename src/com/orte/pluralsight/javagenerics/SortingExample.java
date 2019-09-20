package com.orte.pluralsight.javagenerics;

import com.orte.javaprofessional.collections.Collection;

import java.util.*;

public class SortingExample {
    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);
        Comparator<Person> name = Comparator.comparing(Person::getName);
        Comparator<Person> age = Comparator.comparing(Person::getAge);
        Collections.sort(madMen, age);
//        Collections.reverse(madMen);
        System.out.println(madMen);
        Collections.sort(madMen, name);
        System.out.println(madMen);
        Collections.sort(madMen, new ReverseComparator<>(new AgeComparator())); //
        // decorator pattern
        System.out.println(madMen);
    }
}
