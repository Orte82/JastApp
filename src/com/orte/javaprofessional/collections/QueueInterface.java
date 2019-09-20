package com.orte.javaprofessional.collections;

public class QueueInterface {
    // FiFo
    // PriorityQueue => only straight implementation of Queue interface, which sort elements in natural order using
    // Comparable interface or with Comparator obtained in constructor
    // Queue<E> q = new LinkedList<>(); PriorityQueue<E> pq = new PriorityQueue();
    // interface Queue extends Collection interface
    // interface Deque extends interface Queue
    // PriorityQueue extends AbstractQueue which implements Queue (FIFO)
    // LinkedList extends AbstractSequentialLists and implements Deque (LiFO) (1.6 java)

    // methods of Queue
    // boolean add(E o) adds element in queue if queue is full throws IllegalStateException
    // boolean offer(E o) adds element in queue if possible
    // E element() returns but doesn't delete head element of queue
    // E peek() returns but doesn't delete head element of queue, returns null if queue is empty
    // E poll() returns and deletes head element of the queue returns null if queue is empty
    // E remove() returns and deletes head element of the queue
    // methods element() and remove() from peek() and poll() methods so that they throw NoSuchElementException if queue is empty


    // Deque implements behavior of double directional queue which works as one directional queue, stack (LiFO)
    // ArrayDeque<E> ad = new ArrayDeque<>();

    // methods
    // void addFirst(E obj)
    // void addLast(E obj)
    // E getFirst()
    // E getLast()
    // boolean offerFirst(E obj)
    // boolean offerLast(E obj)
    // E removeFirst() => removes and returns element from queue beginning and throws NoSuchElementException if queue is empty
    // E peekFirst()
    // E peekLast()
    // E pollFirst(
    // E pollLast()
    // E pop() returns with deletion element from the beginning of string. If queue is empty throws NoSuchElementException
    // void push(E element) add element in the beginning of the queue

    // in such a way existence of push and pop methods allows to implement stack behavior
    // And other methods allow to create double directional queues
}
