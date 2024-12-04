package com.binary.day3and4and5;

public class Teacher extends  Person{

    public static void main(String[] args) {

        Student dawit = new Student();
        dawit.setName("Dawit");
        Student melad = new Student();
        melad.setName("Melad");

        Teacher kKhan = new Teacher();
        kKhan.setName("Khan");
        Teacher dejin = new Teacher();
        dejin.setName("Dejin");

        System.out.println(dawit.getName());
        System.out.println(melad.getName());
        System.out.println(dejin.getName());
        System.out.println(kKhan.getName());

    }
    private  String subjectName;
    private  double salary;


    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public double getSalary() {
        return salary;
    }

}
