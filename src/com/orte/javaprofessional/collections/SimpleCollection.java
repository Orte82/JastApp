package com.orte.javaprofessional.collections;


import java.util.ArrayList;
import java.util.Collection;
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        Collection<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.add(1)); //true
        System.out.println(list.size()); //4

        list2.addAll(list);
        System.out.println(list2 + " "+ list2.size()); //[1, 2, 3, 1] 4
//        list2.clear(); // removes everything from collection
        System.out.println(list2.isEmpty()); //true

        Object[] arr = list2.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]); //1231
        }


    }

}
