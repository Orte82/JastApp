package com.orte.pluralsight.javadatastructures.queue;

public class BasicQueue<T> {
    private T[] data;
    private int front;
    private int end;


    public BasicQueue() {
        this(1000);
    }

    public BasicQueue(int size) {
        this.front = -1;
        this.end = -1;
        data = (T[]) new Object[size];
    }

    public int size() {
        if (this.front == -1 && this.end == -1) {
            return 0;
        } else {
            return this.end - this.front + 1;
        }
    }

    public void enQueue(T item) {
        // check if queue is full
        if ((end + 1) % data.length == front) {
            throw new IllegalArgumentException("The queue is full");
        }
        // otherwise check to see if any items have been added to the queue yet
        else if (size() == 0) {
            front++;
            end++;
            data[end] = item;
        }
        //otherwise add the item to the end of the queue
        else {
            end++;
            data[end] = item;
        }
    }

    public T deQueue() {
        T item = null;

        //if the queue is empty we can't dequeue anything
        if (this.size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        //otherwise if this is the last item on the queue, the queue needs tho get reset to empty
        else if (front == end) {
            item = data[front];
            data[front] = null;
            front = -1;
            end = -1;

        }
        //otherwise grab the front of the queue, return it and adjust the front pointer
        else {
            item = data[front];
            data[front] = null;
            front++;
        }
        return item;
    }

    public boolean contains(T item) {
        boolean found = false;
        // if the queue is empty just immediately return false
        if (size() == 0) {
            return false;
        }
        for (int i = front; i < end; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public T access(int position) {
        if(size()==0||position> size()){
            throw new IllegalArgumentException("Wrong position");
        }
        int trueIndex = 0;
        for (int i = front; i < end; i++) {
            if(trueIndex == position){
                return data[i];
            }
            trueIndex++;
        }
        //if we didn't find the item throw an exception
        throw new IllegalArgumentException("Could not get queue item at position: " + position);
    }


}
