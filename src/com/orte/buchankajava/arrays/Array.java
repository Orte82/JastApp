package com.orte.buchankajava.arrays;

public class Array {
    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        myIntArray = new int[10];
//        myIntArray[5] = 50;
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }


        double[] myDoubleArray = new double[20];
        System.out.println(myIntArray[5]);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }
}
