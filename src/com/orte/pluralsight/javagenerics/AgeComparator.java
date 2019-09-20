package com.orte.pluralsight.javagenerics;


import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person t1, Person t2) {
        return Integer.compare(t1.getAge(), t2.getAge());
        // reverse order => return -1 * Integer.compare(t1.getAge(), t2.getAge());
    }
}
