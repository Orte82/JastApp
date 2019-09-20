package com.orte.javaessential.nestedclasses.example6;

import com.orte.javaessential.nestedclasses.Nested;
import com.orte.javaessential.nestedclasses.example5.BaseClass;

public class Main {
    // classes can contain static Nested classes
    public static void main(String[] args) {
        MyClass.Nested.staticMethodFromNested();
    }
}

class MyClass {
    public static class Nested {

        // non-static and static methods and field can be used in inner static class BUT IF
        // class is non-static, static methods and static fields can't be used
        void say() {
            System.out.println("Hello");
        }

        public static void staticMethodFromNested() {
            System.out.println("Static method from Nested Class");
        }
    }


}
