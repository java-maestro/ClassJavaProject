package com.binary.day3and4and5.loan;

public class HomeLoan extends ALoanApp{

    @Override
    public double calculateRate() {
       double rate1= getRateBasedOnLocation();
        double rate2= getRateBasedOnHome();
        double rate3= getRateBasedOnLoanTerm();
        return (rate1+rate2+rate3)/3;
    }

    private double getRateBasedOnLocation(){
       //logic
        return 4.5;
    }

    private double getRateBasedOnHome(){
        //logic
        return 3.2;
    }

    private double getRateBasedOnLoanTerm(){
        //logic
        return 2.5;
    }


}
