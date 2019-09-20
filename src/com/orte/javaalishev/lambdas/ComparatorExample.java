package com.orte.javaalishev.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Goodbye");
        list.add("ab");
        list.add("a");

        list.sort(Comparator.comparingInt(String::length));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
