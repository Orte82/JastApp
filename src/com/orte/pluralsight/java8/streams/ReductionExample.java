package com.orte.pluralsight.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15, 10);
        Integer red =
                list.stream()
                        .reduce(0, (i1, i2) -> i1 + i2);
        Optional<Integer> red2 = list.stream().reduce(Integer::max);
                System.out.println("red = " + red +" "+ red2);
    }
}
