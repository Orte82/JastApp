package com.orte.javaessential.inheritance_polymorphism.seventh;

import com.orte.javaessential.inheritance_polymorphism.sixth_polymorth.Bird;
import com.orte.javaessential.inheritance_polymorphism.sixth_polymorth.Penguin;
import com.orte.javaessential.inheritance_polymorphism.sixth_polymorth.Straus;
import com.orte.javaessential.inheritance_polymorphism.sixth_polymorth.Swallow;

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

    }
}
