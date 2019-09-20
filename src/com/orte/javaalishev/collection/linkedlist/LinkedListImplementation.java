package com.orte.javaalishev.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListImplementation {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(2);
        myLinkedList.add(10);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));

        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}
