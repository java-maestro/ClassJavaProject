package com.binary.day7and8and9;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorIntro {

    public static void main(String[] args) {

        // it is used to read the data from all the collection implementation classes.
        //        we can read  and remove the data using the Iterator
        //          Methods :
//         hasNext(); // if next element is present, then it will return true
//         next(); // value of next element
//         remove(); remove the element;

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
           iterator.remove();
        }

        System.out.println(names);

    }
}
