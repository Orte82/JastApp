package com.orte.javaprofessional.collections.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(2, (o1, o2) -> o2-o1);
        // insert element in queue
        q.offer(7);
        q.offer(9);
        System.out.println(q);//[9, 7]
        q.offer(1);
        q.offer(6);
        System.out.println(q);//[9, 7, 1, 6]
        // return and delete head element of the queue
        System.out.println(q.poll());//9
        System.out.println(q.poll());//7
        System.out.println(q.poll());//6
        System.out.println(q);//[1]
    }
}

