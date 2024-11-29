package com.binary.day1;

public class LoopStatements {

    public static void main(String[] args) {

//        for
//        while
//        do while
//
//         for (start; condition; update){
//              repeating code
//         }


        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        // write a code for 39, 41, 43 ...... 150.
        // print all values and check if any value is divisible by 5, if it does then print this is divisible by 5

        //     start;   condition  update
        for( int i = 39; i < 150 ; i+=2){
            // --------------------------------------------------------------------
            if(i % 5 ==0){  //   repeating code
                System.out.println(i+" this is divisible by 5"); //  repeating code
            }else{ //   repeating code
                System.out.println(i); //   repeating code
            } //   repeating code
            // --------------------------------------------------------------------
        }

        System.out.println("-----------------------While-----------------------------");
//        start;
//        while(condition){
//         repeating code

//         update
//        }

        // write a code for 39, 41, 43 ...... 150.
        // print all values and check if any value is divisible by 5, if it does then print this is divisible by 5

        int a = 39; // start;
//           condition
        while(a < 150){

            if(a % 5 ==0){  //   repeating code
                System.out.println(a + " this is divisible by 5"); //  repeating code
            }else{ //   repeating code
                System.out.println(a); //   repeating code
            } //   repeating code

            a+=2; //update
        }

//        start;
//        do {
//            repeating code
//            update
//        }while(condition);


        //  Pattern  Programming
//          0 1 2 3 4
//        0 * * * * *
//        1 * * * *
//        2 * * *
//        3 * *
//        4 *


        for(int row =0; row<=4; row++ ){

            for (int col =0; col <=(4-row); col++){
                System.out.print("* ");
            }

            System.out.println();
        }

//          0 1 2 3 4
//        0 *
//        1 * *
//        2 * * *
//        3 * * * *
//        4 * * * * *

        for(int row =0; row<=4; row++ ){

           for(int col =0; col <= row; col++){
               System.out.print("* ");
           }
            System.out.println();
        }

        //          0 1 2 3 4
//        0                 *          no spaces = 4-0-1 = > 3  => 0, 1 ,2, 3
//        1               * *          no space  = 4-1-1 => 2   =>  0, 1, 2
//        2             * * *          no space  = 4-2-1 => 1   =>  0, 1
//        3           * * * *
//        4         * * * * *
        System.out.println("-----------------------------------------------");
        for(int row =0; row<=4; row++ ){

            for(int col =0; col <= 4; col++){
                if(col <= 4-row-1){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------");

        //          0 1 2 3 4
//        0         * * * * *
//        1           * * * *
//        2             * * *
//        3               * *
//        4                 *



        // 1. Write a Java program that takes an integer as input and prints whether the number is positive, negative, or zero using if-else conditions.

        // 2. Write a Java program to check if a given number is odd or even using if-else conditions.

        // 3. Write a Java program that takes a score (0-100) as input and prints the corresponding grade using if-else conditions. For example:
        //    90-100: A
        //    80-89: B
        //    70-79: C
        //    60-69: D
        //     0-59: F

        // 4. Write a Java program that takes the lengths of three sides of a triangle as input
        // and determines if the triangle is equilateral, isosceles, or scalene using if-else conditions.

//          5. Write a Java program that takes an integer as input and classifies it into one of the following categories using if-else conditions:
//              Positive and even
//              Positive and odd
//              Negative and even
//               Negative and odd
//                Zero

//        6. Write a Java program that takes integer 100 as input and calculates the sum of the first 100 natural numbers using a while loop.

//        7. Write a Java program that takes an integer as input and prints its multiplication table up to 10 using a for loop.

//        8. Write a Java program to print all prime numbers between 1 and 100 using a nested for loops.

    }
}
