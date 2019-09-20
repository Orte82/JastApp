package com.orte.javaprofessional.serialization.example2;

import com.orte.javaessential.object_class.Object;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;


public class DataObject extends NonSerializable implements Serializable {
    int i = 5;
    String s = "aaa";
    transient String[] def = new String[5];
    CustomObject customObject = new CustomObject();

    @Override
    public String toString() {
        return "DataObject{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", def=" + Arrays.toString(def) +
                ", myData=" + getMyData() +
                ", customObject=" + customObject +
                '}';
    }
    private void writeObject(ObjectOutputStream out) throws IOException{
        out.defaultWriteObject();
        out.writeObject(getMyData());
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        in.defaultReadObject();
      this.setMyData((String)in.readObject());
    }
}
