package com.orte.pluralsight.javacollections.sets;

import com.orte.pluralsight.javacollections.Product;
import com.orte.pluralsight.javacollections.Supplier;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalog implements Iterable<Product> {

    private final Set<Product> products = new HashSet<>();

    public void isSuppliedBy(Supplier supplier){
        products.addAll(supplier.products());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
