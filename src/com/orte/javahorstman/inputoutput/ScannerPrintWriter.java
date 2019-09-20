package com.orte.javahorstman.inputoutput;

import java.io.*;
import java.util.Scanner;

public class ScannerPrintWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("temp.txt"));
        Scanner scanner = new Scanner(new FileReader("temp.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("temp.txt"));
        PrintWriter writer2 = new PrintWriter(new FileWriter("temp.txt"));
        Scanner scanner1 = new Scanner(new FileInputStream("temp.txt"));
        PrintWriter writer1 = new PrintWriter(new FileOutputStream("temp.txt"));

    }
}
