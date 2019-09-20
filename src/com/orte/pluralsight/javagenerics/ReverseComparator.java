package com.orte.pluralsight.javagenerics;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {
    private final Comparator<T> delegateComparator;

    public ReverseComparator(final Comparator<T> delegateComparator) {
      this.delegateComparator = delegateComparator;
    }

    @Override
    public int compare(final T o1, final T o2) {
        return -1 * delegateComparator.compare(o1, o2);
    }
}
