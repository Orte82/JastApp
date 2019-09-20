package com.orte.javaessential.object_class;

public class Object {
    // don't use == comparing objects
    // Use equals
    // hashCode() method
    // equals()
    // O. => base class from which all classes are inherited

    //public final native Class getClass() => returns object of class Class which describes class
    // from which this object was created

    // hasCode() returns int. Hashcode presents any object as integer value. Equal objects have to
    // return equal hashcodes

    // equals() serves for object comparing by value not by reference. Comparing object state on which
    // method was called with passed argument

    // toString => allows to obtain string description of any object
    // by default => getClass().getName() + "@" + hashCode()


    //HashCode rules
    // 1. hashcode for the same object is always the same
    // 2. if objects are equal, their hashcodes must be equal
    // 3. if different object have same hash it called "Collision".
    // 4. if hashcodes are different so the object are different

    //Equals rules
    // 1. Reflectiveness => for every non-zero x value   x.equals(x) always returns "true".
    // 2. Symmetry => x.equals(y) and y.equals(x) both must return "true" of "false"
    // 3. Transitivity => if x.equals(y) == true and y.equals(z) == true, then x.equals(z) must be true
    // 4. Consistency => x.equals(y) if objects don't change should always return true or false

    // c1.equals(c2) => true
    // c1.hashCode() == c2.hashCode() => true

    // Object clone()

    //Multithreading methods
    //notify()
    //notifyAll()
    //wait()

    //finalize() => is called when GC destroys object

}
