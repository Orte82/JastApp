package com.orte.algorithmthdeepdive;

public class ShellSort {
    public static void main(String[] args) {
        // Shell sort is a subclass of Insertion sort algorithm
        // it uses pre-sort with gap, based on array length
        // in-place algorithm
        // Difficulty max O(n^2) but can be decreased using gap (method of calc gap is essential)
        // require less shifting than Insertion sort
        // Unstable algorithm
        int[] arrayToSort = {20, 35, -15, 7, 55, 1, -22};
        for (int gap = arrayToSort.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < arrayToSort.length; i++) {
                int newElement = arrayToSort[i];
                int j = i;
                while (j >=gap && arrayToSort[j-gap] > newElement){
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                }
                arrayToSort[j] = newElement;
            }
        }


        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i]);
        }


    }
}
