package com.binary.day3;


public class FourPillersOfJava {
    public static void main(String[] args) {

//    1. Encapsulation
//    2. Inheritance
//    3. Polymorphism
//    4. Abstraction


//        1. Encapsulation
//         is to make  sure that "sensitive Data" is hidden from the users.
//          1. declare class variables/attributes as private
//          2. we will create a set or get methods to access or update the values of attributes.

        BankAccount account1 = new BankAccount(12345678,"1234" );
        account1.login();
        account1.setBalance(100);
        account1.setSsn(52812368);
        account1.setName("Jhon");
        account1.logout();

        account1.login();
        System.out.println(account1.getBalance());







    }
}
