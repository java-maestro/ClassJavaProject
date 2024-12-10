package com.binary.day7and8and9;

import java.util.*;

public class SetIntro {

    public static void main(String[] args) {

        // set => all items in set are unique.


        // 1. HashSet          => arraylist
//         2. LinkedHashSet    => LinkedList
//         3. TreeSet          => Red Black Tree

//          Ven - diagrams

//        Set<Datatype>  variableName = new HashSet<>();
//
//        1. HashSet
        Set<String> company1 = new HashSet<>();
        company1.add("bob");
        company1.add("adams");
        company1.add("kim");
        company1.add("jim");
        company1.add("joe");
        company1.add("adams");
        company1.add("roy");


        System.out.println(company1);
        System.out.println(company1.size());


        Set<String> company2 = new HashSet<>();

        company2.add("adams");
        company2.add("joe");
        company2.add("bob");
        company2.add("kim");
        company2.add("jim");

        System.out.println(company2);
        System.out.println(company2.size());

//            company1.retainAll(company2); // it will find the intersection between set1 and set2, and it stores in set1
              company1.removeAll(company2); // it will find the intersection between set1 and set2, and it removes it from set1

        System.out.println(company1);
        //Hashset does not follow the insertion order


        // 2. LinkedHashset

//        maintains the insertion order.
//        it needs more memory than hashset

        Set<String> company3 = new LinkedHashSet<>();
        company3.add("bob");
        company3.add("adams");
        company3.add("kim");
        company3.add("jim");
        company3.add("joe");
        company3.add("adams");
        company3.add("roy");
        System.out.println(company3);


        // 3. TreeSet -> class that implements SortedSet Interface.

//         Red Black Trees (Balanced Binary Trees)
//         time complixity => O(logN)


        SortedSet<Integer> set1 = new TreeSet<>();

        set1.add(40);
        set1.add(200);
        set1.add(15);
        set1.add(4);
        set1.add(120);
        set1.add(75);

        System.out.println(set1);

        Set<Integer> subset = set1.subSet(40, 100);
        System.out.println(subset);

        Set<Integer> tailSet = set1.tailSet(75);
        System.out.println(tailSet);

        Set<Integer> headSet = set1.headSet(75);
        System.out.println(headSet);

        System.out.println(set1.first());
        System.out.println(set1.last());

//                HashSet                                    LinkedHashSet                                    TreeSet
//              uses arrays                                 uses LinkedList                             Balanced Binary Trees
//    Best     we can achieve O(1)                               O(1)                                        O(logN)
//    Worst           O(logN)                                    O(logN)                                     O(logN)
//            can store null values                       can store null values                          can not store null values.
//        does not follow the insertion order            follows the insertion order                     follows the sorting order.



    }
}
