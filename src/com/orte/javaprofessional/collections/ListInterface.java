package com.orte.javaprofessional.collections;

public class ListInterface {
    // list => ordered collection usually called list or sequence
    // can contain repeated elements (contrary to Set)
    // developer has full control over in which place of list an element will be inserted
    // user can access element by index

    // all collections implement Serializable, Cloneable (except WeakHashMap)

    // interface List<E> extends interface Collection<E> which extends interface Iterable<E>
    // List<E> is implemented by AbstractList class which extends AbstractCollection class
    // ArrayList, Vector (deprecated), AbstractSequentialList extends AbstractList
    // Stack extends Vector
    // LinkedList extends AbstractSequentialList and implements Queue<E> interface
}
