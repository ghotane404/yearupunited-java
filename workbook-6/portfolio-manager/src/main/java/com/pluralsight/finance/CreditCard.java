package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    CreditCard(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(double amount){

    }

    public void pay(double amount){

    }

    public double getValue(){
        return 0;
    }

}
