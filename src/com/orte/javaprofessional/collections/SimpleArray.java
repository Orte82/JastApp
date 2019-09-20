package com.orte.javaprofessional.collections;

import java.util.ArrayList;

public class SimpleArray {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("Simple");
//        list.add(34);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(0,30);
        al.add(40);
        for (Integer integer : al) {
            System.out.println(integer);
        }
//        list2.add(list.get(0));
//        list2.add((Integer)list.get(0));   // error using raw types
//        System.out.println(list2.get(0));
    }
}
