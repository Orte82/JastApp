package com.orte.javaprofessional.serialization.example1.simple_static_serialization;



import java.io.*;

public class SimpleStaticSerialization implements Serializable{
    private static int staticNumber;
    private int nonStaticNumber;

    public SimpleStaticSerialization(int nonStaticNumber) {
        this.nonStaticNumber = nonStaticNumber;
        staticNumber = nonStaticNumber;
    }

    @Override
    public String toString() {
        return staticNumber + " " + nonStaticNumber;
    }

    public static void serializeStatic(ObjectOutputStream oos) throws IOException{
        oos.writeInt(staticNumber);
    }
    public static void deserializeStatic(ObjectInputStream ois) throws IOException{
        staticNumber = ois.readInt();
    }
}

class Dispantcher{
    public static void main(String[] args) {
        SimpleStaticSerialization s =new SimpleStaticSerialization(10);

        File f = new File("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javaprofessional\\serialization\\example1\\simple_static_serialization\\temp.txt");
        System.out.println("First values " + s);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
            SimpleStaticSerialization.serializeStatic(oos);
            oos.writeObject(s);
            s = new SimpleStaticSerialization(30);
            System.out.println("Second values " + s);
            SimpleStaticSerialization.deserializeStatic(ois);
            s = (SimpleStaticSerialization) ois.readObject();
            System.out.println(s);
            System.out.println("After deserialization " + s);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}