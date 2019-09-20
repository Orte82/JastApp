package com.orte.javaessential.generics.WithoutGen;

public class Main {
    public static void main(String[] args) {
        WithOutGen w1 = new WithOutGen("Test");
        WithOutGen w2 = new WithOutGen(10);
        WithOutGen w3 = new WithOutGen(new Cat("Marsel"));

        w1.display();
        w2.display();
        w3.display();

//        w1 = w2;
//        String s = (String)w1.getObj();
//        System.out.println(s); //class cast exception Integer cannot be cast to class
    }
}


class WithOutGen{
    Object obj;

    WithOutGen(Object obj){
        this.obj = obj;
    }

    void display(){
        System.out.println(obj);
    }
    Object getObj(){
        return this.obj;
    }
}

class Cat{
    String name;

    Cat (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
