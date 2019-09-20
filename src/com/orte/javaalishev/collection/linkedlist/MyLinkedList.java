package com.orte.javaalishev.collection.linkedlist;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

    public void add(int value) {
        // first addition to list
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;
        while (temp != null) {
            if (currentIndex == index) {
                return temp.getElement();

            } else {
                temp = temp.getNext();
                currentIndex++;

            }
        }
        throw new IllegalArgumentException();

    }

    public void remove(int index) {
        if(index == 0){
            head = head.getNext();
            size--;
            return;
        }

        int currentIndex = 0;
        Node temp = head;
        while (temp != null) {
            if (currentIndex == index - 1) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;

            }
        }
        throw new IllegalArgumentException();

    }

    public String toString() {
        int[] result = new int[size];
        int index = 0;
        Node temp = head;
        while (temp != null) {
            result[index++] = temp.getElement();
            temp = temp.getNext();
        }
        return Arrays.toString(result);

    }

    private static class Node {
        private int element;
        private Node next;

        public Node(int element) {
            this.element = element;

        }

        public int getElement() {
            return element;
        }

        public void setElement(int element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
