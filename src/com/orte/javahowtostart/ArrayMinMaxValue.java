package com.orte.javahowtostart;

public class ArrayMinMaxValue {
    public static void main(String[] args) {
        int[] arr = {5, 3, -10, 30, 20};
        int min = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("Min is: "+min);
    }
}
