package com.orte.javaprofessional.collections;

public class SetInterface {
    // ensures no duplicates in it
    // interface SortedSet<E> extends Set<E> and defines behavior of ascending sorted set
    // interface NavigableSet<E> extends SortedSet makes substantially easier to find elements
    // interface Set extends Collection
    // class LinkedHashSet extends abstract class AbstractSet which implements interface Set
    // class HashSEt extends abstract class AbstractSet which implements interface Set
    // class EnumSet extends abstract class AbstractSet which implements interface Set
    // class TreeSetClass implements interface NavigableSet and extends class AbstractSet
    // class AbstractSet extends AbstractCollection which implements interface Collection

    // HashSet<E> uses hash table for storing collection
    // Key (hash code) is used instead of index for data access and substantially speeds up search of definite element
    // elements considered equal if equal() returns true
    // In Java HashSet implemented on HashMap base
    // HashSet<E> hs = new HashSet<>();

    // Constructors
    // HashSet()
    // HashSet(Collection <? extends E> c);
    // HashSet(int capacity);
    // HashSet(int capacity, float loadFactor);
    // loadFactor => percent of buffer filled on which set is extended (default 0.75)

}
