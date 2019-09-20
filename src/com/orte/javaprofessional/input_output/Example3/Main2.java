package com.orte.javaprofessional.input_output.Example3;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true)){
            String s = "Hello world";
            System.out.println("System.out puts: " +s);
            pw.println("PrinWwriter puts: " +s);

            char c;
            pw.println("Symbol input");
            while((c = (char)br.read())!='q'){
                pw.println(c);
            }
            pw.println("Line input:");

            do{
                s = br.readLine();
                pw.println(s);
            }while(!s.equals("q"));
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
