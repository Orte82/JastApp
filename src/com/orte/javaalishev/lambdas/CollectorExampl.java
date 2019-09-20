package com.orte.javaalishev.lambdas;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

;

public class CollectorExampl {
    public static void main(String[] args) {
        Stream.of("one", "two").collect(Collectors.toCollection(TreeSet::new));
        Stream.of("one", "two").collect(Collectors.maxBy(String::compareTo));

        Stream.of(1, 2).collect(Collectors.averagingInt(x -> x));

        Map<Boolean, List<Integer>> map = Stream.of(1, 2, 3, 4).collect(Collectors.partitioningBy(x -> x > 2));
        Map<Integer, List<Integer>> map2 = Stream.of(1, 2, 1, 4).collect(Collectors.groupingBy(x -> x));

        String result = Stream.of("one", "two", "three").collect(Collectors.joining(", ", "{", "}"));
        System.out.println(result);//{one, two, three}

        Map<Integer, Long> map3 = Stream.of(1, 2, 1, 4).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map3.get(1));
        Map<Integer, List<Integer>> collect = Stream.of(1, 2, 1, 4).collect(Collectors.groupingBy(x -> x, Collectors.mapping(x -> x, Collectors.toList())));
    }
}
