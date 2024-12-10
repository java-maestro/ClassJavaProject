package com.binary.day7and8and9;


import java.util.*;

public class QueuesIntro {

    public static void main(String[] args) {


//        Queues
//        FIFO => First In First Out

//        ArrayList and LinkedList


//        enqueue()   -> insert an element
//        dequeue()  ->  delete an element
//        peek()     ->  return a value

//        ------- throws Exceptions                          returns a value
//                  add()                                       offer()
//                  remove()                                    poll()
//                 element()                                    peek()


        //Queues are usefull when a resources are shared with several consumers.
//        Queues are very important in CPU process schedules.
//        Threads are stored in Queues.

//        Queue<Datatype> variableName = new ArrayList<>();
//        Queue<Datatype> variableName = new LinkedList<>();

        Queue<String> namesQueue = new LinkedList<>();
        Queue<String> names = (Queue<String>) new ArrayList<String>();

        namesQueue.add("joy");
        namesQueue.add("foot");
        namesQueue.add("bob");
        namesQueue.offer("jim");
        namesQueue.offer("roy");

        System.out.println(namesQueue);

        namesQueue.remove();

        System.out.println(namesQueue);

        namesQueue.poll();

        System.out.println(namesQueue);

        System.out.println(namesQueue.peek());
        System.out.println(namesQueue.element());

// ----------------------------------------------------------------------------------------------------
        // Priority Queue
//        it will sort based on priority.
//        we will assign a priority values to every single item.
//        elements with high priority will serv before low priority elements.
// ----------------------------------------------------------------------------------------------------
        // Deque  => Double Ended Queues

//        Deque<Datatype>  variableName = new ArrayDeque<>();

//                   add()                                       offer()
//                  remove()                                    poll()
//                 element()                                    peek()
        // addFirst();
        // addLast();
        //removeFirst()
        //removeLast();
// ----------------------------------------------------------------------------------------------------

        Deque<String> stack = new ArrayDeque<>();

        /// Stack using arrayDeque is faster than normal stack data structure.
        // because stack is synchronized, it is extended from Vector; that is why array Deque (stack) is faster.
    }
}
