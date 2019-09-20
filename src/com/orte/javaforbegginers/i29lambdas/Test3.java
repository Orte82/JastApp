package com.orte.javaforbegginers.i29lambdas;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Peter", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);
        StudentInfo si = new StudentInfo();
        si.testStudents(studentArrayList, student -> student.avgGrade > 8);
        System.out.println();
        si.testStudents(studentArrayList, student -> student.sex == 'f');
    }
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student student) {
        System.out.println("Student name: " + student.name + ", sex: " + student.sex
                + ", age: " + student.age + ", course: " + student.course + ", avg grade: " + student.avgGrade);
    }

    void testStudents(ArrayList<Student> students, StudentChecks sc) {
        for (Student student : students) {
            if (sc.test(student)) {
                printStudent(student);
            }
        }
    }

}

interface StudentChecks {
    boolean test(Student s);
}


