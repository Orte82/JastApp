package com.orte.javaprofessional.collections.example6_arraylist.array_list;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // with cycle filling arrayList from keyboard
        for (int i = 0; i <3; i++) {
            System.out.println("Enter value [" +i+"]");
            String s = reader.readLine();
            //add value to the end of the array
            arrayList.add(s);
        }
        //removing line and add it in the beginning
        for (int i = 0; i < 5; i++) {
            String  s1 = arrayList.remove(arrayList.size()-1);
            arrayList.add(0, s1);
        }
        for (String s : arrayList) {
            System.out.println(s);
        }

    }
}
