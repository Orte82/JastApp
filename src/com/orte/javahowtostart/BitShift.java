package com.orte.javahowtostart;

public class BitShift {
    //  253 << = -12
    // 1111 1101  253
    //           << 2
    // 1111 0100  -12
    public static void main(String[] args) {
        System.out.println(10 << 2); // 40
        System.out.println(10 >> 2); // 2
        System.out.println(10 >> 1); // 5

        System.out.println(-256 >>> 31); //1
        System.out.println(-256 >>> 30); //3

    }
}
