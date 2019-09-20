package com.orte.javahorstman.inputoutput;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        //       Reader reader = new FileReader("temp.txt");
//        int i = 0;
//        while ((i = reader.read()) != -1) {
//            System.out.print((char) i);
//        }

//        char[] chars = new char[50];
//        while (reader.read(chars)!=-1){
//            for (int i = 0; i < chars.length; i++) {
//                if(Character.isAlphabetic(chars[i])||Character.isAlphabetic(chars[i])||Character.isSpaceChar(chars[i])||Character.isISOControl(chars[i]))
//                System.out.print(chars[i]);
//            }
//
//        }

        BufferedReader reader = new BufferedReader(new FileReader("temp.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.read();
        BufferedWriter writer = new BufferedWriter(new FileWriter("temp.txt"));
        writer.write("str3");
        writer.newLine();
        writer.write("str4");
        writer.newLine();
        writer.flush();
        writer.close();
        InputStream inputStream = new FileInputStream("temp.txt");
//        int i = 0;
//        while ((i = inputStream.read()) != -1) {
//            System.out.print( i);
//        }
//        byte[] bytes = new byte[inputStream.available()];
//        while (inputStream.read(bytes) != -1) {
//            for (int i = 0; i < bytes.length; i++) {
//                System.out.println(bytes[i]);
//            }
//        }
        //    InputStream inputStream2 = new BufferedInputStream(new FileInputStream("temp.txt")) ;
//        try (OutputStream outputStream = new FileOutputStream("temp.txt")) {
//            byte[] bytes = new byte[]{52, 10, 53};
//            outputStream.write(bytes);
////            outputStream.write(49);
////            outputStream.write(10);
////            outputStream.write(50);
//        }
        try (BufferedOutputStream streamWriter = new BufferedOutputStream(new FileOutputStream("temp.txt"))) {
            streamWriter.write(new byte[]{70, 10, 80});
        }
       // ZipInputStream zipInputStream = new ZipInputStream(new DataInputStream(new BufferedInputStream(new FileInputStream(""))));
        System.out.println(Level.INTERMEDIATE.ordinal());

        System.out.println(Level.INTERMEDIATE);
        System.out.println(Level.ADVANCED);
    }
}
enum Level{

    BEGINNER,
    INTERMEDIATE("Intermediate"),
    ADVANCED;
    Level(){
        this.name = this.name();
    }
    Level(String name){
       this.name = name;
    }
    String name;

    @Override
    public String toString() {
       return  this.name ;
    }
}