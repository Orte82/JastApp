package com.orte.javahorstman.streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class OptionalsTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javahorstman\\streams\\alice30.txt");
        String contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        List<String> wordList = Arrays.asList(contents.split("\\PL+"));
        Optional<String> optionalValue = wordList.stream()
                .filter(s -> s.contains("No word"))
                .findFirst();
        System.out.println(optionalValue.orElse("No word") + " contains fred");

        Optional<String> optionalString = Optional.empty();
        String result = optionalString.orElse("N/A");
        System.out.println("result: " + result);
        result = optionalString.orElseGet(() -> Locale.getDefault().getDisplayName());
        System.out.println("result: " + result);
        try {
            //result = optionalString.orElseThrow(IllegalAccessException::new);
            // System.out.println("result: " + result);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        optionalValue = wordList.stream()
                .filter(s -> s.contains("red"))
                .findFirst();

        optionalValue.ifPresent(
                s -> System.out.println(s + " contains red")
        );

        Set<String> results = new HashSet<>();
        optionalValue.ifPresent(results::add);
        Optional<Boolean> added = optionalValue.map(results::add);
        System.out.println(added);

        System.out.println(inverse(4.0).flatMap(OptionalsTest::squareRoot));
        System.out.println(inverse(-1.0).flatMap(OptionalsTest::squareRoot));
        System.out.println(inverse(0.0).flatMap(OptionalsTest::squareRoot));
        Optional<Double> result2 = Optional.of(-4.0).flatMap(OptionalsTest::inverse)
                .flatMap(OptionalsTest::squareRoot);
        System.out.println(result2);
    }

    public static Optional<Double> inverse(Double x) {
        return x == 0 ? Optional.empty() : Optional.of(1 / x);
    }
    public static Optional<Double> squareRoot(Double x){
        return x < 0 ? Optional.empty(): Optional.of(Math.sqrt(x));
    }
}
