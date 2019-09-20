package com.orte.buchankajava.interfaces;

public interface SimpleInterface {

    default void printString(){
        System.out.println("Some string");
    }

}
