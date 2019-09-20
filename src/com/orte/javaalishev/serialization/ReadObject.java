package com.orte.javaalishev.serialization;


import java.io.FileInputStream;
import java.io.IOException;

import java.io.ObjectInputStream;


public class ReadObject {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("people.bin"); ObjectInputStream ois = new ObjectInputStream(fis)) {
//            Person person1 = (Person)ois.readObject();
//            Person person2 = (Person)ois.readObject();
            int persontCount= ois.readInt();
            Person[] people = new Person[persontCount];
            for (int i = 0; i <persontCount; i++) {

              people[i] =  (Person) ois.readObject();
            }
            for (Person person : people) {
                System.out.println(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
