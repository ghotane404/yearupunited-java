package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        int userSizeOption, userLoadedOption, userAge;
        double regularSandwichPrice = 5.45, largeSandwichPrice = 8.95;
        double regularLoadedPrice = 1.00, largeLoadedPrice = 1.75;
        double totalAmount = 0;

        Scanner input = new Scanner(System.in);
//        Step 1
//        Prompt the user for the size of the sandwich (1 or 2):
//        a. 1: Regular: base price $5.45
//        b. 2: Large: base price $8.95
        System.out.print("Which sandwich size would you like to purchase? (Select option 1 or 2)\n" +
                        "1: Regular: base price $5.45\n" +
                        "2: Large: base price $8.95\n");
        userSizeOption = input.nextInt();

//        Prompt the user if they would like the sandwich "loaded" (yes/no). If so there is an additional cost for a loaded sandwich
//        a. Regular: $1.00
//        b. Large: $1.75
        System.out.print("Would you like the sandwich loaded (Select option 1 or 2)\n" +
                "1: YES PLEASE!\n" +
                "\tRegular: +$1.00\n" +
                "\tLarge: +$1.75\n" +
                "2: No\n");
        userLoadedOption = input.nextInt();

//        Prompt the user for their age:
        System.out.print("What is your age? \n");
        userAge = input.nextInt();

        // checking what the sandwich size user selected
        if (userSizeOption == 1) { // if user selects regular sandwich size
            // calls the methods where the calculation for the regular sandwich price with or without loaded option is done
            // sends the value for (whether user wants loaded or not, price of sandwich, price of loaded) into the method
            // will get the calculated value back. The calculated value will be saved into the variable regularSandwichPrice
            regularSandwichPrice = loadedCalculation(userLoadedOption, regularSandwichPrice, regularLoadedPrice);
            // calls the methods where the calculation for the discount is done
            // will get the calculated value back. The calculated value will be saved into the variable totalAmount
            totalAmount = discountCalculation(userAge, regularSandwichPrice);
        }
        else if (userSizeOption == 2) { // if user selects large sandwich size
            // calls the methods where the calculation for the large sandwich price with or without loaded option is done
            // sends the value for (whether user wants loaded or not, price of sandwich, price of loaded) into the method
            // will get the calculated value back. The calculated value will be saved into the variable largeSandwichPrice
            largeSandwichPrice = loadedCalculation(userLoadedOption, largeSandwichPrice, largeLoadedPrice);
            // calls the methods where the calculation for the discount is done
            // will get the calculated value back. The calculated value will be saved into the variable totalAmount
            totalAmount = discountCalculation(userAge, largeSandwichPrice);
        }
        else{ // if user selects other options, program ends
            System.out.println("Sorry, invalid option");
            return;
        }
//        Display the cost of the sandwich to the screen $ %,.2f %n
        System.out.printf("The total cost of the sandwich is: $%,.2f%n" , totalAmount);
    }

    // method where the calculation is done based on whether the user wants the sandwich loaded or not.
    public static double loadedCalculation(int loadedOption, double sandwichPrice, double loadedPrice) {
        double totalAmount = 0;
        // if the user wants the sandwich loaded, calculates the total price of sandwich with loaded option
        if (loadedOption == 1) {
            // adds the laoded price and returns the calculated amount back
            totalAmount = sandwichPrice + loadedPrice;
            return totalAmount;
        }
        // if the user doesn't wants the sandwich loaded, just returns the normal sandwich price of whatever size
        else if (loadedOption == 2) {
            return sandwichPrice;
        }
        return sandwichPrice;
    }

    // method to calculate the discount of sandwich based on age
    public static double discountCalculation(int userAge, double sandwichPrice) {
        double discountKids = 1 - .10;
        double discountSenior = 1 - .20;
        double totalAmount = 0;
//        a. Student (17 years old or younger) – receive a 10% discount
        if (userAge <= 17) {
            // calculates the discount price and returns back
            totalAmount = discountKids * sandwichPrice;
            return totalAmount;
        }
//        b. Seniors (65 years old or older) – receive a 20% discount
        else if (userAge >= 65) {
            // calculates the discount price and returns back
            totalAmount = discountSenior * sandwichPrice;
            return totalAmount;
        }
        else {
            // if user doesn't fall within either of those age range, will just return the normal price of sandwich
            return sandwichPrice;
        }
    }
}