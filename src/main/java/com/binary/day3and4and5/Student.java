package com.binary.day3and4and5;

public class Student extends Person{
    private  char grade;
    private  double fee;

    public void setGrade(char grade) {
        this.grade = grade;
    }
    public char getGrade(){
        return grade;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return getName() +" "+ getGrade() +" "+ getFee();
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student student = (Student) obj;
            return student.getName() == this.getName() && student.getGrade() == this.getGrade() && student.getFee() == this.getFee();
        }

        return false;

    }


    // create a class
    // min 5 attributes
//         parameterized constructor
//         getters and setters
//         toString method
//         equals   method.


//    -----------------------------------------------------------------------------
    //   Product   -> id, name , price, rating  - > Abstract class
    //		             -> checkTotalSales() - > this is a normal method
    //    -----------------------------------------------------------------------------

    //   Laptop extends Product    -- > screenSize, RAM, SSD, processer
    //		                           -> checkCharging(),   checkLogin()

    //		             -> constructor
    //		             -> Override the default toString to print the Object
    //		                 with id, name , price,  screenSize, RAM, SSD, processer
    //                     -> Override the default equals to compare two Objects
    //		                 compression condition    id, ram, ssd, processor needs to be same to be equal

    //    -----------------------------------------------------------------------------
    //   Table extends Product  -- >    height, width, length
    //		             -> area method, volumn method
    //                   -> constructor
    //		             -> Override the default toString to print the Object
    //		                 with id, name , price,  height, width, length
    //                     -> Override the default equals to compare two Objects
    //		                 compression condition    id, length, height, width needs to be same to be equal

    //    -----------------------------------------------------------------------------
    //    Light extends Product   ->  wats, lumens
    //                   -> noOfAmps,  checkPowerUTil
    //                   -> constructor
    //                   -> Override the default toString to print the Object
    //		                 with id, name , price,  wats, lumens
    //                   -> Override the default equals to compare two Objects
    //		                 comparession condition    id, wats, lumens  needs to be same to be equal

    //    // create getters and setters -Product, Laptop,Table, Light

    // min two objects of each.

}
