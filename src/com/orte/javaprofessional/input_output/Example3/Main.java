package com.orte.javaprofessional.input_output.Example3;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        byte[] bWrite = {11, 21, 3, 40, 56, 77, 1};
        OutputStream os = new FileOutputStream("test.txt");
        for (int x =0 ; x < bWrite.length; x++){
            os.write(bWrite[x]);//write bytes
        }
        os.flush();
        os.close();

        InputStream is = new FileInputStream("test.txt");
        int size = is.available();
        for (int i = 0; i <size; i++) {
            System.out.print( is.read() + " ");
        }
        is.close();

    }
}
