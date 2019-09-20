package com.orte.algorithmthdeepdive;

class MergeSort {
    // divide and conquer algorithm
    // recursive algorithm
    // two phases: splitting and Merging
    // splitting is logical. We don't create new arrays
    // start with unsorted array
    // divide array into two arrays
    // keep splitting until arrays with 1 element left- now they are sorted

    // NOT an in-place algorithm
    // O(n * log(n)) complexity
    // Stable algorithm

    public static void main(String[] args) {
        int[] arrayToSort = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(arrayToSort, 0, arrayToSort.length);

        for (int value : arrayToSort) {
            System.out.println(value);
        }
    }

    // 20, 35, -15, 7, 55, 1, -22
    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIdex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIdex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        // {32, 34}, {33, 36}
        // {32, 33, 34} => optimization
        System.arraycopy(input, i, input, start + tempIdex, mid - i);
        System.arraycopy(temp, 0, input, start,tempIdex);
    }

}
