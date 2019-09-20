package com.orte.javahowtostart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColorConsole {
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello");
//        System.out.println((char)27 + "[31m" + "Hello");//red
//        System.out.println((char)27 + "[32m" + "Hello");//green
//        System.out.println((char)27 + "[33m" + "Hello");//yellow
//        System.out.println((char)27 + "[34m" + "Hello");//blue
//        System.out.println((char)27 + "[35m" + "Hello");//pink
//        System.out.println((char)27 + "[36m" + "Hello");//turquoise
//        System.out.println((char)27 + "[37m" + "Hello");//grey
//        System.out.println((char)27 + "[38m" + "Hello");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Chose your color: red/green/pink");
        String str = "";
        try {
            str = reader.readLine();
            if (!(str.toLowerCase().equals("red") || str.toLowerCase().equals("green") || str.toLowerCase().equals("pink")))
                throw new IllegalArgumentException();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("No such color");
            System.exit(1);
        }
        String text;
        switch (str) {
            case "red":
                System.out.println("Enter text:");
                text = reader.readLine();
                System.out.println((char) 27 + "[01;31m" + text);//red
                break;
            case "green":
                System.out.println("Enter text:");
                text = reader.readLine();
                System.out.println((char) 27 + "[01;32m" + text);//green
                break;
            case "pink":
                System.out.println("Enter text:");
                text = reader.readLine();
                System.out.println((char) 27 + "[01;35m" + text);//pink

        }
    }
}
