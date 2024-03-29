package com.orte.pluralsight.lambdasjava8.collections;

import java.util.*;

public class MapAPICollectionMap {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 23);
        Person p2 = new Person("Brian", 56);
        Person p3 = new Person("Chelsea", 46);
        Person p4 = new Person("David", 28);
        Person p5 = new Person("Erica", 37);
        Person p6 = new Person("Francisco", 18);

        City newYork = new City("New York");
        City shanghai = new City("Shanghai");
        City paris = new City("Paris");

        Map<City, List<Person>> map = new HashMap<>();

        System.out.println("People from Paris: " + map.get(paris));
        // output
        // People from Paris: null
        System.out.println("People from Paris: " + map.getOrDefault(paris, Collections.EMPTY_LIST));
        // output
        // People from Paris: []
        map.putIfAbsent(paris, new ArrayList<>());
        map.get(paris).add(p1);
        System.out.println("People from Paris: " + map.get(paris));
        // output
        // People from Paris:  [Person{name=Alice, age=23}]
        map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p2);

        System.out.println("People from New York: " + map.getOrDefault(newYork, Collections.EMPTY_LIST));
        // output
        // People from New York: [Person{name=Brian, age=56}]
        map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p3);
        System.out.println("People from New York: " + map.getOrDefault(newYork, Collections.EMPTY_LIST));
        // output
        // People from New York: [Person{name=Brian, age=56}, Person{name=Chelsea, age=46}]
        Map<City, List<Person>> map1 = new HashMap<>();
        map1.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p1);
        map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p2);
        map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p3);

        System.out.println("Map 1");
        map1.forEach(((city, people) -> System.out.println(city + " : " + people)));
        // output
        // Map 1
        // City{name='Shanghai'} : [Person{name=Brian, age=56}, Person{name=Chelsea, age=46}]
        // City{name='New York'} : [Person{name=Alice, age=23}]

        Map<City, List<Person>> map2 = new HashMap<>();
        map2.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p4);
        map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p5);
        map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p6);
        System.out.println("Map 2");
        map2.forEach(((city, people) -> System.out.println(city + " : " + people)));
        // output
        // Map 2
        // City{name='Shanghai'} : [Person{name=David, age=28}]
        // City{name='Paris'} : [Person{name=Erica, age=37}, Person{name=Francisco, age=18}]
        System.out.println();
        map2.forEach(
                (city, people)->{
                    map1.merge(
                            city,people,
                            (peopleFromMap1,peopleFromMap2) ->{
                                peopleFromMap1.addAll(peopleFromMap2);
                                return peopleFromMap1;
                            });
                }
        );
        map1.forEach(
                (city, people)-> System.out.println(city+" : " +people)
        );
        // output
        // City{name='Shanghai'} : [Person{name=Brian, age=56}, Person{name=Chelsea, age=46}, Person{name=David, age=28}]
        // City{name='New York'} : [Person{name=Alice, age=23}]
        // City{name='Paris'} : [Person{name=Erica, age=37}, Person{name=Francisco, age=18}]
    }
}
