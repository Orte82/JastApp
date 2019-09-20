package com.orte.javaprofessional.input_output.third;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        String str = scanner.next(); // => read up to first blank

        scanner = new Scanner(System.in);  // !!!!!!!!!!=>> to read next line and not end previous
        String str2 = scanner.nextLine(); // => read up to first blank


        System.out.println("Number " + i + " " + "Float " + f+ " " + "String 1 word "+ str+ " "+" String all line " + str2);
        // Number 1 Float 1.4 String 1 word Hello  String all line  world
    }
}
