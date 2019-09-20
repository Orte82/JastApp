package com.orte.pluralsight.lambdasjava8.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MapAPICollection {
    public static void main(String[] args) {
            Person p1 = new Person("Alice", 23);
            Person p2 = new Person("Brian", 56);
            Person p3 = new Person("Chelsea", 46);
            Person p4 = new Person("David", 28);
            Person p5 = new Person("Erica", 37);
            Person p6 = new Person("Francisco", 18);


            List<Person> people = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));



            people.forEach(System.out::println);
   //         people.forEach(person ->System.out.println(person));

            //output
            //        Person{name=Alice, age=23}
            //        Person{name=Brian, age=56}
            //        Person{name=Chelsea, age=46}
            //        Person{name=David, age=28}
            //        Person{name=Erica, age=37}
            //        Person{name=Francisco, age=18}
        System.out.println();
        people.removeIf(person -> person.getAge() < 30);

        people.forEach(System.out::println);
        // output
        //        Person{name=Brian, age=56}
        //        Person{name=Chelsea, age=46}
        //        Person{name=Erica, age=37}

        System.out.println();
        people.replaceAll(person -> new Person(person.getName().toUpperCase(), person.getAge()));
        people.forEach(System.out::println);
        // output
        //        Person{name=BRIAN, age=56}
        //        Person{name=CHELSEA, age=46}
        //        Person{name=ERICA, age=37}
        System.out.println();
        people.sort(Comparator.comparing(Person::getAge));//.reversed()
        people.forEach(System.out::println);
        // output
        //        Person{name=ERICA, age=37}
        //        Person{name=CHELSEA, age=46}
        //        Person{name=BRIAN, age=56}
    }
}
