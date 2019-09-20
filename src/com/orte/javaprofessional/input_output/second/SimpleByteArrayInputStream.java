package com.orte.javaprofessional.input_output.second;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class SimpleByteArrayInputStream {
    public static void main(String[] args) {
        byte[] arr = new byte[]{1,3, 5,7};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
        int temp;
        while((temp = byteArrayInputStream.read()) != -1){
            System.out.println(temp);
        }
        String str = "Morrow";
        byte[] arr2 = str.getBytes();
        int temp2;
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr2, 1, 3);
        while((temp2 = byteArrayInputStream1.read()) != -1){
            System.out.println(temp2);
            System.out.println((char) temp2);
        }

        try {
            byteArrayInputStream.close();
            byteArrayInputStream1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
