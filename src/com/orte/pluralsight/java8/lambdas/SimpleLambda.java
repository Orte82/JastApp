package com.orte.pluralsight.java8.lambdas;

public class SimpleLambda {
    // lambda allows easier to write instances of anonymous class
    // and read!!!
    // another way of writing readable anonymous classes

    //
    //1 What is the type of a lambda expression?
    // is a functional interface => interface with only one abstract method
    // Runnable, Comparator etc.
    // in functional interface methods from Object class don't count
    // functional can be annotated @FunctionalInterface
    //2 Can a lambda be put in a variable?
    // !!yes!! Comparator<String> c =  (String s1, String s2) ->
    // Integer.compare(s1.length(), s2.length());
    // lambda can be taken as a method parameter and can be returned
    // by method
    //3 Is a lambda expression an object?
    // LE is created without using "new"
    // !!!no!!! but recorded as object in JVM
    // a lambda is an object without an identity

    // new package java.util.function provides functional interfaces
    // 4 categories:

    // Supplier => doesn't take any object but provides new object
    // @FunctionalInterface
    // public interface Supplier<T> {
    // T get();
    // }
    //
    // Consumer/BiConsumer => takes object but doesn't provide anything
    // @FunctionalInterface<T>{
    // void accept(T t);
    // }
    // BC takes two object instead of one
    //
    // Predicate/BiPredicate => takes object in a parameter and return boolean
    // @FunctionalInterface
    // public interface Predicate<T>{
    // boolean test(T t);
    // }
    //
    //Function => takes object and returns another object
    //@FunctionalInterface
    // public interface Function<T, R>{
    //  R apply(T t);
    // }
    // UnaryOperator => takes object and returns another object of same type
    // @FunctionInterface
    // public interface UnaryOperator<T> extends Function<T,T>{}
    // most of the time parameter types of lambda can be omitted
    // Comparator<String> c = (s1, s2) -> Integer.compare(s1.length(), s2.length());

    // Method references
    // Consumer<String> c = s -> System.out.println(s);
    // ==
    // Consumer<String> c = System.out::println;
    // one more
    // Comparator<Integer> c = (i1,i2) -> Integer.compare(i1, i2);
    // ==
    // Comparator<Integer> c = Integer::compare;
    //
    // Most of the time object are in essence of Collection (List, Set, Map)
    // List<Customer> list = ...;
    // list.forEach(customer -> System.out.println(customer));
    // or
    // list.forEach(System.out::println);

    // forEach => is default method of Iterable interface
    // public interface Iterable<E>{
    // default void forEach(Consumer<E> consumer){
    // for(E e: this){
    // consumer.accept(e);
    //      }
    //      }
    // }
    // New patterns !!!!!!!!!!!!!
    // Predicates
    // Predicate<String> p1 = s -> s.length() < 20;
    // Predicate<String> p2 = s -> s.length() > 10;
    // chaining
    // Predicate<String> p3 = p1.and(p2);
    // and() => default method on Predicate interface

    // @FunctionalInterface
    // public interface Predicate<T> {
    // boolean test(T t);
    // default Predicate<T> and(Predicate<? super T> other){
    // Objects.requireNonNull(other);
    // return (t) -> test(t)&& other.test(t);}
    // }

    // Predicate<String> id = Predicate.isEqual(target);
    // @FunctionalInterface
    // public interface Predicate<T>{
    // boolean test(Test t);
    // static <T> Predicate<T> isEqual(Object targetRef){
    // return (null == targetRef)
    //          ? Objects::isNull
    //          : object -> targetRef.equals(object);
    //          }
    // }
}
