package com.orte.javaessential.enumeration.example1;

public class Main {
    public static void main(String[] args) {
        // object with ref to instance of enum type Day
        Day dayToday = Day.THURSDAY;
        System.out.println("Today is " + dayToday);
        int number = 4;
        //can't assign integer value
        // dayToday = number;
        // dayToday = 4;
    }
}
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNEDAY, THURSDAY, FRIDAY, SATURDAY
}
