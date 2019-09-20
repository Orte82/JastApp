package com.orte.pluralsight.javagenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LegacyCode {
    public static void main(String[] args) {
        // backward compatibility is ensured in Java
        // Raw type => usage a generic types without generic parameters
        // introduce runtime errors and unsafe scenarios in code
        List list = new ArrayList<>();
        list.add("abc");
        list.add(1);
        list.add(new Object());
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            final Object element = iterator.next();
            System.out.println(element);
        }
    }
}
