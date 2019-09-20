package com.orte.javaprofessional.serialization.example1.serialization;

import com.orte.javaprofessional.serialization.example1.simple_static_serialization.SimpleStaticSerialization;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // Creation of file class
      File f = new File("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\serialization\\example1\\serialization\\fileforserialization.bin");
      Car c = new Car(50000, "Bmw");
      try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
          ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){

          oos.writeObject(c);


          Car car = (Car) ois.readObject();
          System.out.println(car);
      }catch (IOException | ClassNotFoundException e){
          e.printStackTrace();
      }


    }
}
