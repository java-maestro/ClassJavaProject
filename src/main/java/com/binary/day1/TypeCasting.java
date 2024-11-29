package com.binary.day1;

public class TypeCasting {

    public static void main(String[] args) {


//        2 types of Type Casting : widening casting
//                                  narrowing casting


//         its assigning a value fo one primitive datatype to another data type.

//        widening casting
//        byte => short => char => int => long => float => double
//         automatically happens by java. no need to check.

//        narrowing casting
//        double => float => long => int => char => short => byte
//


//        widening casting

        byte a = 120;

        int b = a;
        System.out.println(b);
        short c = a;
        short d = 1000;

        int e = 12345678;
        double f = e;


//       narrowing casting

        int number1 = 150;
        System.out.println(number1);
        short number2 = (short) number1;

        System.out.println(number2);
        byte number3 = (byte) number2;

        float floatValue = 12.34567f;
        int intValue = (int) floatValue;

        System.out.println(number3);
        System.out.println(floatValue);
        System.out.println(intValue);


    }

}
