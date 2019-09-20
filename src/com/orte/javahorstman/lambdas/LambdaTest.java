package com.orte.javahorstman.lambdas;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"Mars", "Jupiter", "Saturn"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length");
        Arrays.sort(planets, (s1, s2)-> s1.length() - s2.length());
        //Arrays.sort(planets, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));
        t.start();
        JOptionPane.showMessageDialog(null, "Quit");
        System.exit(0);
    }
}
// list.removeIf(e -> e == null);

// ArrayList<Sting> name = ...;
// Stream<Person> stream = names.stream().map(Person::new);
// List<Person> people = stream.collect(Collectors.toList);

// int[]::new => x -> new int[x];

// Person[] people = stream.toArray(Person[]::new);