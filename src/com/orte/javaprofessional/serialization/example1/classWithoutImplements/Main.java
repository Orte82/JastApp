package com.orte.javaprofessional.serialization.example1.classWithoutImplements;

import java.io.*;



public class Main {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\serialization\\example1\\classWithoutImplements\\file1.txt");
        Bmw c = new Bmw(10000, 5000, "x6", new Engine(1500, "BMW"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            oos.writeObject(c);
            // On deserialization constructor of superclass is called
            Bmw car = (Bmw) ois.readObject();
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
