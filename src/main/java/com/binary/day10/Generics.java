package com.binary.day10;

public class Generics {

    public static void main(String[] args) {

        // Generics means parameterized types.
        //  represented by <>
        // Type Parameters in java
//         1. T  Type
//         2. E  Element
//         3. K  Key
//         4. N Number
//         5. V Value


        // code reusability
//         Type Safety
//         No Need to do type casting.
//        more reliable and efficient generic code.


//        NOTE: Not Supported for primitive Types
        Member member1 = new Member("john", 25, 2500, 5);
        Member member2 = new Member("bob", 31, 3600, 4);

        Group<Member> group1 = new Group<>();
        group1.add(member1);
        group1.add(member2);

        group1.print();

        Group<String> group2 = new Group<>();
        group2.add("john");
        group2.add("bob");
        group2.print();

        Group<Integer> group3 = new Group<>();
        group3.add(1);
        group3.add(2);
        group3.print();

    }
}
