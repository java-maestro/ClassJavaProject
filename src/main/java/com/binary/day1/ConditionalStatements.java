package com.binary.day1;

public class ConditionalStatements {

    public static void main(String[] args) {


        // conditional statements
        // if
        //  else
        //  else if
        //   switch

        boolean condition = true;

        if (condition) {
            System.out.println("This block of code will print only if condition is true");
        } else {
            System.out.println("This block of code will not print only if condition is false");
        }

        // write a logic to check given person is senior citizen or not.
        // person age is greater than 50 => senior citizen
        byte age = 55;

        if (age >= 50) {
            System.out.println("Senior citizen");
        } else {
            System.out.println("not a Senior citizen");
        }

        // write a logic to check given person is senior citizen or not.
        // person age is greater than 50 => senior citizen
        // person age is less than 20 => teenagers
        // person age is greater than 20 and less than 50 => youngsters

        short personAge = 15;


        //    switch

//         switch (expression) {
//                case value:
        //           code
//                break;
        //        case value:
        //               code
//                 break;
        //        case value:
        //               code
//                 break;
//               default:
//                       code
//                 break;

//         }


//         write a code to print the menu in a restaurant based on timing using the switch statement.
//          breakfast, lunch, dinner

        String timing = "lunch";

        switch (timing){
            case "lunch":
                System.out.println("lunch");
                break;
           case "dinner":
               System.out.println("dinner");
                 break;
            case "breakfast":
                System.out.println("breakfast");
                break;
            default:
                System.out.println("unknown");
                break;
        }















    }
}
