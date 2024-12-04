package com.binary.day3and4and5.loan;

public class PersonalLoan extends  ALoanApp{



    private int getCreditScore(String SSN){
        // logic
        return  760;
    }

    private  double calculateRateVasedOnIncomeAndExpense(double income, double expense){
        // logic
        return 7.5;
    }

    private double calculateRateBasedOnCreditScore(){
        int creditscore = getCreditScore(this.getSsn());

        // logic based creditscore
        return  5.5;
    }

    @Override
    public double calculateRate() {
        double rate1 = calculateRateVasedOnIncomeAndExpense(this.getIncome(), this.getExpense());
        double rate2 = calculateRateBasedOnCreditScore();
        double avgRate = (rate1+ rate2) /2;
        return avgRate;
    }
}
