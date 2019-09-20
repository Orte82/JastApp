package com.orte.pluralsight.javadatastructures.stack;

public interface Stack<E>{
    public void push(E item);
    public E pop();
    public E access(E item);
    public boolean contains(E item);
}
