package com.orte.javahorstman.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<String> comp = new LengthComparator();
        String[] friends = {"Joe", "Peter", "Holand", "Mary"};
        Arrays.sort(friends, new LengthComparator());

        for (String friend : friends) {
            System.out.print(friend + " ");
        }
    }
}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String t1, String t2) {
        return t1.length() - t2.length();
    }
}