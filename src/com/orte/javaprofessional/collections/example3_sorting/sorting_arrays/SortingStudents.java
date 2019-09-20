package com.orte.javaprofessional.collections.example3_sorting.sorting_arrays;



import java.util.Arrays;

public class SortingStudents {
    public static void main(String[] args) {
        int[] marks = {7, 8, 9, 3, 0, 11};
        String[] students = {"Alex", "Andrew", "Yenhenii", "Karina"};

        Arrays.sort(marks);//0 3 7 8 9 11
        Arrays.sort(students);//Alex Andrew Karina Yenhenii
        for (int mark : marks) {
            System.out.print(mark +" ");
        }
        System.out.println();

        for (String student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
}
