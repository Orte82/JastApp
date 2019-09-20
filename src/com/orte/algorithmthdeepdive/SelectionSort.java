package com.orte.algorithmthdeepdive;

public class SelectionSort {
    // in-place algorithm = > don't use extra memory
    // O(n^2) time complexity
    // doesn't require as much swapping ass bubble sort
    // unstable algorithm => equal elements change their relative positions
    public static void main(String[] args) {


        int[] arrayToSort = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsorted = arrayToSort.length - 1; lastUnsorted > 0; lastUnsorted--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsorted; i++) {
              if(arrayToSort[i] > arrayToSort[largest]){
                  largest = i;
              }

            }
            swap(arrayToSort,largest, lastUnsorted);
        }
        for (int elem : arrayToSort) {
            System.out.print(elem + " ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
