package com.orte.javaprofessional.input_output;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;

public class SimpleCopyFile {
    // NIO package has Path interface and Files object
    public static void main(String[] args) {
        //copy files
        File sourceFile  = new File("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\input_output\\sourceFile.txt");
        File targetFile  = new File("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\input_output\\targetFile.txt");

        try {
            Files.copy(sourceFile.toPath(), targetFile.toPath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
