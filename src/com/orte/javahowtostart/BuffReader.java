package com.orte.javahowtostart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        // System.in => reads bytes of input
        // InputStreamReader => reads symbols
        // BufferedReader => reads strings and buffers read symbols and this augments productivity
        InputStreamReader isr = new InputStreamReader(System.in);
        for(;;){
            int byteValue = isr.read();
//            System.out.println(byteValue);
            System.out.println((char)byteValue);
        }
    }
}
