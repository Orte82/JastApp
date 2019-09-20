package com.orte.pluralsight.java8.streams;

public class StreamsWhatis {
    public static int sum(int ...num){
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {

        System.out.println(sum(1,2,4,5,6,6,7));

    }
        // What is a stream?
        // Technical: a typed interface
        // public interface Stream <T> extends BaseStream<T, Stream<T>>{
        // }

        // And a  New concept!!!
        //
        // Stream gives ways to efficiently process large amounts of data
        // and also smaller ones
        // Efficiently:
        // In parallel, to leverage the computing power of multicore CPUs
        // Pipelined, to avoid unnecessary intermediary computations
        // Why can't Collection be a Stream?
        // Because Stream is a new concept, and we don't want to change the
        // way the Collection API works

        // Stream is
        // an object on which one can define operations (map, filter)
        // An object that does not hold any data
        // An object that should not change the data it processes
        // An object able to process data in "one pass"
        // An object optimized from the algorithm point of view, and able to
        // process data in parallel

        // How to build a Stream?
        // 1.
        // List<Person> persons = ...;
        // Stream <Person> stream = persons.stream();
        // stream.forEach(p->System.out.println(p));
        // takes an instance of Consumer as an argument (Functional interface
        // from java.util.function package and can be implemented as lambda exp)

        // Consumer<T> c = p -> System.out.println(p);
        // and allow to chain Consumers with default method andThen()

        // Example 1
        // List<String> result = new ArrayList<>();
        // List<Person> persons = ...;
        //
        // Consumer<String> c1 = result::add; (s -> result.add(s))
        // Consumer<String> c2 = System.out::println;
        // persons.stream().forEach(c1.andThen(c2));

        // Filter
        // List<Person> list = ...;
        // Stream <Person> stream = list.stream();
        // Stream <Person> filtered = stream.filter(person->person.getAge()>20)
        // Takes a predicate as a parameter
        // Predicate<Person> p = person -> person.getAge() > 20;
        // default methods and(), or(), negate()
        // Predicate<Integer> p = p1.and(p2).or(p3); // (p1 AND p2) OR p3
        // Predicate<Integer> p = p3.or(p1).and(p2); // (p3 OR p1) AND p2
        // !!!! NOT USE BOOLEAN PRIORITIES BUT METHOD CALL ORDER
        // static method isEqual()
        // Predicate<String> p = Predicate.isEqual("two")
        // Stream<String> stream1 = Stream.of("one", "two", "three");
        // Stream<String> stream2 = stream1.filter(p);
        // stream1 and stream2 are different objects
        // all the methods of Stream that return another Stream are lazy
        // they are not processing any data
        // an operation on a Stream that returns a Stream is called an intermediary operation
        // peek() method return a stream while forEach doesn't return anything
        // peek(), filter() intermediary operations
        // forEach() final operation
        // map() returns stream, so it is intermediary operation
        // map() is modeled by Function interface
        // flapMap()
        // Optional<T> class is a wrapper type and means "there might be no result"
        // List<Integer> ages = ...;
        // Stream<Integer> stream = ages.stream();
        // Optional<Integer> max = stream.max(Comparator.naturalOrder());
        // max of empty stream will be optional value

        // Terminal operation
        // List<Person> persons = ...;
        // Optional<Integer> minAge = persons.stream()
                                            //.map(person->person.getAge()
                                            //.filter(age -> age > 20)
                                            //.min(Comparator.naturalOrder()); // terminal operation



    // List<Person> list = new ArrayList();
    // average age of people less then 20

    // 1. mapping
    // takes List<Person> and returns List<Integer>
    // both lists have the same size

    // 2. filtering
    // takes List<Integer> and returns List<Integer>
    // but some elements have been filtered out in the process

    // 3. average
    // reduction step equivalent to SQL aggregation
}
