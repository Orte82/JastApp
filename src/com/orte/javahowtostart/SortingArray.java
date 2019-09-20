package com.orte.javahowtostart;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static int[] arrayFill(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Input length of array");
        int length = sc.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Write " + i + " index of array");
            arr[i] = sc.nextInt();

        }
        return arr;
    }
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j <array.length-1; j++) {
                if(array[j+1] < array[j]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
      int[] arr = arrayFill();
      bubbleSort(arr); //Arrays.sort(arr);

    }
}
