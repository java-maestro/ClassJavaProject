package com.binary.day3and4and5.loan;

public class LoanApplication {

    private double loanAmount;
    private String name;
    private String ssn;
    private double income;
    private double expense;

    public LoanApplication(double loanAmount, String name, String ssn, double income, double expense) {
        this.expense = expense;
        this.loanAmount = loanAmount;
        this.name = name;
        this.ssn = ssn;
        this.income = income;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }



    public double calculateRate(){
        double rate1 = calculateRateVasedOnIncomeAndExpense(this.income, this.expense);
        double rate2 = calculateRateBasedOnCreditScore();
        double avgRate = (rate1+ rate2) /2;
        return avgRate;
    }


    private int getCreditScore(String SSN){
           // logic
        return  760;
    }

    private  double calculateRateVasedOnIncomeAndExpense(double income, double expense){
        // logic
        return 7.5;
    }

    private double calculateRateBasedOnCreditScore(){
         int creditscore = getCreditScore(this.ssn);

         // logic based creditscore
        return  5.5;
    }
}
