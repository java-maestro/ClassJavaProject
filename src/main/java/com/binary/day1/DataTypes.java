package com.binary.day1;

public class DataTypes {


    public static void main(String[] args) {

      // DataTypes are divided into two groups :
//        1. Primitive Data Types          => Data
//        2. Non - Primitive Data Types    => Data and Actions

//        Primitive Data Types
//            name                        memory                                  range
//        1. byte                          1 byte                  range       -128  to 127
//        2. short                         2 bytes                range     -32,768  to 32,767
//        3. int                           4 bytes                range is  -2,147,483,648 to 2,147,483,647
//        4. long                          8 bytes               range is -9223372036854775808  to 9223372036854775807
//        5. float                         4 bytes              it is used to store the fractional numbers, it can store up to 6 or 7 decimal digits
//                                                                 ex: 12.4567893
//        6. double                        8 bytes              it is used to store the fractional numbers, it can store up to 15 decimal digits
//                                                                  ex: ex: 12.45678931234567
//        7. boolean                       1 bit                  0 or 1 =>      0 => false,  1 => true
//        8. char                          2 bytes              a-z, A-Z, 0-9, other symbols,   for char we use '' (single quotes)
//                                                                   ex: 'a', 'A', '$', '0'

//        All the variable name must start with lower case, alternate word first letter should be captial.
//
//        how to create a variable inside Java ?

//        variableDataType  variableName = variableValue ;

            byte               a         =   10;

            System.out.println(a);

            short   b = 1000;
            System.out.println(b);
            int c = 10000000;
            float d = 1.15678f;
            System.out.println(d);
            float e = 245f;
            System.out.println(e);
            int f = 245;
            System.out.println(f);
            double g = 1.15678;
            System.out.println(g);
            boolean h = true;
            System.out.println(h);
            char   i = 'A';
            System.out.println(i);

            long accountNumber = 23456789123456789L;


//            2. Non - Primitive Data Types    => Data and Actions

//            String => series of characters  => "" (double quotes)

//           All the non - primitive data types starts with captal letters because it is also a Class in Java.

            String name = "Hemanth";



    }

}
