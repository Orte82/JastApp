package com.orte.algorithmthdeepdive;

import java.util.Arrays;
import java.util.stream.Collectors;
public class Array {
    public static void main(String[] args) {
        // in Java stati DT
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -11;

        int index = -1;
        for (int value : intArray) {
            if (value == 7) {
                index = Arrays.stream(intArray).boxed().collect(Collectors.toList()).indexOf(value);
                break;
            }
        }
        System.out.println("index = " + index);
        // Array is a contiguous block of memory
        // Every element of array occupies the same amount of space in memory
        // element is 4 bytes in Java
        // in array stores object references but not object
        // array memory address easily calculated based on its index
        // index in array is known, the time to find element in the array will be the same O(1)

        // Array operations
        // arrayElementMemoryAddress = firstElementMemoryAddress + (indexOfElement * sizeOfElement)
        // element without index => O(n)
        // add element to full array O(n)
        // add element to the end of the array (has space) O(1)
        // insert or update element at a specific index O(1)
        // delete element by setting it to null O(1)
        // delete element by shifting elements O(n)

    }
}
