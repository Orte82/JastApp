package com.orte.javaprofessional.serialization.example2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataObject dob = new DataObject();
        dob.setMyData("Heloooooooooooooooooooooooo");
        File file = new File("store.bin");

        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream so = new ObjectOutputStream(fo);
        so.writeObject(dob);
        so.flush();
        so.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        DataObject ddd = (DataObject) ois.readObject();
        ois.close();
        System.out.println(ddd);

    }
}
