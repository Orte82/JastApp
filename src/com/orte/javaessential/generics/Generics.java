package com.orte.javaessential.generics;

public class Generics {
    // generic => code element which can adapt to make same actions towards different types of data
    // closed type of Generics => only one class can be used
    // open type
    // <T>  => type
    // <V>  => value    SimpleMap<K, V>
    // <E>  => element
    // <K>  => key
    // Often used in collections
    // Allow check types during compilation

    // class Types<T>{   // open type creation
    // T[] mass;
    // }
//
//    public static void main(String[] args) {
//        Types<String> type = new Types<>();  // closed type
//    }



//    public static void main(String[] args) {
//        MyClass<String> instance = new MyClass<String>();
//        instance.method();
//    }
}
//class MyClass<T>{
//    public T field;
//    public void method(){
//        System.out.println(field.getClass());
//    }
//}