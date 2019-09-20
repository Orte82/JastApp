package com.orte.javaalishev.lambdas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    Stream stream = Stream.of(1, 2).parallel();


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
            list.add(10_000_000 - i);
        }
        System.out.println(new Date());
        list.stream().sorted().filter(x -> x % 2 == 0).map(x -> new Double(x)).forEach(x->x.toString());
        System.out.println(new Date());
    }
}
