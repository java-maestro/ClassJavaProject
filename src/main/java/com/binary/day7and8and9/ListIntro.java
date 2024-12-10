package com.binary.day7and8and9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;


public class ListIntro {

    public static void main(String[] args) {


//         List Implementation :
//         1. ArrayList
//         2. LinkedList
//         3. Vector
//         4. Stack

//        ArrayList<Datatype>  variableName = new ArrayList<>();
//        ArrayList<Datatype>  variableName = new ArrayList<Datatype>();

          ArrayList<Integer> numbers = new ArrayList<Integer>();
          numbers.add(12); // 0
          numbers.add(13); // 1
          numbers.add(14); // 2
          numbers.add(15);
          numbers.add(16);

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.indexOf(16));
        System.out.println(numbers.get(2));
        System.out.println(numbers.contains(25));

        System.out.println(numbers.size());
        numbers.add(200);
        System.out.println(numbers.size());

//         time complexity: big O
//          O(1)  O(N), O(logN)
//         space complexity
//                        N =6
//         1. Search an element based on Index: O(1)
//         2. Search an element without Index: O(N)
//         3. insert at end : O(1)
//         4. insert element at random position: O(N)
//         5. remove element at the end: O(1)
//         6. remove element at random position : O(N)

//         a Lot of shifting happening while doing the updates. so an array list is not suitable where there are more updates.
//         Data retrieving we will use ArrayList.
//        ---------------------------------------------------------------------------------------------------------------------------

//        LinkedList

//        Nodes
//        Each Node => data
//                  => next (contains the next element address)
//        Starting Node: HeadNode.

//         All Nodes can be accessible through head node only.

//        LinkedList<Datatype>  variableName = new LinkedList<>();
//        LinkedList<Datatype>  variableName = new LinkedList<Datatype>();

        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        System.out.println(names);
        names.add("dave");
        names.add("rose");
        names.add("wick");
        names.add("may");

      // time complexity

        //         1. search first Item :O(1)
         //        2. searching an element at random position:O(N)
//                 3. Inserting element at the end:O(N)
//                 4. Inserting element at random position: O(N)
//                 5. remove Last element : O(N)
//                 6. remove element at random position: O(N)


//         Linked List is used when there are more updates.

        System.out.println(names.get(2));
        System.out.println(names.indexOf("Bob"));
        System.out.println(names.getLast());
        System.out.println(names.getFirst());
        System.out.println(names.contains("r"));

//        ---------------------------------------------------------------------------------------------------------------------------
//         create arraylist to store names of different animals 5 elements
//         create a linked list to store different people heights => 5 elements

//         3. Vector
        //  is similar to array List
//         its synchronized -> Every operation, vector will lock the resource and unlock after the operation is done.
//         it's legacy datatype.

//        ---------------------------------------------------------------------------------------------------------------------------
//           4. Stack
//            its also implemented using Vector, so its synchronized
//            LIFO => Last In First Out.

//            pop() => remove the top Element
//            push()=> add element at the top of stack.
//            peek()=> value of Top element.

//        Stack<Datatype>  variableName = new Stack<>();
//        Stack<Datatype>  variableName = new Stack<Datatype>();

        Stack<String>  books = new Stack<>();
        books.push("The lord of rings");
        books.push("The Hobbit");
        books.push("The power of rings");


        System.out.println(books.peek());

            books.pop();

        System.out.println(books.peek());


//
//
//     ---------------------------------------------------------------------------------------------------------------------------

    }
}
