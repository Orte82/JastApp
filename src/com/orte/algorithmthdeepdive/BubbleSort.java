package com.orte.algorithmthdeepdive;

public class BubbleSort {
    // in-place algorithm
    // O(n^2) time complexity
    // Algorithm degrades quickly
    // Stable sort algorithm => equal values don't change their relative positions
    public static void main(String[] args) {
        int[] arrayToSort = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsorted = arrayToSort.length - 1; lastUnsorted > 0; lastUnsorted--) {
            for (int i = 0; i < lastUnsorted; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    swap(arrayToSort, i, i + 1);
                }
            }
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
