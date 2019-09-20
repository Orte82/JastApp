package com.orte.javaprofessional.collections.example8_set.hashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("banana");
        set.add("watermelon");
        set.add("melon");
        set.add("raspberry");
        set.add("iris");
        set.add("potato");
        for (String s : set) {
            System.out.println(s + " " + s.hashCode());
//            banana -1396355227
//            raspberry -353667638
//            iris 3240979
//            potato -982438873
//            watermelon 1973903356
//            melon 103780019

        }
    }
}
