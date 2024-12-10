package com.binary.day10;

public class Member implements  Comparable<Member>{

    private String name;
    private int age;
    private int salary;
    private int experience;

    public Member(String name, int age, int salary, int experience) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return this.name.equals(member.getName()) && this.age == member.getAge() && this.experience == member.getExperience() && this.salary == member.getSalary();
        }
       return  false;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    @Override
    public int compareTo(Member member) {
        return this.age - member.age;
    }
}
