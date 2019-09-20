package com.orte.pluralsight.javadatastructures.stack;

public class BasicStack<T> implements Stack<T> {
    private T[] data;
    private int stackPointer;

    public BasicStack() {
        this.data = (T[]) new Object[1000];
        this.stackPointer = 0;
    }
    @Override
    public void push(T newItem) {
        data[stackPointer++] = newItem;
    }
    @Override
    public T pop() {
        if (stackPointer == 0) {
            throw new IllegalStateException("No more items in the stack");
        }
        return data[--stackPointer];
    }
    @Override
    public boolean contains(T item) {
        boolean found = false;
        for (int i = 0; i < stackPointer; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }
        return found;
    }
    @Override
    public T access(T item) {
        while(stackPointer>0){
            T topItem = pop();
            if(item.equals(topItem)){
                return topItem;
            }
        }
        throw new IllegalArgumentException("Could not find item on the stack: " + item );
    }
    public int size(){
        return stackPointer;
    }
}
