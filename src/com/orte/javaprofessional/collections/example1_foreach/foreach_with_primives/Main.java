package com.orte.javaprofessional.collections.example1_foreach.foreach_with_primives;

public class Main {
    public static void main(String[] args) {
        int[] x = {2, 5, 6, 8, 9, 3};
        //for i cycle
//        for (int i = 0; i < x.length; i++) {
//            System.out.print(x[i] + " ");
//        }
//        System.out.println();


        // foreach
//        for (int tmp : x) {
//            System.out.print(tmp+" ");
//        }
//        System.out.println();
        //foreach with change of element
        for (int tmp : x) {
            ++tmp; // doesn't change array values, only changes in iterator
            System.out.print(tmp+" ");//3 6 7 9 10 4

        }
        System.out.println();


    }
}
