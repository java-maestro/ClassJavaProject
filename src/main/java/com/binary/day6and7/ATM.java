package com.binary.day6and7;

public class ATM {

    public void withdraw(int money) throws MinWithdrawAmountException {
        if(money < 100){
            // throw an exception
            throw new MinWithdrawAmountException("Min withdraw amount should not be less than 100");
        }

        System.out.println("money "+money);
    }
}
