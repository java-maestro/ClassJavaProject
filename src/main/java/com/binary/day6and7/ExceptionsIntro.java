package com.binary.day6and7;

import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionsIntro {
    public static void main(String[] args) {


//        What is the Exception?
//        Exceptions: abnormal termination of Program.

//        Types of Exceptions:
//        1. Checked Exceptions:
//                     -> checked exceptions can be checked at compile time, Extends the "Exception" Class.
//                     -> methods that might throw a checked Exception must declare it in their "throws" clause.
//                     -> handle the exception using try/catch block.

//        2. Unchecked Exceptions:
//                      -> not checked at compile time, Extends the RuntimeException" class
//                      -> methods that might throw an unchecked Exception, no need to declare it in their "throws" clause.
//                      -> caught explicitly.

        // Exceptions Hierarchy:
//         Throwable -> Main class
//         Exception
//         RuntimeException
//         IOException
//         SQLException
//         ArrayIndexOutOfBoundException.
//         StringIndexOutOfBoundException

        // Exception Handling: Inorder to stop the abnormal termination of Program, we use Exception Handling.
//                            try/catch and finally.
//              try{
//                 problematic code
//               }catch(Exception e){
//                 will deal with it accordingly
//              }

//         Ways to print an Exceptions:
//         printStackTrace() : ExceptionClassName, message, location of Exceptions
//         getMessage()      : message
//         directly print the Exception: ExceptionClassName, message


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer A: ");
//        int a = scanner.nextInt();
//        System.out.println("Enter an integer B: ");
//        int b = scanner.nextInt();
//
//        try{
//            System.out.println("A/B = "+ a/b);        //   problematic code
//        }catch (ArithmeticException arithmeticException){
//
//            System.out.println(arithmeticException);   // directly print the Exception
//            System.out.println(arithmeticException.getMessage()); //  getMessage()      : message
//          // arithmeticException.printStackTrace(); // printStackTrace() : ExceptionClassName, message, location of Exceptions
//        }catch (Exception exception){
//
//            System.out.println(exception);   //    directly print the Exception
//
//        }finally {
//            System.out.println("This is finally block code");
//        }

        System.out.println("some other code ");


        ATM atm1 = new ATM();

       try{
           atm1.withdraw(10);
       }catch (MinWithdrawAmountException e){
           e.printStackTrace();
       }finally {
           System.out.println("Always Welcome...!");
       }

    }
}
