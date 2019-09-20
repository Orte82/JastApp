package com.orte.algorithmthdeepdive;

public class InsertionSort {
    public static void main(String[] args) {
        // in-place algorithm
        // O(n^2) complexity
        // stable algorithm
        int[] arrayToSort = {20, 35, -15, 7, 55, 1, -22};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < arrayToSort.length; firstUnsortedIndex ++){
            int newElement = arrayToSort[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && arrayToSort[i-1] > newElement; i--){
                arrayToSort[i] = arrayToSort[i-1];

            }
            arrayToSort[i] = newElement;
        }

        for (int i = 0; i <  arrayToSort.length; i++) {
            System.out.println(arrayToSort[i]);
        }
    }
}
