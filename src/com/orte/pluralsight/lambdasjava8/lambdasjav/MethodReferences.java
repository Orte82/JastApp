package com.orte.pluralsight.lambdasjava8.lambdasjav;

public class MethodReferences {
    public static void main(String[] args) {
        // Method References is other syntax for writing lambdas
        // Function<Person, Integer> f = person -> person.getAge();
        // Function<Person, Integer> f = Person::getAge; => Method Reference
        //===== static
        // BinaryOperation<Integer> sum = (i1, i2) -> i1 + i2;
        // BinaryOperation<Integer> sum = (i1, i2) -> Integer.sum(i1, i2);
        // BinaryOperation<Integer> sum = Integer::sum;
        // BinaryOperation<Integer> max = Integer::max;
        // ==== consumer
        // Consumer<String> printer = s -> System.out.println(s);
        // Consumer<String> printer = System.out::println;


    }
}
