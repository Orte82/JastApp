package com.orte.javaalishev.lambdas;

import java.util.stream.Stream;

public class MethodReferences {
    public static void main(String[] args) {
        Stream.of("one","two").map(x->x.toUpperCase());
        Stream.of("one","two").map(String::toUpperCase);
        Stream.of(new Student("Max"), new Student("Mile")).map(Student::getName).forEach(System.out::println);
        Stream.of("John", "Andy").map(Student::new);
    }
}
class Student{
    private String name;
    Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}