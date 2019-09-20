package com.orte.javaprofessional.input_output;

import java.io.*;
import java.nio.file.Files;

public class SimpleMoveFile {
    public static void main(String[] args) {
        //move files
        File sourceFile  = new File("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\input_output\\sourceFile.txt");
        File targetFile  = new File("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\input_output\\targetFile.txt");

        try {
            Files.move(sourceFile.toPath(), targetFile.toPath());
        } catch (IOException e) {
            System.out.println("Can't move file");
        }

//        try (BufferedInputStream br = new BufferedInputStream(new FileInputStream("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\input_output\\targetFile.txt"))) {
//            int line;
//           while((line = br.read())!=-1){
//               System.out.print((char)line);
//           }
//        }catch(IOException e){
//            e.printStackTrace();
//        }
    }
}
