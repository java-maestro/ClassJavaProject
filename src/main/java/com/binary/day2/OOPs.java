package com.binary.day2;

public class OOPs {
    public static void main(String[] args) {

    // OOP => OBJECT ORIENTED PROGRAMMING
        // Main Components
        // 1. Class
        // 2. Object


        // Class => What is a class?
        // Class is a template or blueprint for creating objects.


        // Class => 1. Attributes => it will hold the data
//               => 2. Methods => modify the data or perform certain tasks/actions


        // Class                                 Object

        // Car                  =>             Toyota Camry, Mazda6, Volvo XC60, Lexus Rx350
//    1. Attributes => model, color, millage, doors, mfgYear, price
//    2. Methods => drive(), strop(), accelerate(), reverse(), driveBy(), accelerateBy(), accelerateByCertainSpeed();

        // Airplane           =>            Boeing 350, jet plan,
        // Fruit              =>            Orange, Apple, Bananas, Grapes
        // Candy              =>
        // Animal             =>

      // -----------------------------------------------

      // how to create a class ?

      // public class ClassName{
             // Attributes
             // Methods
      //}

        // how to create an Object using class
        // we will use a keyword called "new" to create an object using class.

        // ClassName objectName = new ClassName();

        //Toyota Camry
          Car    toyotaCamry = new Car();
          Car.doors = 4;
          toyotaCamry.color = "blue";
          toyotaCamry.mfgYear= 2024;
          toyotaCamry.millage= 10000;
          toyotaCamry.model ="Camry XLE";
          toyotaCamry.price = 40000.00;

        System.out.println(toyotaCamry.color);
        System.out.println(toyotaCamry.mfgYear);
        toyotaCamry.drive();

        Car    toyotaCamry2 = new Car();

        toyotaCamry2.color = "red";
        toyotaCamry2.mfgYear= 2023;
        toyotaCamry2.millage= 90000;
        toyotaCamry2.model ="Camry LE";
        toyotaCamry2.price = 20000.00;
        System.out.println(Car.doors);
        Car.updateDoors(2);


        System.out.println(toyotaCamry2.mfgYear);

        // Methods
        // how to create a simple method

        // public void methodName(){
            // coding
        //}

        // how to call a methods
//        objectRef.methodName();


        // how to create a method that accepts the input

        // public void methodName(datatype inputName){
        // coding
        //}
        System.out.println("before :"+ toyotaCamry2.millage);
        toyotaCamry2.driveBy(120);
        System.out.println("after :"+ toyotaCamry2.millage);

        System.out.println("before :"+toyotaCamry2.color);
        toyotaCamry2.changeColor("green");
        System.out.println("after : "+toyotaCamry2.color);

        // how to create a method that retuns a values

        // public dataTypeOfReturnValue methodName(){
        // coding
        //   return value;
        //}

        int currentSpeed = toyotaCamry2.accelerateBy();
        System.out.println(currentSpeed);

        currentSpeed = toyotaCamry.accelerateByCertainSpeed(65);
        System.out.println(currentSpeed);

    }

}
