package com.orte.pluralsight.lambdasjava8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainBuildingStreams {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);

        Stream<Integer> stream1 = ints.stream();
        Stream<Integer> stream = Stream.of(4, 5, 6, 7, 9);
        stream.forEach(System.out::println);



        Stream<String> streamOfStrings = Stream.generate(() -> "one");
        streamOfStrings.limit(5).forEach(System.out::println);


        Stream<String> streamOfStrings2 = Stream.iterate("+",s->s +"+" );
        streamOfStrings2.limit(4).forEach(System.out::println);

       IntStream streamInt =  ThreadLocalRandom.current().ints();
        streamInt.limit(4).forEach(System.out::println);
    }
}
