package com.orte.pluralsight.lambdasjava8.lambdasjav;



public class MainComparator {
    public static void main(String[] args) {
        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
        //Comparator<Person> cmpFirstName = Comparator.comparing(Person::getFirstName);
        //Comparator<Person> cmpFirstName = Comparator.comparing(Person::getAge);
        //Comparator<Person> cmpFirstName = Comparator.comparing(Person::getLastName);



    }
}
