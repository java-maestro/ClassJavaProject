package com.binary.day3;

public class BankAccount {
    private  String name;
    private double balance;
    private int accountNumber;
    private  int ssn;
    private String passowrd;
    private  boolean login;


    public BankAccount(int accountNumber, String passowrd){
        this.accountNumber = accountNumber;
        this.passowrd = passowrd;
    }

    public void setName(String name){
          this.name = name;
    }
    public String getName(){
      if(login){
          return name;
      }else {
          System.out.println(" you are not authorized");
          return null;
      }
    }
    public double getBalance(){
      if(login){
          return balance;
      }else {
          System.out.println(" you are not authorized");
          return 0;
      }
    }
    public int getAccountNumber(){
        if(login){
            return accountNumber;
        }else {
            System.out.println(" you are not authorized");
            return 0;
        }
    }
    public int getSsn(){
        if(login){
            return ssn;
        }else {
            System.out.println(" you are not authorized");
            return 0;
        }
    }

    public void setBalance(double balance){
        if(login){
            this.balance = balance;
        }else {
            System.out.println(" you are not authorized");
        }
    }

    public void setSsn(int ssn){
        if(login){
            this.ssn = ssn;
        }else {
            System.out.println(" you are not authorized");
        }
    }
    public void updatePassword(String oldPassword, String newPassword){
        if(login){
            if(oldPassword.equals(this.passowrd)){
                this.passowrd = newPassword;
                System.out.println(" you have successfully updated new password");
            } else{
                System.out.println(" your old password is incorrect");
            }
        }else{
            System.out.println(" you are not authorized");
        }
    }
    public void login(){
        this.login = true;
    }

    public void logout(){
        this.login = false;
    }


}
