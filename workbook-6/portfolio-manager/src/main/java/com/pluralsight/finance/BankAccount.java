package com.pluralsight.finance;

public class BankAccount implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    BankAccount(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){

    }

    public void withdraw(double amount){

    }

    public double getValue(){
        return 0;
    }

}
