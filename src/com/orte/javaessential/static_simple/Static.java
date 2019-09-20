package com.orte.javaessential.static_simple;

public class Static {

    // defines field or method which belongs to a Class and used by all objects, created by this class
    // class A{
    //    static int method(){}
    // }
//    public static void main(String[] args) {
//        A.method();
//    }

    // constant declaration => constant always should be static
    private static final float PI_NUMBER;
    // static fields are loaded on this class level and
    // static block is executed on class load
    // static class member are put to PermGen memory part  (Stack | Heap | Permanent Generation)
    static{  //  <=== static bloc or constructor
        PI_NUMBER = 22.1F;
    }
}
