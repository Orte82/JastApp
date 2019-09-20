package com.orte.javaessential.enumeration;

public class Enumeration {
    // E. => list of named constants.
    // E. can have methods, constructors and object variables
    public enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNEDAY, THURSDAY, FRIDAY, SATURDAY
    }
    // to use object of enum type need to create var of enum type and assign one of the values to it
    // but can't create object directly

    public static void main(String[] args) {
        Day dayToday = Day.THURSDAY;
        System.out.println("Today is " + dayToday);
    }
}
