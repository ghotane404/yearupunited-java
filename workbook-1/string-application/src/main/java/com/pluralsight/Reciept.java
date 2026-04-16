package com.pluralsight;
import java.lang.Math.*;

public class Reciept {
    public static void main(String[] args) {

        //1. Create variables for an item name (String) and item price (double)
        String item = "'How to Learn Java in 2 Easy Steps!' books";
        double totalPrice;
        double itemPrice = 9499.99;

        //2. Create a quantity variable (int)
        int quantity = 32;

        //3. Build and print: EX. "You bought 3 apples for $7.10"
        totalPrice = itemPrice * quantity;
        totalPrice = (double) Math.round(totalPrice * 100) / 100;

        System.out.println("You bought " + quantity + " " + item + " for $" + String.format("%,.2f",totalPrice) + ".");
    }
}

