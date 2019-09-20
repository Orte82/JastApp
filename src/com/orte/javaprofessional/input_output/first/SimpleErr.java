package com.orte.javaprofessional.input_output.first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

class SimpleErr {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("D:\\Hello");
            System.out.println("File opened");
        } catch (FileNotFoundException e) {
            System.err.println("File opening failed"); // System error
            e.printStackTrace();
        }
    }
}
