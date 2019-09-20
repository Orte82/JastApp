package com.orte.pluralsight.lambdasjava8.collections;

public class Lection {
    // On iterable
    // boolean forEach(Consumer<? super E> consumer);
    // On collection
    // boolean removeIf(Predicate<? super E> filter)

    // example 1
    // List<Person> people = ..;
    // people.forEach(System.out::println);

    // people.removeIf(person -> person.getAge() < 20);

    // On list
    // boolean replaceAll(UnaryOperator<? super E> operator);
    // boolean sort(Comparator<? super E> comparator);

    // example2
    // List<String> names = ...;
    // names.replaceAll(name -> name.toUpperCase());
    // names.replaceAll(String::toUpperCase);

    // example3
    // List<Person> people = ...;
    // names.sort(
    //       Comparator.comparing(Person::getName)
    //                          .thenComparing(Person::getAge)
    // );

    // On Map
    // void forEach(BiConsumer<? super K, ? super V> consumer);

    // example4
    // Map<City, List<Person> map = ...;
    // map.forEach(
    //   (city, list) ->
    //          System.out.println(city + ": " + list.size() + " people");

    // On Map
    // V getOrDefault(Object key, V defaultValue);

    // example5
    // Map<City, List<Person>> map = ...;
    // System.out.println(map.getOrDefault(boston, empyList());

    // On Map
    // V putIfAbsent(K key, V value);

    // example6
    // Map<City, List<Person>> map = ...;
    // map.putIfAbsent(boston, new ArrayList<>()); // returns the previous value
    // map.get(boston).add(maria);

    // On Map
    // V replace(K key, V newValue);
    // boolean replace(K key, V existing Value, V newValue);

    // On Map
    // void replaceAll(Bifunction<? super K, ? super V, ? extends V> function);

    // On Map
    // void remove(Object key, Object value);

    // On Map
    // V compute(K key, Bifunction<? super K, ? super V, ? extends V> remapping);

    // On Map
    // computeIfAbsent(K key, Function<? super K, ? extends V> mapping);

    // On Map
    // V computeIfPresent(K key, Bifunction<? super K, ? super V, ? extends V> remapping);

    // All compute() methods return value

    // example7
    // Map<String, Map<String, Person>> map = ...;
    //// key, newValue
    // map.computeIfAbsent(
    //      "one",
    //      key -> new HashMap<String, Person>()
    //     ).put("two", john);

    // example8
    // Map<String, List<Person>> map = ...;
    // map.computeIfAbsent(
    //      "one",
    //      key -> new ArrayList<Person>()
    //     ).add(john);

    // On map
    // V merge(
    //      K key, V newValue,
    //      BiFunction<? super V, ? super V, ? extends V> remapping);

    // example9
    // Map<City, List<Person>> map1 = new HashMap<>();
    // Map<City, List<Person>> map2 = new HashMap<>();

    // map2.forEach(
    //          (key, value)->
    //              map1.merge(
    //                  key, value,
    //                  (existingPeople, newPeople) -> {
    //                        existingPeople.addAll(newPeople);
    //                        return existingPeople;
    //                  }
    //              )
    //   );
}
