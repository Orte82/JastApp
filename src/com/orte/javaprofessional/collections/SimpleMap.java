package com.orte.javaprofessional.collections;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    // M. => object which contains key-value pairs
    // object search is easier with unique key values
    // uniqueness of keys is ensured by redefining hashCode(), equals()
    // if element with referenced key is absent then returns null
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //               => interface SortedMap  => interface NavigableMap
        // interface SimpleMap
        //               => interface ConcurrentMap => interface ConcurrentNavigable SimpleMap

        // SimpleMap methods
        // SimpleMap m = Collections.synchronizedMap(new HashMap(...));

        // exists nested interface SimpleMap.Entry<K, V>
        // K getKey() returns key of current couple
        // V getValue() return value of current couple
        // V setValue(V obj) defines value of obj in current couple

        map.put("world", 100);
        System.out.println(map.size()); //1
        map.put("world1", 150);
        map.put("world2", 300);
        System.out.println(map.size()); //3
        System.out.println(map);//{world2=300, world=100, world1=150}

        for (Map.Entry<String, Integer> temp : map.entrySet()) {
            System.out.println(temp.getKey() + " " + temp.getValue());
            // world2 300
           //  world 100
           //  world1 150
            map.put(null, 5000);
        }

    }


}
