package com.orte.javaprofessional.serialization.example1.simple_serialization;

import java.io.Serializable;

public class Group implements Serializable {
    private String name;
   transient private Student student;

    public Group(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
