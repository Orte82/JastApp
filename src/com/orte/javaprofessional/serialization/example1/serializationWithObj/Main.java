package com.orte.javaprofessional.serialization.example1.serializationWithObj;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\serialization\\example1\\serializationWithObj\\file.txt");
        Car c = new Car(50000, "Bmw", new Engine(1500));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            oos.writeObject(c);
            // all inner class has to be serializable to !!!!!
            Car car = (Car) ois.readObject();
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
