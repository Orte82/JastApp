package com.orte.javaprofessional.collections.example6_arraylist.array_list_reverse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // with cycle filling arrayList from keyboard
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter value [" + i + "]");
            String s = reader.readLine();
            //add value to the end of the array
            arrayList.add(s);
        }
        //reversing element
        for (int i = 0; i < arrayList.size(); i++) {
            // writing element in variable
            int j = arrayList.size() - i - 1;
            // showing output
            System.out.println(arrayList.get(j));
        }
    }
}