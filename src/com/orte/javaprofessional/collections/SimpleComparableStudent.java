package com.orte.javaprofessional.collections;



import java.util.Arrays;

public class SimpleComparableStudent implements Comparable{

    private String firstName;
    private int group;

    public SimpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return "SimpleComparableStudent{" +
                "firstName='" + firstName + '\'' +
                ", group=" + group +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(this.group > ((SimpleComparableStudent) o).group){
            return 1;
        }else if(this.group <((SimpleComparableStudent) o).group){
            return -1;
        }else{
            return 0;
        }
    }
}

class Main{
    public static void main(String[] args) {
        SimpleComparableStudent[] myStudents ={
                new SimpleComparableStudent("Yevhenii", 333),
                new SimpleComparableStudent("Andrey", 222),
                new SimpleComparableStudent("Igor", 111),
                new SimpleComparableStudent("Peter", 300)
        } ;

        Arrays.sort(myStudents);
        for (SimpleComparableStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }
    }
}

