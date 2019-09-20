package com.orte.javaprofessional.input_output.fourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleBufferedReader {
    public static void main(String[] args) {

//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
//            String str = br.readLine();
//            int num = Integer.parseInt(str);
//            System.out.println(num);
//
//        } catch (IOException e) {
//            e.printStackTrace();
////        }
//// system.in =>bytes
//        int i = 0;
//        try {
//            i = System.in.read();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(i); // reads bytes
//        System.out.println((char)i); // converts to char

        InputStreamReader is =  new InputStreamReader(System.in);
        int i2 = 0;
        try {
            i2 =  is.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(i2);
        System.out.println((char)i2);

        // System.in reads bytes
        // InputStreamReader reads symbols
        // BufferedReader reads strings (text) and buffers them value 8192

        // Scanner has buffer of 1024
    }
}
