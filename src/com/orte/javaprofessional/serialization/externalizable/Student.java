package com.orte.javaprofessional.serialization.externalizable;

import java.io.*;

public class Student implements Externalizable {
    private int id;
    private transient String username;

    public Student() {
    }

    public Student(int id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(username);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        username = (String) in.readObject();
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Orte");
        File f = new File("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\serialization\\externalizable\\ex.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))) {
            outputStream.writeObject(student);

            student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}