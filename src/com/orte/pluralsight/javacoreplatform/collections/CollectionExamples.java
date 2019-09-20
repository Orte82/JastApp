package com.orte.pluralsight.javacoreplatform.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class CollectionExamples {
    public static void main(String[] args) {
        SortedMap<String,String> map = new TreeMap<>();
        map.put("2222", "ghi");
        map.put("3333", "abc");
        map.put("1111", "def");
        map.put("6666", "xyz");
        map.put("4444", "mno");
        map.put("5555", "pqr");

        map.forEach((k, v)-> System.out.println(k +" | "+v));
        // ordered by key
        System.out.println();
        SortedMap<String, String> hMap = map.headMap("3333");
        hMap.forEach((k, v)-> System.out.println(k +" | "+v));
    }
}
