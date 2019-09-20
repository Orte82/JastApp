package com.orte.javaforbegginers.i29lambdas;

public class Test2 {
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
//        StudentChecks fsog = new FindStudentsOverGrade();
//        StudentChecks fsoa = new FindStudentsOverAge();
//        si.testStudents(studentArrayList, fsog);
//        System.out.println();
//        si.testStudents(studentArrayList, fsoa);
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
//class StudentInfo{
//    void printStudent(Student student) {
//        System.out.println("Student name: " + student.name + ", sex: " + student.sex
//                + ", age: " + student.age + ", course: " + student.course + ", avg grade: " + student.avgGrade);
//    }
//    void testStudents(ArrayList<Student> students, StudentChecks sc){
//        for (Student student : students) {
//            if(sc.testStudent(student)){
//                printStudent(student);
//            }
//        }
//    }
//
//}
//interface StudentChecks{
//    boolean testStudent(Student s);
//}
//class FindStudentsOverGrade implements StudentChecks{
//
//    @Override
//    public boolean testStudent(Student s) {
//        return s.avgGrade > 8.5;
//    }
//}
//
//class FindStudentsUnderGrade implements StudentChecks{
//
//    @Override
//    public boolean testStudent(Student s) {
//        return s.avgGrade < 9;
//    }
//}
//
//class FindStudentsOverAge implements StudentChecks{
//
//    @Override
//    public boolean testStudent(Student s) {
//        return s.age > 25;
//    }
}