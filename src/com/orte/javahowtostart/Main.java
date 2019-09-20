package com.orte.javahowtostart;

import java.util.Scanner;

public class Main {
    public static String[] arraysFill(){
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        return str;
    }
    public static void arrayPrint(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void main(String[] args) {
      String[] array = arraysFill();
      arrayPrint(array);
    }
}
