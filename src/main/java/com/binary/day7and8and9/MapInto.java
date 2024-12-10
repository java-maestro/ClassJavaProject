package com.binary.day7and8and9;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInto {

    public static void main(String[] args) {
        // Maps  => keys and values => Pair => this pair we call it as Entry
        // 1. HashMap
//         2. LinkedHashMap
//         3. TreeMap


//            aim to reach O(1)

        // Hash Functions => it defines the relation between keys and the memory index.

//        HashMap<keyDataType, valueDataType> variableName = new HashMap<keyDataType, valueDataType>();

        HashMap<String, Integer> personAge = new HashMap<>();
        personAge.put("jhon", 28);
        personAge.put("adams", 30);
        personAge.put("roy", 30);
        personAge.put(null, 45);

        System.out.println(personAge);

        System.out.println(personAge.get("jhon"));

        System.out.println(personAge.keySet());
        System.out.println(personAge.entrySet());

        for (Map.Entry<String, Integer> entry : personAge.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
//         HashMap will accept null as key.
//         HashMap does not follow the insertion order.

        //        LinkedHashMap

//        uses the Double-Linked List
//        needs more memory
//        LinkedHashMap will also accept the null as key.
//        LinkedHashMap does follow the insertion order.

//         LinkedHashMap<KeyDataType, valueDatatype> variableName = new LinkedHAshMap<KeyDataType, valueDatatype>();
//         LinkedHashMap<KeyDataType, valueDatatype> variableName = new LinkedHAshMap<>();

        // TreeMap -> Class -> implementing the SortedMap Interface  => O(logN)

//         Balanced Binary Trees => AVL Trees, Red-Black Trees.

//        TreeMap<KeyDataType, valueDatatype> variableName = new TreeMap<KeyDataType, valueDatatype>();

        TreeMap<Double, String> prices = new TreeMap<>();

        prices.put(6.0, "orange");
        prices.put(8.5, "cherry");
        prices.put(5.0, "apple");
        prices.put(7.5, "pineapple");
        prices.put(3.5, "pen");

        System.out.println(prices);

        System.out.println(prices.firstKey());
        System.out.println(prices.lastKey());
        System.out.println(prices.firstEntry());
        System.out.println(prices.lastEntry());

//                                        HashMap                                      LinkedHashMap                                         TreeMap
//                                       uses Arrays                               uses doubleLinkedList                               BalancedBirarytrees
//        time complexity best case       can achieve O(1)                             can achieve O(1)                                 O(longN)    => 100%
//                       worst case           O(N)                                     O(logN)                                            O(logN);
//                                    we can have null as key                        we can have null as key                         we can not have a null as key.
//                               does not follow the insertion order              does  follow the insertion order                      follow the sorting order




    }
}
