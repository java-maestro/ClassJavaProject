package com.binary.day3;

public class ConstuctorsInro {
    public static void main(String[] args) {

        // Special method that is used to initialise/(build)/(create) the objects.
        //By default, constructor method will be called when an object of classes is created.


        // Rules :
//        1. it has to use the Class name as same as constructor name.
//        2. no return type and no return statement.
//        3. Almost all the cases we will make it public.

        // default constructor
//         public ClassName(){
//
//        }

        // parametrized constructor
//        public ClassName (dataType parameterName){
//
//        }
        
        
//        Keyword : "this"
//        this keyword refers to the current Object(itself) in method or constructor.
//        -> "this" keyword is used to eliminate the confusion between attributes and input parameters.

        Phone phone1 = new Phone();

        phone1.setColor("gold");
        phone1.setBrand("Apple");
        phone1.setModel("16 Pro");
        phone1.setPrice(1000.00);

        System.out.println(phone1.getColor());
        System.out.println(phone1.getBrand());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getPrice());


//        String inputColor, String inputBrand, double inputPrice, String inputModel
        Phone phone2 = new Phone("gold", "Apple", 1000, "16 Pro");

        System.out.println(phone2.getColor());
        System.out.println(phone2.getBrand());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getPrice());


        phone2.setColor("blue");
        System.out.println(phone2.getColor());

        Phone phone3 = new Phone("green", "Tesla", 1200, "model z");
        System.out.println(phone3.getColor());
        System.out.println(phone3.getBrand());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getPrice());

        Phone phone4 = new Phone("Google", "pixel 9");

//         DataTypes
//         Operators
//----------------------------------
//         TypeCasting
//         Conditional Statements
//        ---------------------------------
//        Loop Statements
//        ---------------------------------
//        Class and Objects and Attributes and Methods
//        ----------------------------------
//        Methods
//        Static Vs Non Static
//        ----------------------------------
//        Constructors
//        AccessModifiers
//        This
//        ----------------------------------
//         Class and Objects and Attributes and Methods



        // Weekend Homework.
        //  1. Write a Java program to find the largest among three numbers.
        //  2. Write a Java program to check if a character is a vowel or consonant
        //  3. Write a Java program to determine if a person is eligible to vote based on their age
        //  4. Write a Java program to calculate the factorial of a number using a while loop
        //  5. Write a Java program to find the sum of all even numbers between 1 and 100 using a for loop

        // 6. Define a class called Student with attributes name, age, and grade. Create a constructor to initialize
        //      these attributes and a method to display the student's details.
        //   7. Create a class Rectangle with attributes length and breadth. Write methods to calculate the area and perimeter
        //       of the rectangle. Create objects of the class and test the methods.
        //   8. Create a class BankAccount with attributes accountNumber, balance, and methods to deposit and withdraw money.
        //       Write a program to test these methods.
        //   9.  Write a class Product with attributes productId, name, and price. Include a parameterized constructor to initialize
        //       these attributes and a method to display the product details. Create multiple objects and display their details.
        //   10.  Book Class:
        //           Attributes: title (String), author (String), isbn (String), isAvailable (boolean)
        //           Constructors:
        //                   A parameterized constructor to initialize all the attributes.
        //             Methods:
        //                      getTitle(): Returns the title of the book.
        //                     getAuthor(): Returns the author of the book.
        //                       getIsbn(): Returns the ISBN of the book.
        //                   isAvailable(): Returns the availability status of the book.
        // setAvailability(boolean status): Sets the availability status of the book.




    }


}
