package com.binary.day6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String username = null;
        String password = null;
        String loginUser = null;
        String loginPassword = null;
        int slectedOption = 0;
        boolean stop = false;

        System.out.println("*******************  Welcome to our App  *******************  ");

         while(!stop){
             System.out.println("1. Register ");
             System.out.println("2. Login ");
             System.out.println("3. Logout ");
             System.out.println("4. Exit");

             System.out.println("Please select one of the above options:");
             slectedOption = scan.nextInt();
             scan.nextLine();

             if(slectedOption == 1){
//               ------------------------------------------------------------------
                 System.out.println("Please enter your username: ");
                 username = scan.nextLine();
                 System.out.println("Please enter your password: ");
                 password = scan.nextLine();

                 System.out.println("User successfully Registered!");

                // ------------------------------------------------------------------

             }else if(slectedOption == 2){
                 // ------------------------------------------------------------------
                 System.out.println("Please enter your username to login: ");
                 loginUser = scan.nextLine();
                 System.out.println("Please enter your password tp login: ");
                 loginPassword = scan.nextLine();

                 if (username.equals(loginUser) && password.equals(loginPassword)) {
                     System.out.println("You are logged in!");
                 }else{
                     System.out.println("Your login details are incorrect!");
                 }

                 // ------------------------------------------------------------------
             } else if(slectedOption == 3){
                 // ------------------------------------------------------------------
                   loginUser = null;
                   loginPassword = null;
                 System.out.println("User successfully logged out!");
                 // ------------------------------------------------------------------
             } else if(slectedOption == 4){
                 // ------------------------------------------------------------------
                 stop = true;
                 System.out.println("User successfully exited!");
                 // ------------------------------------------------------------------
             }
         }




    }
}
