package com.orte.pluralsight.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReductionOperartion {
    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = ages.stream();
        Integer sum = stream.reduce(0, Integer::sum);
        // first argument: identity element of the reduction operation
        // second argument: reduction operation of type BinaryOperator<T>


        System.out.println(sum ); // 15

        // Examples
        List<Integer> fifth = Arrays.asList(5,5,5,5,5,5);
        Stream <Integer> stream1 = fifth.stream();
        BinaryOperator<Integer> sum1 = (i1, i2) -> i1 + i2;
        Integer id = 0;
        int red = stream1.reduce(id, sum1);
        System.out.println(red); //30
        Stream<Integer> stream2 = Stream.empty(); // empty stream
        int red2 = stream2.reduce(id, sum1);
        System.out.println(red2); //0

        Stream<Integer> stream3 = Stream.of(1,2,3,4,5);
        BinaryOperator<Integer> mult = (i1, i2) -> i1 * i2;
        int reduce = stream3.reduce(1, mult);
        System.out.println(reduce);
    }
}
