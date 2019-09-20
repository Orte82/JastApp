package com.orte.javaprofessional.serialization.example2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class CustomObject implements Externalizable {
    transient boolean b;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "b=" + b +
                '}';
    }
}
