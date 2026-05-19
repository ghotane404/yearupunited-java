package com.pluralsight;

import com.pluralsight.finance.*;

public class FinanceApplication {
	static void main(String[] args){
//		BankAccount account1 = new BankAccount("Pam", "123", 12500);
//		Valuable account2 = new BankAccount("Gary", "456", 1500);
		// try to deposit money into both accounts
//		account1.deposit(100);
//		account2.deposit(100);


		String name = "Name";
		String owner = "Owner";
		String accountNumber = "123";
		double balance = 200;
		double marketValue = 100;
		double weight = 200;
		int yearBuilt = 1900;
		int squareFeet = 100;
		int bedrooms = 1;


		Portfolio portfolio = new Portfolio(name, owner);

		BankAccount bankAccount = new BankAccount(name, accountNumber, balance);
		House house = new House(name, marketValue, yearBuilt, squareFeet,bedrooms);
		Gold gold = new Gold(name, marketValue,weight);
		portfolio.add(bankAccount);
		portfolio.add(house);
		portfolio.add(gold);

// after adding assets into the portfolio
		System.out.println("Total portfolio value: " + portfolio.getValue());
		System.out.println("Most valuable value: " + portfolio.getMostValuable().getValue());
		System.out.println("Least valuable value: " + portfolio.getLeastValuable().getValue());

	}
}
