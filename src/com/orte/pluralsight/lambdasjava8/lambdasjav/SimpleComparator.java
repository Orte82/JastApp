package com.orte.pluralsight.lambdasjava8.lambdasjav;

import java.util.Comparator;

public class SimpleComparator {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };               //param types can be omitted (s1, s2)
        Comparator<String> comparator2 = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
        Comparator<String> comparator3 = Comparator.comparingInt(String::length);
        int comp = comparator.compare("hello", "holo");
        System.out.print(comp);
        // Arrays.sort(tabStrings, comparator);
        Runnable r = () -> {
            int i = 0;
            while (i++ < 10) {
                System.out.println("It works!");
            }
        };
        // if more than 1 line of code in lambda and it has return statement
        //
//        (String s1, String s2)->{
//            System.out.println("I am comparing strings");
//            return Integer.compare(s1.length(), s2.length());
//        }

    }
}
