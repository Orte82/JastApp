package com.orte.javahowtostart;

public class Method4InnerMethod {
    public void method(){
        System.out.print("Hello ");
        print("World");
        System.out.println("End");
    }
    public void print(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Method4InnerMethod im = new Method4InnerMethod();
        im.method();
    }
}
