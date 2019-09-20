package com.orte.javaessential.interview_example1;



public class Main {
    Main() {
        System.out.println("Student");
    }

    public static void main(String[] args) {
        D d =  new D();
    }
}

class B extends Main {
    B() {
        System.out.println("B");
    }
}

class C extends B{
    C(){
        System.out.println("C");
    }
}
class D extends C{
    D(){
        System.out.println("D");
    }
}