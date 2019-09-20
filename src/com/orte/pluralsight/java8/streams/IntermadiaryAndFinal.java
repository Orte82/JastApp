package com.orte.pluralsight.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermadiaryAndFinal {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

        Predicate<String> p1 = Predicate.isEqual("two");
        Predicate<String> p2 = Predicate.isEqual("three");
        List<String> list = new ArrayList<>();
        stream
                .peek(System.out::println) //intermediary operation (lazy)
                .filter(p1.or(p2)) // intermediary operation (lazy)
                .forEach(list::add); //final operation (not lazy)
        // only final operation trigger data processing in the stream
        System.out.println("Done!");
        System.out.println("size = " + list.size()); //2
    }
}
