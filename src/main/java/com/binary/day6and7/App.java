package com.binary.day6and7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        User[]  users =new User[10]; // we are creating an array to store 10 users.
        int lastUserlocation =0;
        Scanner scan = new Scanner(System.in);
        String username = null;
        String password = null;
        String loginUser = null;
        String loginPassword = null;
        boolean login = false;

        int slectedOption = 0;
        boolean stop = false;

        System.out.println("*******************  Welcome to our App  *******************  ");

         while(!stop){
             System.out.println("1. Register ");
             System.out.println("2. Login ");
             System.out.println("3. All users");
             System.out.println("4. Logout ");
             System.out.println("5. Exit");

             System.out.println("Please select one of the above options:");
             slectedOption = scan.nextInt();
             scan.nextLine();

             if(slectedOption == 1){

                 if(lastUserlocation < users.length){
                     System.out.println("Please enter your username: ");
                     username = scan.nextLine();
                     System.out.println("Please enter your password: ");
                     password = scan.nextLine();

                     User user1 = new User(username, password);

                     users[lastUserlocation] = user1;

                     lastUserlocation = lastUserlocation +1;
                     // next location = prev location + 1
                     System.out.println("User successfully Registered!");
                 }else{
                     System.out.println("Users array is out of memory!");
                 }


             }else if(slectedOption == 2){

                 System.out.println("Please enter your username to login: ");
                 loginUser = scan.nextLine();
                 System.out.println("Please enter your password tp login: ");
                 loginPassword = scan.nextLine();

                    for(int i =0; i < lastUserlocation; i++){
                       User user = users[i] ;

                       if( user.getUsername().equals(loginUser) && user.getPassword().equals(loginPassword)){
                           login = true;
                       }

                    }


                 if (login) {
                     System.out.println("You are logged in!");
                 }else{
                     System.out.println("Your login details are incorrect!");
                 }

             }else if(slectedOption == 3){
              // show all users
                 for(int i=0;i <lastUserlocation;i++){
                     System.out.println(users[i]);
                 }

             }
             else if(slectedOption == 4){
                   loginUser = null;
                   loginPassword = null;
                   login = false;
                 System.out.println("User successfully logged out!");

             } else if(slectedOption == 5){

                 stop = true;
                 System.out.println("User successfully exited!");

             }
         }




    }
}
