package com.orte.algorithmthdeepdive;

public class Recursion {
    public static void main(String[] args) {
        int factorial1 = recurtionMethod(5);
        int factorial2 = iterFactorial(5);
        System.out.println(factorial1);
        System.out.println(factorial2);
    }

    public static int iterFactorial(int num) {
        if (num == 0) {
            return 1; // recursion base case
        }
        int factorial = 1;
        for (int i = 1; i <=num; i++) {
                    factorial *= i;
        }
        return factorial;
    }


    public static int recurtionMethod(int number) {
        if (number == 0) {
            return 1;
        }
        return number * recurtionMethod(number - 1);
    }
}
