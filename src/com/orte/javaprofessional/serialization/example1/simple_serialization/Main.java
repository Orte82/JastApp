package com.orte.javaprofessional.serialization.example1.simple_serialization;


import java.io.*;


public class Main {
    public static void main(String[] args) {

        Group group = new Group("Java");
        Student student = new Student(1, "Orte");
        student.setGroup(group); // will be recursive calld
        group.setStudent(student);

        File f = new File("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\serialization\\example1\\simple_serialization\\output.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))) {
            outputStream.writeObject(student);
            student = null;
            student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
