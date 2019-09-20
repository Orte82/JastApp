package com.orte.javaprofessional.collections.example2_iterator.iteratror;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(5);
        al.add(8);

        System.out.println(al);//[2, 5, 8]
        //Iterator

        Iterator<Integer> iterator = al.iterator();
        //ask weather is a next element in list. if true => cycle continued
        // iterator doesn't get exhausted
        while (iterator.hasNext()){
            // goto next list element and print it
            Integer tmp = iterator.next();
            System.out.println(tmp);
//            2
//            5
//            8
        }
        while (iterator.hasNext()){
            // goto next list element and print it
            Integer tmp = iterator.next();
            System.out.println(tmp);
//            2
//            5
//            8
        }
        // optimized iterator for lists

        ListIterator<Integer> listIterator = al.listIterator();
        while (listIterator.hasNext()){
            Integer tmp = listIterator.next();
            System.out.println(tmp  );
        }
    }
}
