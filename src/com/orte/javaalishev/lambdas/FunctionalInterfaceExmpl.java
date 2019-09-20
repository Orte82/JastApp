package com.orte.javaalishev.lambdas;

import com.orte.pluralsight.lambdasjava8.funcinterface.Predicate;

import java.util.function.*;

public class FunctionalInterfaceExmpl {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 5;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Function<Integer, String> function = x -> x.toString();
        Supplier<Integer> supplier =  () -> new Integer(12);
        UnaryOperator<Integer> unaryOperator = x -> x + 3;
        BinaryOperator<Integer> binaryOperator = Integer::sum;
        System.out.println(predicate.test(3)); // false
    }
}
