package com.pluralsight;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float calculationResult = 0;
        String symbol; // declaring variable to store different math operations. for printing it later on

//        Enter the first number: 5
        System.out.print("Enter first number: ");
        float firstNumber = input.nextFloat();
//        Enter the second number: 12
        System.out.print("Enter second number: ");
        float secondNumber = input.nextFloat();

        System.out.print("\nPossible calculations: \n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n");

        System.out.print("Please select an option: ");
        String options = input.next();
        options = options.toUpperCase(); // converting userinput to uppercase letter

        // used switch to check which option the user selected
        switch (options) {
            // when user selected A
            case "A" -> {
                calculationResult = add(firstNumber, secondNumber); // calling method to add the two numbers
                symbol = "+"; // stores addition symbol. will print this to user later on
            }
            // when user selected S
            case "S" -> {
                calculationResult = subtract(firstNumber, secondNumber); // calling method to subtract the two numbers
                symbol = "-"; // stores subtraction symbol. will print this to user later on
            }
            // when user selected M
            case "M" -> {
                calculationResult = multiply(firstNumber, secondNumber); // calling method to multiply the two numbers
                symbol = "*"; // stores multiplication symbol. will print this to user later on
            }
            // when user selected D
            case "D" -> {
                calculationResult = divide(firstNumber, secondNumber); // calling method to divide the two numbers
                symbol = "/"; // stores division symbol. will print this to user later on
            }
            // when user enters option that's not listed
            default -> {
                System.out.println("Invalid option."); // displays to user option is invalid and exits program
                return;
            }
        }
        // displays the numbers input by user and the answer
        // %.2f used to display number in two decimal place
        // %s used to display the math operation symbol based on what operation user selected
        System.out.printf("\n%.2f %s %.2f = %.2f%n", firstNumber, symbol, secondNumber, calculationResult);
    }
    // all the methods used to calculate user input
    public static float add(float firstNumber, float secondNumber) {
        float calculationResult = 0;
        calculationResult = firstNumber + secondNumber;
        
        return calculationResult;
    }

    public static float subtract(float firstNumber, float secondNumber) {
        float calculationResult = 0;
        calculationResult = firstNumber - secondNumber;
        
        return calculationResult;
    }

    public static float multiply(float firstNumber, float secondNumber) {
        float calculationResult = 0;
        calculationResult = firstNumber * secondNumber;
        
        return calculationResult;
    }

    public static float divide(float firstNumber, float secondNumber) {
        float calculationResult = 0;
        calculationResult = firstNumber / secondNumber;
        
        return calculationResult;
    }
}