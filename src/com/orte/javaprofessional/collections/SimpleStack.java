package com.orte.javaprofessional.collections;

import com.orte.javaalishev.Simple;

public class SimpleStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public SimpleStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long element) {
        stackArray[++top] = element;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

class StackMain {
    public static void main(String[] args) {
        SimpleStack simpleStack = new SimpleStack(10);
        simpleStack.push(200);
        simpleStack.push(300);
        simpleStack.push(400);
        simpleStack.push(500);
        simpleStack.pop();

        simpleStack.peek();
        simpleStack.isEmpty();

        isEmpty(simpleStack);

    }

    private static void isEmpty(SimpleStack simpleStack) {
        while (!simpleStack.isEmpty()){
            long popElement = simpleStack.pop();
            System.out.println(popElement);
        }
    }
}