package com.orte.javaprofessional.serialization;

public class SerializationWhatIs {
    // serialization is a process of transferring of a state of an object to byte stream aiming to save it in memory,
    // database or file
    // main purpose is to save object state to load it in case of need
    // back process of serialization is called deserialization
    // interprocess, interdomain and interlevel ser/deser is called marshaling

    // serialized object must implement Serializable interface => marker interface
    // class Test implements Serializable
    // for Serialization is used method writeObject() of class ObjectOutputStream
    // Deser is used by readObject();

    // default serialization proceeds on every field not marked "transient" or "static"
    // Object fields should refer on class which have to be serializable too

    // transient is used
    // when field value is calculated based on other fields values
    // when field value is correct only in current context (field has reference to other resource of system
    // in case of security (password and e.t.s)

    // inheritance
    // on subclass object deserialization if superclass not serializable, then default constructor of superclass is called
    // so base class have to have constructor without parameters or implement Serializable
    //
}
