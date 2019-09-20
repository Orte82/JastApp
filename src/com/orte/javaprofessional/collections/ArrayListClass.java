package com.orte.javaprofessional.collections;

public class ArrayListClass {
    // automatic extended array can be extended in runtime

    // ArrayList list = new ArrayList(); => raw type
    // Must be used with generics to ensure same type of objects in ArrayList
    // ArrayList<String> list = new ArrayList<String>();

    // if array is reached full capacity it creates new array which is length of old array + 1/2 old array + 1 and copies old array in it


    // has method remove(int index) or remove(Object o) => removes first founded element and all elements will be shifted to the left
    // add(E element), add(int index, E element)
    // clear() => remove all elements
    // get(int index) return element of index
    // set(int index, E element) rewrites element of index
    // size() => length
    // toArray() returns array of elements of the list
    // indexOf(Object o) returns elements position in the list if didn't find returns -1
    // contains(Object o) returns true if list contains element o
}
