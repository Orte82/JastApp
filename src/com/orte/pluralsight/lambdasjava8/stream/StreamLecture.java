package com.orte.pluralsight.lambdasjava8.stream;

public class StreamLecture {
    // technically stream is typed interface
    // public interface Stream<T> extends BaseStream<T, Stream<T>>{
    // }

    // there are also IntStream, LongStream, DoubleStream
    // built on primitive type

    // new concept in Java 8
    // added to remove unnecessary DS from map, filter, reduce
    // stream doesn't hold any data
    // it pulls data from source
    // stream does not modify data in processes (helps to process data in parallel
    // source of data may be unbounded

    // how to build stream
    // 1.
    // List<Person> people = ..;
    // Stream<Person> stream = people.stream();
    // 2.
    // Stream.empty() => returns empty stream
    // 3.
    // Stream.of("one"); => singleton stream
    // 4.
    // Stream.of("one", "two", "three"); => with many elements
    // stream has static methods in it
    // 5.
    // Stream.generate(() -> "one") => constant Stream
    // 6.
    // Stream.iterate("+", s -> s + "+"); => growing Stream
    // 7.
    // ThreadLocalRandom.current().ints(); => a random Stream
    // 8.
    // IntStream stream = "hello".chars(); => stream of letters
    // 9.
    // Stream<String> words = Pattern.compile("[^\\p{javaLetter}]").splitAsStream
    // (booK) => stream with regular expression
    // 10.
    // Stream<String> lines = Files.lines(path);

    // StreamBuilder pattern
    // Stream.Builder<String> builder = Stream.builder();
    // add data to builder
    // builder.add("one").add("two").add("three");
    // or by accept()
    // builder.accept("four");
    // Stream<String> stream = builder.build();
    // and use stream
    // stream.forEach(System.out::println);

    // forEach => terminal call
    // inside stream declaration use peek() for testing

    // Terminal operation triggers stream processing

    // trick => call that returns stream is intermediate, else is terminal

    // ranges of data in stream
    // skip(), limit()
    // persons.stream()
    //          .skip(2)
    //          .limit(3)
    //          .filter(person -> person.getAge() > 20)
    //          .forEach(System.out::println);
}
