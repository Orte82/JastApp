package com.orte.javaessential.enumeration.example3;

public class Main {


    public static void main(String[] args) {
        Company myComp = Company.AMAZON;
        System.out.println("I'm working in " + myComp + " and earn " + myComp.getValue() + "$ per month.");
    }
}
enum Company{
    GOOGLE(100), SKYNET(10), AMAZON(200);
    int value;
        Company(int value){this.value =value;}
        public int getValue(){return value;}
}