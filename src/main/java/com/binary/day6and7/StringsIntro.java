package com.binary.day6and7;

public class StringsIntro {

    public static void main(String[] args) {

        // Java Memory

//        1. Heap Memory
//                -> Java Objects will be stored in heap memory, which is a portion of Java Memory
//                    dedicated to storing Objects and arrays.
//                -> Heap Memory is shared among all threads in JVM(Java virtual Machine).
//        2. Stack Memory
//                 -> Java uses stack memory to store local variables and method call information.
//                 -> Each Thread in JVM has its own stack, which is used for method calls and local variables.

//        String => they special memory location(string literal pool) in Heap Memory
//        String is a datatype that contains a collection of Characters.
//        String are Immutable -> Once a string object is created, its value cannot be changed.
//         when you modify a string -> it will actually create a new string.
//          String => final class
//                  implements =>  java.io.Serializable, Comparable<String>, CharSequence,
//                                Constable, ConstantDesc

        String s1 = "Hello Java";  // string literal pool
        String s2 = new String("Hello Java"); // Heap Memory
        String s3 = "Hello Java";  // string literal pool
        String s4 = new String("Hello Java");  // Heap Memory
        String s5 = "Hello Java";
        String s6 = "Hello Java";
        String s7 = "Hello Java";
        String s8 = "Hello Java";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s4);
        System.out.println("--------------------------------");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s4));

        s5 = "Hello " + "Java";
        s5 = "H";
//                    0123456789 (index)
        String s10 = "Hello Java";

        // location of e
        System.out.println(s10.indexOf('e'));

        // find char at location 7

        System.out.println(s10.charAt(7));
        // find "Java" is present in string or not
        System.out.println(s10.contains("Java"));

        String ad = "This is good movie, nice to placw to watch a movie";
        // find movie word in this ad or not.

        System.out.println(ad.contains("movie"));

        String name1 = "Jhon wick";
        String name2 = "rose miller";
        String name3 = "marry wick";

        // find these names belongs to wicks family or not

        System.out.println(name1.endsWith("wick"));
        System.out.println(name2.endsWith("wick"));
        System.out.println(name3.endsWith("wick"));

//                    012345678
        String id1 = "binary001";
        String id2 = "xyz002";
        String id3 = "binary003";
        String id4 = "binary004";

        System.out.println(id1.startsWith("binary"));
        System.out.println(id2.startsWith("binary"));

        System.out.println(id1.substring(0,6));
        System.out.println(id1.substring(6));



//       Mutable String Classes:
//         1. StringBuilder
//         2. StringBuffer
//               => these classes will allow you to modify the strings without creating new string objects each time.
//               => Both classes will provide similar functionality, but they differ in their thread safety.
//          1. StringBuilder
//                => its is not thread safe.
//                => which means it's not suitable to use in multithreaded evironments.
//                => however, it is more efficient than StringBuffer.

        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        sb.append("hello");
        sb.append(" ");
        sb.append("world");
        String normal = sb.toString();
        System.out.println(sb);
        String reverse = sb.reverse().toString();
        System.out.println(sb);

        //    2. StringBuffer
//                => its is thread safe.
//                => which means it's suitable to use in multithreaded evironments.
//                => however, it is less efficient than StringBuilder.




     }
}
