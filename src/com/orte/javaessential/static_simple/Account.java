package com.orte.javaessential.static_simple;

public class Account {

    double UAH;
    String name;
    static double courseUSDtoUAH;

    public static void main(String[] args){
        Account a1 = new Account();
        a1.UAH = 2000.5;
        a1.name = "Robert";
        Account.courseUSDtoUAH = 26.1;
        Account a2 = new Account();
        a2.name = "Edward";
        a2.UAH = 1800;


    }
}
