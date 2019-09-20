package com.orte.javaprofessional.input_output.Example2;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\input_output\\Example2\\Student.java"), "Cp866"));
             BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Student.java"), "Cp866"))) {
            int c;
            while ((c = br.read())!=-1){
                bw.write((char)c);
            }
            bw.flush();
            System.out.println("Writing is finished");
        }catch ( IOException e){
            System.out.println(e);
        }


    }
}
