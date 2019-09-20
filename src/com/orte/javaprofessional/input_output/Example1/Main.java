package com.orte.javaprofessional.input_output.Example1;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true)){
        File f = new File("C:\\Users\\Orte\\Desktop\\tex.txt");
        pw.println();
        pw.println("File \"" + f.getName() + "\"" + (f.exists()?"":"don't") + " exists");
        pw.println("You can" + (f.canRead()?"":"'t") +" read the file");
        pw.println("You can" + (f.canWrite()?"":"'t") +" write in the file");
        pw.println("File length " + f.length()+" byte");
        pw.println();
        File d = new File ("C:\\Users\\Orte\\Desktop\\");
        pw.println("Folder content:");
        if(d.exists()&& d.isDirectory()){
            String[] s = d.list();
            for(int i = 0; i< s.length; i++){
                pw.println(s[i]);
            }
        }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
