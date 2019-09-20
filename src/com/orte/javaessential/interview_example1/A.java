package com.orte.javaessential.interview_example1;

public class A {
    //                                          Loading top
    {
        System.out.println("In dynamic block");// 3
    }
    static{
        System.out.println("In static block #1"); // 1
    }

    A() {
        System.out.println("In constructor A");  //5
    }
    static{
        System.out.println("In static block #2");// 2
    }
    {
        System.out.println("In dynamic block #2");// 4
    }

    public static void main(String[] args) {
        A a = new A();
        A a2 = new A(); // dynamic blocks and constructors worked two times but static block only once

    }
}
