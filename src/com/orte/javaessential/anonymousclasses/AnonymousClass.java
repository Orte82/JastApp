package com.orte.javaessential.anonymousclasses;

public class AnonymousClass {
    // A. = inner class without name. They are used if new abstraction is needed within method borders
    // can't write constructor for anonymous class
    // is seen only within declaration block
    // can't be static, private, public, protected
    // can't have static declarations (methods, fields, classes)
    // BUT can have constants (static final)

    // Anonymous classes are used
    // class body is very short
    // only one object is needed
    // class is use in place of creation or exactly after
    // class name isn't necessary
    // multiple inheritance

//    class B extends A{
//
//    }
//
//    A b = new B();
    //OR

//    A a = new A(){
//      // fields and methods
//    };

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
            }
        }).start();
    }


}
