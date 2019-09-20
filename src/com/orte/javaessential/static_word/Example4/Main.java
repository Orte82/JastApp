package com.orte.javaessential.static_word.Example4;

public class Main {
    public static void main(String[] args) {
        /*Static block x = 1
          Static block x = 23
          Static block x = -99*/

        System.out.println(NonStaticClass.x); //-99

        NonStaticClass instance = new NonStaticClass(1111); // Constructor X = 1111
        System.out.println(instance.x); //1111
        // wrong static call => last variable redefinition is from
        // constructor
        System.out.println(NonStaticClass.x);//1111

    }
}
