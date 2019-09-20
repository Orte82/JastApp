package com.orte.javahowtostart;

import java.util.Scanner;

public class ArrayForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Write "+ i + " index of array");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        for(int i: arr){
            System.out.println("args = [" + i + "]");
        }
    }
}
