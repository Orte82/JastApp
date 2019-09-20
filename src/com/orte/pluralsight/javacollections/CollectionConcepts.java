package com.orte.pluralsight.javacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<Product>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        System.out.println(products);
        //[com.orte.pluralsight.javacollections.Product@3941a79c, com.orte.pluralsight.javacollections.Product@506e1b77, com.orte.pluralsight.javacollections.Product@4fca772d]
        // iterator concept
        final Iterator<Product> iterator = products.iterator();
//        while(iterator.hasNext()){
//            Product product = iterator.next();
//            System.out.println(product);
////            Product{name='Wooden Door', weight=35}
////            Product{name='Floor Panel', weight=25}
////            Product{name='Glass Window', weight=10}
//        }

        //foreach loop
        for (Product product : products) {
            System.out.println(product);
//            Product{name='Wooden Door', weight=35}
//            Product{name='Floor Panel', weight=25}
//            Product{name='Glass Window', weight=10}
            //modification doesn't work here
        }
        while(iterator.hasNext()){
            Product product = iterator.next();
            if (product.getWeight()>20){
                System.out.println(product);
            }else{
                iterator.remove();
            }



        }
        System.out.println(products);
        System.out.println(products.size());//2
        System.out.println(products.isEmpty());//false
        System.out.println(products.contains(window));//false
        System.out.println(products.contains(door));//true
        Collection<Product> otherProducts =  new ArrayList<>();
        otherProducts.add(window);
        otherProducts.add(door);
        products.removeAll(otherProducts);
        System.out.println(products);//[Product{name='Floor Panel', weight=25}]
    }
}
