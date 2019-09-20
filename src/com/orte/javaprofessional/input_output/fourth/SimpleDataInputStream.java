package com.orte.javaprofessional.input_output.fourth;

import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args) {
        try ( DataOutputStream out =  new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dataOut.txt")));
              DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("dataOut.txt")))){
           out.writeShort(1200);
           out.writeInt(1111);
           out.writeLong(10L);
           out.writeUTF("Hello world");
           out.flush(); // Error because buffer wasn't flushed

            System.out.println("Shot "+in.readShort());
            System.out.println("Int " + in.readInt());
            System.out.println("Long " + in.readLong());
            System.out.println("UTF " +in.readUTF());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
