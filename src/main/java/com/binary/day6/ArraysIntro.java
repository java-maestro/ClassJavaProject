package com.binary.day6;

public class ArraysIntro {
    public static void main(String[] args) {


        // Arrays allow us to store multiple data.

//        how to create an Array ?
//
//        dataType[]  arrayVariableName = new dataType[size];
           int[]      numbers           = new  int[5];

           numbers[0] = 100;
           numbers[1] = 120;
           numbers[2] = 140;
           numbers[3] = 160;
           numbers[4] = 180;

           // by using loop, we will access each element.

        for(int index =0; index <numbers.length; index++  ){
            System.out.println("index at "+ index + " "+ numbers[index]);
        }


//         datatype[]  arrayVariableName = { elements };
            int[]      numbers2          =  {100,200,300,400}; // length = 8

//        System.out.println(numbers2[0]);
//        System.out.println(numbers2[1]);
//        System.out.println(numbers2[2]);
//        System.out.println(numbers2[3]);
//        System.out.println(numbers2[4]);
//        System.out.println(numbers2[5]);
//        System.out.println(numbers2[6]);
//        System.out.println(numbers2[7]);

        // 0,1,2,3,4,5,6,7

        for(int i =0; i< numbers2.length; i++){
            System.out.println(numbers2[i]);
        }

        // create a String array which stores 5 names and print those names.



    }
}
