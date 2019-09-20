package com.orte.buchankajava.interfaces;

import java.util.HashSet;
import java.util.Set;

public class SomeClass implements SimpleInterface {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        SomeClass clasi = new SomeClass();
        SomeClass clasi2 = new SomeClass();
        clasi.printString();
        System.out.println(clasi.hashCode());
        System.out.println(clasi2.hashCode());
        Set set = new HashSet<>();
        set.add(clasi);
        set.add(clasi2);
        SomeClass clasi3 = clasi;
        for(Object cl: set){
            System.out.println(cl.hashCode());
        }
        System.out.println(clasi.toString());
        System.out.println(clasi2.toString());
        System.out.println(clasi.getClass());

        String str1 = "Bobo";
        String str2 = "Bob1";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
