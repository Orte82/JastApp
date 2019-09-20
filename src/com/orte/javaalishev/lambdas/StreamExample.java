package com.orte.javaalishev.lambdas;

import com.orte.pluralsight.lambdasjava8.funcinterface.Predicate;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
//        for (String s : list) {
//            System.out.println(s);
//
//        }
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        Stream<String> stringStream = list.stream();
        stringStream.forEach(System.out::println);
        list.forEach(System.out::println);
        Predicate<String> startsWithO = x -> x.startsWith("o");
        Predicate<String> endsWithE = x -> x.endsWith("e");
        Predicate<String> startsEnds = startsWithO.and(endsWithE);
        list.stream().filter(x -> x.startsWith("one")).collect(Collectors.toList());
        Set<String> set = list.stream().collect(Collectors.toSet());
        Set<String> setMap = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toSet());
        Stream<String> jointStream = Stream.of(Arrays.asList("one", "two"), Arrays.asList("three", "four")).flatMap(Collection::stream);
        jointStream.forEach(System.out::print);
        int value1 = Stream.of(1, 2).min(Comparator.comparing(x -> x)).get();
        int value2 = Stream.of(1, 2).max(Comparator.comparing(x -> x)).get();

        Stream.of("one", "two").sorted().collect(Collectors.toList());
        Stream.of("one", "two").limit(1).collect(Collectors.toList());
        Stream.of("one", "two").distinct().collect(Collectors.toList());
        Stream.of("one", "two").skip(1).collect(Collectors.toList());
        Stream.of("one", "two").filter(x -> x.equals("one")).findAny().get();
        Stream.of("one", "two").filter(x -> x.equals("one")).findAny().isPresent();
        Stream.of(1, 2).mapToInt(x ->x).sum();
        Stream.of(1, 2).count();
        Stream.of("one", "two").peek(x -> x.toUpperCase()).findFirst().get();

        IntStream intStream = Stream.of(1,2).mapToInt(x->x);
        intStream.summaryStatistics().getAverage();





    }
}
