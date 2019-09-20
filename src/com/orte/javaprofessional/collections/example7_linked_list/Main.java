package com.orte.javaprofessional.collections.example7_linked_list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        Date currentTime = new Date();
        insert100000(list);
        Date newTime = new Date();

        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is: " + msDelay + " in ms");
        return msDelay;
    }

    public static void insert100000(List list){
        for (int i = 0; i < 100000; i++) {
            list.add(0, new Object());
        }
    }
}
