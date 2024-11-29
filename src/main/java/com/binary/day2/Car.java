package com.binary.day2;

public class Car {

    //    1. Attributes => model, color, millage, doors, mfgYear, price

    String model;
    String color;
    int millage;
   static int doors;
    int mfgYear;
    double price;

//     2. Methods => drive(), stop(), accelerate(), reverse()

    public void drive(){
        System.out.println("This car is in drive mode");
    }

   public void stop(){
        System.out.println("This car is stopped");
   }

   public void accelerate(){
        System.out.println("This car is accelerating");
   }

   public void reverse(){
       System.out.println("This car is reversed");
   }

   public void driveBy(int miles){
       millage = millage + miles;
   }

   public void changeColor (String inputColor ){
        color = inputColor;
   }

   public static void updateDoors(int inputDoors){
        doors = inputDoors;
   }

   public int accelerateBy(){
       return 50;
   }

   public int accelerateByCertainSpeed(int inputSpeed){

        return inputSpeed;
   }

   // write a method which will return a car price.
    // write a method which will return a car model.
    // write a method which will return a car mfgYear.
    // write a method which will return a car doors.


}
