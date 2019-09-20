package com.orte.buchankajava.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge9 {
    public static void main(String[] args) {
        List<String> topNames = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"

        );
        List<String> sortedTopNames = topNames.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).sorted(String::compareTo).collect(Collectors.toCollection(ArrayList::new));
        long count= topNames.stream().filter(x->x.startsWith("A")).count();
        System.out.println(sortedTopNames);
        System.out.println(count);
        List<String> sortedTopNamesdebug = topNames.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).peek(System.out::print).sorted(String::compareTo).collect(Collectors.toCollection(ArrayList::new));

    }
}
