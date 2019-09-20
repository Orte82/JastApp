package com.orte.pluralsight.javagenerics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        Map<String, Person> madMen =new HashMap<>();
        madMen.put(donDraper.getName(), donDraper);
        madMen.put(peggyOlson.getName(), peggyOlson);
        madMen.put(bertCooper.getName(), bertCooper);
        // three iteration combination
        for(String name: madMen.keySet()){
            System.out.println(name);
        }
        for(Person person: madMen.values()){
            System.out.println(person);
        } for(Map.Entry<String, Person> entry: madMen.entrySet()){
            System.out.println(entry.getKey()+" | " + entry.getValue());
        }

        System.out.println(madMen);


    }
}
