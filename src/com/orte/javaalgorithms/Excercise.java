package com.orte.javaalgorithms;

import edu.princeton.cs.introcs.StdOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise {
    public static void main(String[] args) {
        // 1.1.1
        System.out.println((0 + 15) / 2); //7
        System.out.println(2.0e-6 * 100000000.1);// 200.0000002
        System.out.println(true && false || true && true); // true
        // 1.1.2
        System.out.println((1 + 2.236) / 2); // 1.618
        System.out.println(1 + 2 + 3 + 4.0); // 10.0
        System.out.println(4.1 >= 4); // true
        System.out.println(1 + 2 + "3"); // "33"
        // 1.1.3
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int a, b, c;
            a = 3; //Integer.parseInt(reader.readLine());
            b = 3; //Integer.parseInt(reader.readLine());
            c = 3; //Integer.parseInt(reader.readLine());
            if (a == b && b == c) {
                System.out.println("Equal");
            } else {
                System.out.println("Not equal");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 1.1.4
        // if(a > b) c = 0;
        // if(a > b) c = 0
        // else b = 0;

        // 1.1.5
        double x, y;
        x = 0.4;
        y = 0.4;
        System.out.println((x > 0 && y > 0 && x < 1 && y < 1));
        // 1.1.6
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
        // 1.1.7
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) t = (9.0 / t + t) / 2.0;
        StdOut.printf("%.5f\n", t);

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);

        int sum2 = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum2++;
            }
        }
        StdOut.println(sum2);

        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
        //1.1.9
        System.out.println(toBinary(15));
        // 1.1.11
        boolean[][] booleans = {
                {true, false, false},
                {false, false, false},
                {true, true, false}
        };

        booleanPrint(booleans);
        //1.1.12
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) a[i] = 9 - i;
        for (int i = 0; i < 10; i++) a[i] = a[a[i]];
        for (int i = 0; i < 10; i++) System.out.println(i);
        //

    }

    public static String toBinary(int num) {
        String s = "";
        for (int i = num; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        return s;
    }

    public static void booleanPrint(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }

        }
    }
}
