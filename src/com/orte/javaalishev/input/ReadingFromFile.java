package com.orte.javaalishev.input;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class ReadingFromFile {
    public static void main(String[] args) {

        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "Orte" + separator + "IdeaProjects" + separator + "JastApp" + separator + "src" + separator + "com" + separator + "orte" + separator + "javaalishev" + separator + "input" + separator + "file1.txt";

        File file = new File(path);
        //System.out.println(file.toPath());

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            System.out.println(Arrays.toString(numbers));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(scanner!=null)
            scanner.close();


    }
}
