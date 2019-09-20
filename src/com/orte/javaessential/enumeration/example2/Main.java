package com.orte.javaessential.enumeration.example2;

public class Main {
    public static void main(String[] args) {
        // can't reassign instance of enum
        // Day.MONDAY = Day.FRIDAY;

        Day today = Day.SATURDAY;
        switch (today){
            case SATURDAY:
                System.out.println("First day of weekend - Saturday.");
                break;
            case SUNDAY:
                System.out.println("Last day of weekend - Sunday");
                break;
             default:
                 System.out.println("The weekday - " + today);
        }
        // can also compare instances of enum
        if(today == Day.SATURDAY){
            System.out.println("Saturday");
        }
    }
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNEDAY, THURSDAY, FRIDAY, SATURDAY
}
