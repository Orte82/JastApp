package com.orte.javaessential.inheritance_polymorphism.sixth_polymorth;

public class Main {
    public static void main(String[] args) {
     DerivedClass instance = new DerivedClass();
     instance.method();//method from DerivedClass

     //Upcast
        BaseClass instanceUp = instance;
        instanceUp.method();//method from DerivedClass

        //DownCast
        DerivedClass instanceDown = (DerivedClass) instanceUp;
        instanceDown.method();//method from DerivedClass

        //Birds

        Bird straus = new Straus();
        Bird penguin = new Penguin();
        Bird swallow = new Swallow();
        Bird[] arr = {straus, penguin, swallow};
        for(Bird s: arr){
            s.move();
        }
    }
}
