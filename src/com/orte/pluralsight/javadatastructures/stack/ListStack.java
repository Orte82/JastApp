package com.orte.pluralsight.javadatastructures.stack;

import java.util.ArrayList;

public class ListStack<T> implements Stack<T> {
   private ArrayList<T> list;
   private int pointer;
   public ListStack(){
       this.list = new ArrayList<>();
       this.pointer = 0;
   }

    @Override
    public void push(T item) {
        list.add(pointer++, item);

    }

    @Override
    public T pop() {
       if(pointer < 0){
           throw new IllegalArgumentException("No more items");
       }
      return list.get(--pointer);

    }

    @Override
    public T access(T item) {
        while(pointer>0){
            T topItem = pop();
            if(item.equals(topItem)){
                return topItem;
            }
        }
        throw new IllegalArgumentException("Could not find item on the stack: " + item );
    }

    @Override
    public boolean contains(T item) {

        return list.contains(item)&&list.indexOf(item) < pointer;
    }

    public int size(){
       return pointer;
    }
}
