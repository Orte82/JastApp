package com.orte.javaprofessional.collections.priority_queue.array_deque;

import com.orte.buchankajava.arrays.Array;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();
        // standard elements add
        states.add("Ukraine");
        states.add("France");

        //pushing elements in the beginning
        states.push("Great Britain");

        //obtain first element without deletion
        String sFirst = states.getFirst();
        String sLast = states.getLast();

        while (states.peek() != null) {
            //obtaining first element from beginning
            System.out.println(states.pop());
//            Great Britain
//            Ukraine
//            France
        }

        System.out.println("Queue size: " + states.size()); //0

        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        for (Person person : people) {
            System.out.println(person.getName());
        }

    }

}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}