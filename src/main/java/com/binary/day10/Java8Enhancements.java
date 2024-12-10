package com.binary.day10;

import com.binary.day3and4and5.loan.LoanApplication;

import javax.sound.midi.Soundbank;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Enhancements {

    public static void main(String[] args) {

        // Lambda Expressions
//         Methods References
//         Functional Interfaces
//         Stream API
//         Default Methods
//         Static Methods in interfaces.
//         Date and time API
//         Optional class
//         Consumer Class
//         Predicate Class
//         Supplier Class

//          Functional Interfaces: if an Interface is having only one abstract method, we call it a functional Interface.
//          Lambda Expression => smilier to arrow function in javascript.
//          Lambda Expression =>  we represent "->" in java
//                (int x) -> x+1;
//                (int x){
//                  return x+2;
//                {
//     Streams :
//                 Methods References :    "::"
        List<String> mylist = Arrays.asList("Affenpinscher", "Affenpinscher","Afghan Hound", "Aidi", "Alano Español",
                "Alaskan Klee Kai", "Alaskan Malamute", "Bullenbeisser", "Bullmastiff", "Bully Kutta", "Burgos Pointer",
                "Cairn Terrier", "Canaan Dog", "Canadian Eskimo Dog", "Cane Corso", "Caucasian Shepherd Dog",
                "Istrian Shorthaired Hound","Istrian Shorthaired Hound", "Italian Greyhound", "Jack Russell Terrier", "Jagdterrier", "Jämthund",
                "Kai Ken", 	"Kai Ken",  "Kaikadi","Kaikadi", "Tweed Water Spaniel", "Tyrolean Hound", "Vizsla", "Volpino Italiano",
                "Weimaraner", "Welsh Sheepdog", "Welsh Springer Spaniel", "Welsh Terrier");

        Stream<String> myListStream =    mylist.stream();

        // Intermediate operations
//          filter
//          map
//         sorted
//        distinct

//         terminal operations
//         forEach
//         collect
//         reduce
//         count
                myListStream.filter(ele-> ele.startsWith("A"))
                            .map(ele->ele.toUpperCase())
                            .forEach(x-> System.out.println(x));

                mylist.stream().filter(ele->ele.startsWith("A"))
                                .map(String::toUpperCase)
                                .forEach(System.out::println);

        System.out.println(mylist);

        List<String> namesStartWithA = mylist.stream()
                                             .filter(ele->ele.startsWith("A"))
                                             .map(ele->ele.toUpperCase())
                                             .collect(Collectors.toList());

        System.out.println(namesStartWithA);

        List<String> namesStartWithA_old = new ArrayList<>();

        for(int i =0; i < mylist.size(); i++){
            if(mylist.get(i).startsWith("A")){
                String ele = mylist.get(i);
                namesStartWithA_old.add(ele.toUpperCase());
            }
        }

        System.out.println(namesStartWithA_old);


        // get the number of strings start with B;
        long count = mylist.stream()
                .filter(y -> y.startsWith("B"))
                .count();

        System.out.println(count);

        // create a String by JOINING (Each element) separated by space.

        String output = mylist.stream().reduce("This is List Strings with upper case:", (out, ele)-> out+" "+ ele);

        System.out.println(output);

        //   // Date and time API

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate anyDate = LocalDate.of(1997, 12, 10);

        System.out.println(anyDate);

        LocalDateTime dateandTime = LocalDateTime.now();
        System.out.println(dateandTime);
        LocalDateTime anyDateTime = LocalDateTime.of(1997, 12, 10, 0, 0, 0);

        System.out.println(anyDateTime);

        Duration duration = Duration.between(anyDateTime, dateandTime);

        System.out.println(duration.toDays());

//        Optional Class: represent optional values. (might present or might not)
//        optionalData.ifPresent();  // if present will work only if data is present
//        optionalData.orElse();     // to provide the default value;
//        optionalData.get();        // give you the data.

        Optional<String> optionalData = Optional.ofNullable(null);

        if(optionalData.isPresent()){
            System.out.println(optionalData.get());
        }

        if(optionalData.isEmpty()){
            System.out.println("data is empty");
        }

        //        Consumer Class: it takes an input, but it does not return any values.

        Consumer<String> printer = (str)-> System.out.println(str);

        printer.accept("HI Java");

        //        Supplier Class: it will not take any input, but it will provide the output.

        Supplier<LocalDate> dateSupplier = ()-> LocalDate.now();

        System.out.println(dateSupplier.get());

        //       Predicate Class: it takes an input, its does return a boolean values.

        Predicate<String> isWordstartsWithC = (input)->input.startsWith("C");

        mylist.stream().filter(isWordstartsWithC)
                       .map(String::toUpperCase)
                       .forEach(printer);





    }

}
