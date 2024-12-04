package com.binary.day3and4and5.loan;

public class Bank {
    public static void main(String[] args) {


        AutoLoan autoLoan = new AutoLoan();
        autoLoan.setLoanAmount(35000);
        HomeLoan homeLoan = new HomeLoan();
        homeLoan.setLoanAmount(800000);
        PersonalLoan personalLoan = new PersonalLoan();

        autoLoan.calculateRate();
        homeLoan.calculateRate();
        personalLoan.calculateRate();
        System.out.println(autoLoan.getLoanAmount());
        System.out.println(homeLoan.getLoanAmount());
    }
}
