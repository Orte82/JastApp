package com.orte.pluralsight.lambdasjava8.funcinterface;

import java.util.function.Predicate;

public class Lecture {
    public static void main(String[] args) {
        // JDK7 interface implementation
//        Predicate<String> p = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length()> 20;
//            }
//        };
        // JDK 8 lambda
        Predicate<String> p = s -> s.length()> 20;
        // Compiler recognises functional interface
        // if interface is functional there is only one method to implement
        // the type of variable gives the type of the lambda expression
        // lambda ==> predicate (receive object return boolean)
        // parameters and return types must be compatible
        // the same of exceptions if any

        // ==> if all points are reached compiler identifies construction
        // lambda is still interface and methods can be invoked explicitly
        System.out.println(p.test("Hello World"));

        // Functional interface complete definition
        // must have only one abstract method
        // default methods do not count
        // static methods do not count
        // Methods from the Object class do not count (even if declared abstract)

        // @FunctionalInterface (optional) => marks FI
        // java.util.function Package (from Java 8)
        // 43 of them
        // 4 categories
        // 1. The Consumers
        // 2. The Suppliers
        // 3. The Functions
        // 4. The Predicates

        // 1. The Consumers
//        public interface Consumer<T>{
//            public void accept(T t);}
        // Accepts object and return nothing
//        Consumer<String> printer = s -> System.out.println(s);
//        Consumer<String> printer = System.out::println;
        // BiConsumer
        // public interface BiConsumer<T, V>{
        // public void accept(T t, V v)}

        // 2. The Suppliers
        // public interface Supplier<T>{
        // public T get();
        // }
        // accepts nothing returns object
//        Supplier<Person> personSupplier = ()->new Person();
//        Supplier<Person> personSupplier = Person::new;

        // 3. The Functions
        // public interface Function<T, R>{
        // public R apply(T t);}
//        Function<Person, Integer> ageMapper = person->person.getAge();
//        Function<Person, Integer> ageMapper =  Person::getAge;
        // BiFunction<T, V, R>{
        // public R apply(T t, V v);}

        // Unary operator
        // public interface UnaryOperator<T> extends Function<T, T>{
        // }
        // takes object and returns object of the same type

        // 4. The Predicates
        // takes object and returns boolean
        // public interface Predicate<T>{
        // public boolean test(T t);}
        // Predicate<Person> ageGT20 = person -> person.getAge() > 20;
        // public interface BiPredicate<T, U>{
        // public boolean test(T y, U u);}
    }
}
