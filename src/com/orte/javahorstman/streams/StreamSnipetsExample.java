package com.orte.javahorstman.streams;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamSnipetsExample {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javahorstman\\streams\\alice30.txt");
        String contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        Stream<String> words = Stream.of(contents.split("\\PL+"));
        // Stream from array
        //Arrays.stream(array, form, to);
        Stream<String> song = Stream.of("gently", "down", "the", "stream");

        // Empty stream
        Stream<String> silence = Stream.empty();
        // infinite streams
        Stream<String> echos = Stream.generate(() -> "Echo");
        Stream<Double> randoms = Stream.generate(Math::random);
        // infinite sequences
        Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
        // Divide CharSequence by Regex
//        Stream<String> words = Pattern.compile("\\PL+").splitAsStream(contents);
        // File lines to stream
       /* try(Stream<String> lines = Files.lines(path)){

        }*/
//        Stream<Stream<String>> result = words.stream().map(w->letters(w));
       // Stream<String> result = words.stream().flatMap(w->letters(w));
        // limit to 100
        Stream<Double> randoms100 = Stream.generate(Math::random).limit(100);
        // skip words
//        Stream<String> wordsskip = Stream.of(contents.split("\\PL+")).skip(1);
        // distinct words
        Stream<String> uniqueWords = Stream.of("merrily", "merrily", "gently").distinct();
        //Stream<String> longestFirst = words.stream().soreted(Comparator.comparing(String::length)).reversed();

       // Optional<String> largest = words.max(String::compareToIgnoreCase);
        // find first occurrence
       // Optional<String> startsWithQ = words.filter(s->s.startsWith("Q")).findFirst();
        Optional<String> startsWithQ2 = words.parallel().filter(s->s.startsWith("Q")).findAny(); //
        //System.out.println(startsWithQ.get());
        System.out.println(startsWithQ2.get());
        boolean aWordStartsWithQ = words.parallel().anyMatch(s->s.startsWith("Q"));
        Optional<String> optionalString=Optional.empty();
        String result = optionalString.orElse("");

    }

    public static Stream<String> letters(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.substring(i, i + 1));
        }
        return result.stream();
    }
}
