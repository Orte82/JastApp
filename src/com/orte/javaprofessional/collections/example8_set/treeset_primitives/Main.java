package com.orte.javaprofessional.collections.example8_set.treeset_primitives;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> ts = new TreeSet<>();
        ts.add(7);
        ts.add(2);
        ts.add(14);
        ts.add(10);
        System.out.println(ts); //[2, 7, 10, 14]
        System.out.println(ts.add(7));//false
        System.out.println(ts);//[2, 7, 10, 14]
        System.out.println(ts.ceiling(2));//2
    }
}
