package com.binary.day10;

import java.util.Comparator;

public class MemberSalaryComparator implements Comparator<Member> {

    @Override
    public int compare(Member m1, Member m2) {
        return m1.getSalary() - m2.getSalary();
    }

}
