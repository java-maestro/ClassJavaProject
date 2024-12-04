package com.binary.day3and4and5;

public class ObjectClassIntro {

    public static void main(String[] args) {

//        Object Class
//        its root or parent class for all the objects that are created inside a java.

//        -- toString();
//            it will return the String representation of Object.
//        -- equals(Objeact obj):
//            It will be used to indicate the weather second object is equal or not to the current Object.
//            By default, it will check weather both belongs to the same memory location or not.
//            ==          => (Shallow comparison)
//            equals()    => Deep comparison.
//        -- hashcode();
//             -> it will return the hash code values of Object
//        --clone();
//             -> it will used to create the new copy of the object and return it.
//        -- finalize();
//            -> it will be called by garbage collector on an object when garbage collector determines that there are no more references to that object.

        Student dawit = new Student();
        dawit.setName("Dawit");
        dawit.setGrade('A');
        dawit.setFee(45000);

        Student melad = new Student();
        melad.setName("Melad");
        melad.setGrade('B');
        melad.setFee(21000);

        Student dawit2 = new Student();
        dawit2.setName("Dawit");
        dawit2.setGrade('A');
        dawit2.setFee(45000);


        Teacher kKhan = new Teacher();
        kKhan.setName("Khan");

        System.out.println(dawit);
        System.out.println(dawit2);

        System.out.println( dawit == dawit2);
        System.out.println(dawit.equals(dawit2));

        System.out.println(dawit.equals(kKhan));

        System.out.println(dawit.hashCode());
        System.out.println(dawit2.hashCode());




        // create a class
        // min 5 attributes
//         parameterized constructor
//         getters and setters
//         toString method
//         equals   method.


    }
}
