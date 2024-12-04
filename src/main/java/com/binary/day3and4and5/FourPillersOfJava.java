package com.binary.day3and4and5;


import com.binary.day3and4and5.loan.LoanApplication;

public class FourPillersOfJava {
    public static void main(String[] args) {

//    1. Encapsulation
//    2. Inheritance
//    3. Polymorphism
//    4. Abstraction



//        1. Encapsulation
//         is to make sure that "sensitive Data" is hidden from the users.
//          1. declare class variables/attributes as private
//          2. we will create a set or get methods to access or update the values of attributes.

        BankAccount account1 = new BankAccount(12345678,"1234" );
        account1.login();
        account1.setBalance(100);
        account1.setSsn(52812368);
        account1.setName("Jhon");
        account1.logout();

        account1.login();
        System.out.println(account1.getBalance());


//       2. Inheritance
//        it's possible to inherit attributes and methods from one class to Another Class.
//        To inherit from one Class to another class, we will use a keyword "extends".
//        1. subclass or child class -> classes that inherits from another class (Parent)
//        2. superClass or parent class -> this classes provides inheritance to childClass or subClass

//       "super" keyword, it is used to access the parent methods or attributes in child class.
//        for all the objects in java, parent class is "Object", java creates that.

        Parent p = new Parent();
        Child c = new Child();

        p.setMoney(1000);
        p.setLastname("Miller");

        c.setLastname("Caption");
        c.setMoney(2000);
        c.setName("John");


//       Types of Inheritance:
//        1. Single Inheritance       Child <- Parent
//        2. Multi-level Inheritance  Child <- Parent <- Grand Parent
//        3. Multiple Inheritance
//                                    Child  <- Father
//                                    Child  <- Mother
//        4. Hierarchical Inheritance
//                                    Child 1   <-- Parent  1 <--- Grand Parent
//                                    Child 2   <-- Parent  1 <--- Grand Parent
//                                    Child 3   <-- Parent  2 <--- Grand Parent

//        5. Hybrid Inheritance    (Hierarchical Inheritance +  Multiple Inheritance )


        // create a Person
        //            => name , id, address, getters and setters,
        // create a student <- Person
        //           => grade, fee, getters and setters  parameterized constructor
        // create a Teacher <- Person
        //          => subjectName, salary, getters and setters  parameterized constructor

        // create two objects of student and teacher.


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

//        3. Polymorphism => Poly -> Many , morphism -> change to different form
//                        => Many form

//        Polymorphism
//        1. Compile time Polymorphism => Method Overloading
//        2. Runtime Polymorphism      => Method Overriding

//        Method Overloading
//        method name => same
//        Method Overloading will be used when method should have different number of parameters with the same datatypes or
//        different datatypes with the same number of parameters with the same class.

//        Method Overriding
//        method name => same
//        Method overriding will be used when there are two classes having Inheritance relationship
//        and both are having the same method with different implementation.
//        @Override

        Calc calc1 = new Calc();

        int result = calc1.add(10,20);

        System.out.println(result); // 30

        int result2 = calc1.add(120,113,14);

        System.out.println(result2); // 247

        double result3 = calc1.add(12, 2, 3.5);

        System.out.println(result3); // 17.3

        // task : add one float and two doubles

        double result4 = calc1.add(2.1f,12.5 , 4.3);

        System.out.println(result4); // 18.89999990463257


        // task : addd three ints => 12, 41, 23

        int result5 =calc1.add(12,41,23);

        System.out.println(result5); // 76


        Father f1 = new Father();
        Son son1 = new Son();

        f1.style();
        son1.style();

        Animal pet1 = new Animal();
        pet1.sound();

        Cat pet2 = new Cat();
        pet2.sound();

        Dog pet3 = new Dog();
        pet3.sound();



        //    4. Abstraction  => hiding the implementation.
//         is a process of hiding the certain details and showing only essential information to user.

//        1. using private methods.
//        2. Abstract Classes.
//        3. Interfaces.

        LoanApplication application1 = new LoanApplication(35000, "john", "ABC123E", 15000, 12000);

        System.out.println(application1.calculateRate());


//        2. Abstract Classes.
//           we will use a keyword "abstract"
//           Abstract method can only be created inside a abstract class.
//          Abstract Classes can have both regular methods and Abstract methods.
//         Whatever class extending from abstract class need to provide the implementation for abstract methods.

//       what abstract method ?
//       we will use the keyword "abstract"
//       abstract methods will not have a body.
//       Abstract method can only be created inside a abstract class.


        // Interfaces

//        this is another way of achieving abstraction.
//        Interfaces are completely Abstract, means only Abstract methods are allowed.
//        To access the Interface method, the interface must be implemented by another class.
//         we will use the keyword "implements"

//        Rules:
//        Interfaces cannot be used to create Objects
//        Interfaces can only have Abstract methods
//        Whatever class implementing the Interface needs to provide the implementation for abstract methods.
//        In Interface by default, all the methods are public.
//        In Interface, we cannot contain a constructor.
//        In Interface, attributes are public and static and final.


//        final Keyword :

//        if you use final with attribute/variables, it cannot be changed. (makes it constant);
//        if you use final with method,              it cannot be override.
//        if you use final with class,               it cannot be extended.





    }
}
