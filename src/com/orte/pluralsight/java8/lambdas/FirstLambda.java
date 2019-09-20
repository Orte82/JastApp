package com.orte.pluralsight.java8.lambdas;
import java.io.*;
public class FirstLambda {
    public static void main(String[] args) {
//        java.io.FileFilter filter = new java.io.FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        };
        FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".java");
        File dir = new File("C:/tmp");

        File[] files = dir.listFiles(filterLambda);
//        for(File f:files ){
//            System.out.println(f);
//        }

    }
}
