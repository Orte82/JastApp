package com.orte.javahowtostart;

import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // exists three streams
        // system.out = > output
        // system.in => input
        // system.err => mistakes
//        int num = input.nextInt();
//        System.out.println(num);
//
//        float f1  = input.nextFloat();
//        System.out.println(f1);
//        String str = input.next(); // => inputs for the first blank " "
//        System.out.println(str);
//        String str = input.nextLine(); // => inputs all line before Enter
//        System.out.println(str);
//        int i = 10;
//        System.out.println("Enter integer value: ");
//        if(input.hasNextInt()){// check prevents exception
//            i = input.nextInt();
//            System.out.println(i * 3);
//        }else{
//            System.out.println("Wrong value");
//        }
        String str = input.nextLine();
        int num = Integer.parseInt(str);
        System.out.println(num);

    }
}
