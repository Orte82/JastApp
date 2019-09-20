package com.orte.javaalishev.lambdas;

public class DefaultAndStaticMethods implements SomeInterface{
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();

    }

    @Override
    public void print() {

    }

}
interface SomeInterface{
    void print();
    default void printDef(){
        System.out.println("hellos");
    }
}