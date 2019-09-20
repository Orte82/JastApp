package com.orte.javaessential.abstract_interface.first;

public class Main {

    public static void main(String[] args) {
//        Bird b = new Bird(); error => bird is abstract
        Bird p = new Penguin();
        Bird s = new Straus();
        Bird sw = new Swallow();

        p.move(); //Swim
        s.move(); //Run
        sw.move();//Fly

        s.eat();//  Eat rodents
        p.eat();// Eat fish
        sw.eat();// Eat bugs

        Animal pen = new Penguin();
        Animal str = new Straus();
        Animal swall = new Swallow();

        pen.eat();//Eat fish
        str.eat();// Eat rodents
        swall.eat();//Eat bugs




    }

}
