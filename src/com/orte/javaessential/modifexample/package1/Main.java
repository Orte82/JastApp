package com.orte.javaessential.modifexample.package1;

import com.orte.javaessential.modifexample.package2.ExamplePackage2;//imported
import com.orte.javaessential.modifexample.package2.Parent;

public class Main extends Parent{
    public static void main(String[] args) {
        ExamplePackage1 e1 = new ExamplePackage1();
        System.out.println("e1");
        System.out.println(e1.name2);  // package
        System.out.println(e1.name3);  // protected
        System.out.println(e1.name4);  // public
      //  System.out.println(e1.name1);   private  error
        System.out.println("e2");
        ExamplePackage2 e2 =new ExamplePackage2();
        //System.out.println(e2.name2);  // package  error
       // System.out.println(e2.name3);  // protected  error
           System.out.println(e2.name4);  // public
        // System.out.println(e2.name1);   private  error

           // Parent p = new Parent(); must create not parent but main(child) object to access protected field
            Main p = new Main();
//        System.out.println(p.name2);  // package  error
          System.out.println(p.name3);  // protected  <==============>
          System.out.println(p.name4);  // public
//        System.out.println(p.name1); //  private  error
    }
}
