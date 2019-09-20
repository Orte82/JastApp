package com.orte.javaalishev.lambdas;

import java.util.*;
import java.util.stream.Collectors;

public class MapFilterReduce {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(arr);
        fillList(list);

        System.out.println(list);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < 10; i++) {
            arr[i] = arr[i] * 2;
            list.set(i, list.get(i) * 2);
        }
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        // map
        arr = Arrays.stream(arr)
                .map(a -> a * 4)
                .toArray();

        list = list.stream()
                .map(a -> a * 4)
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        // filter
        int[] arr2 = Arrays.stream(arr)
                .filter(a -> a % 3 == 0)
                .toArray();
        List<Integer> list2 = list.stream()
                .filter(a -> a % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(list2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        // reduce
        int arr3 = Arrays.stream(arr)
                .reduce(0, Integer::min);
        int list3 = list.stream()
                .reduce(0, Integer::sum);

        System.out.println(list3);
        System.out.println(arr3);
        System.out.println();

        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
        System.out.println();
        list.stream().forEach(System.out::print);

    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }
}
