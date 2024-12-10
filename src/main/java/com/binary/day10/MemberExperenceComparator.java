package com.binary.day10;

import java.util.Comparator;

public class MemberExperenceComparator implements Comparator<Member> {

    @Override
    public int compare(Member m1, Member m2) {
        return m1.getExperience() - m2.getExperience();
    }
}
