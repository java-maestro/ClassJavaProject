package com.binary.day10;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableVsComparator {
    public static void main(String[] args) {

//                         Comparable                                                  Comparator
//          Comparable is interface => java.lang                                  Comparator is also an Interface => java.util
//         it is used to compare the current object with another object           it is used to compare two objects
//         compareTo().                                                           compare()


        Member member1 = new Member("john", 25, 2500, 5);
        Member member2 = new Member("bob", 31, 3600, 4);
        Member member3 = new Member("rose", 37, 1800, 6);
        Member member4 = new Member("roy", 22, 1000, 2);
        Member member5 = new Member("joy", 27, 4500, 7);


        ArrayList<Member> members = new ArrayList<>();
        members.add(member1);
        members.add(member2);
        members.add(member3);
        members.add(member4);
        members.add(member5);

        for(Member member : members){
            System.out.println(member);
        }
        
        Collections.sort(members);

        System.out.println("------------------------------------------------------------------------------");

        for(Member member : members){
            System.out.println(member);
        }
        System.out.println("------------------------------------------------------------------------------");

        Collections.sort(members, new MemberSalaryComparator());

        for(Member member : members){
            System.out.println(member);
        }

        System.out.println("------------------------------------------------------------------------------");


        Collections.sort(members, new MemberExperenceComparator());
        for(Member member : members){
            System.out.println(member);
        }

    }
}
