package com.orte.javaprofessional.input_output.Example4;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        File f1 = new File("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\input_output\\Example4\\example.txt");

        //Read file in package
        BufferedReader br = new BufferedReader(new FileReader(f1));

        String temp;

        while ((temp = br.readLine()) != null){
            System.out.println(temp );
        }
        br.close();
        PrintWriter pw = new PrintWriter(new FileWriter(f1, true)); // append prevents rewriting file
        pw.println("Good Luck");
        pw.flush();
        pw.close();
    }
}
