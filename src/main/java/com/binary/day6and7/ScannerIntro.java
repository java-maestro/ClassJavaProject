package com.binary.day6and7;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        // Scanner class is used to get the input from user.
        // it's imported from java.util package

// Scanner Object will take the InputSource which System.in as input parameter
        Scanner scan = new Scanner(System.in);

        // methods
//          String input : nextLine(), next()
//          int   input  : nextInt()
//          double input : nextDouble();

//      Note: Taking input from any DataType other than String, we will use the followup scanObj.nextLine(); statement
//        System.out.println("Please enter your name : ");
//        String name = scan.nextLine();
//
//        System.out.println("User entered: " + name);
//
//        System.out.println("Please enter your age : ");
//        int age = scan.nextInt();
//        System.out.println("User entered: " + age);

        // build a code to get the person's details
        // name String
        // age  int
        // phoneNumber int
        // salary double
        // dateOfBirth string
        // address string
        // email   string
        // isFinished boolean

        System.out.println("Please enter your name :");
        String name = scan.nextLine();
        System.out.println(name);

        System.out.println("Please enter your age :");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println(age);

        System.out.println("Please enter your phoneNumber :");
        long phoneNumber = scan.nextLong();
        scan.nextLine();
        System.out.println(phoneNumber);

        System.out.println("Please enter your Salary :");
        double salary = scan.nextDouble();
        scan.nextLine();
        System.out.println(salary);

        System.out.println("Please enter your dateOfBirth :");
        String dateOfBirth = scan.nextLine();
        System.out.println(dateOfBirth);

        System.out.println("Please enter your address :");
        String address = scan.nextLine();
        System.out.println(address);

        System.out.println("Please enter your email :");
        String email = scan.nextLine();
        System.out.println(email);

        System.out.println("Please enter your isFinished :");
        boolean isFinished = scan.nextBoolean();
        System.out.println(isFinished);
        scan.nextLine();

     // use the scanner to take input to build yesterday's homework class objects.
        // Laptop
        // Table
        // Light



    }

}
