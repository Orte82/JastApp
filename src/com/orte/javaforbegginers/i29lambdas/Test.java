package com.orte.javaforbegginers.i29lambdas;

public class Test {
//    public static void main(String[] args) {
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//        Student st1 = new Student("Ivan", 'm', 22, 3,8.3);
//        Student st2 = new Student("Nikolay", 'm', 28, 2,6.4);
//        Student st3 = new Student("Elena", 'f', 19, 1,8.9);
//        Student st4 = new Student("Peter", 'm', 35, 4,7);
//        Student st5 = new Student("Mariya", 'f', 23, 3,9.1);
//        studentArrayList.add(st1);
//        studentArrayList.add(st2);
//        studentArrayList.add(st3);
//        studentArrayList.add(st4);
//        studentArrayList.add(st5);
//        StudentInfo si = new StudentInfo();
//        si.printStudentsOverGrade(studentArrayList, 8.5);
//        System.out.println();
//        si.printStudentsUnderGrade(studentArrayList, 9);
//        System.out.println();
//        si.printStudentsOverAge(studentArrayList, 25);
//        System.out.println();
//        si.printStudentsUnderAge(studentArrayList, 27);
//        System.out.println();
//        si.printStudentsBySex(studentArrayList, 'm');
//        System.out.println();
//        si.printStudentsMixedCondition(studentArrayList, 7.2, 23, 'f');
//        System.out.println();
//    }
//}
//
//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    public Student(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo {
//    void printStudent(Student student) {
//        System.out.println("Student name: " + student.name + ", sex: " + student.sex
//                + ", age: " + student.age + ", course: " + student.course + ", avg grade: " + student.avgGrade);
//    }
//
//    void printStudentsOverGrade(ArrayList<Student> students, double avgGrade) {
//        for (Student student : students) {
//            if (student.avgGrade > avgGrade) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentsUnderGrade(ArrayList<Student> students, double avgGrade) {
//        for (Student student : students) {
//            if (student.avgGrade < avgGrade) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentsOverAge(ArrayList<Student> students, int age) {
//        for (Student student : students) {
//            if (student.age > age) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> students, int age) {
//        for (Student student : students) {
//            if (student.age < age) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentsBySex(ArrayList<Student> students, char sex) {
//        for (Student student : students) {
//            if (student.sex == sex) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentsMixedCondition(ArrayList<Student> students, double avgGrade, int age, char sex) {
//        for (Student student : students) {
//            if (student.avgGrade > avgGrade
//                    && student.age < age
//                    && student.sex == sex) {
//                printStudent(student);
//            }
//        }
//    }
}