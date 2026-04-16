package com.pluralsight;


public class VariableApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        System.out.println("--------Step 1--------");
//      Step 1
//        Questions:
//        1. Declare a variable to store your favorite color
        String favoriteColor = "green";
//        2. Declare a variable to store the year you started this class
        int startYear = 2026;
//        3. Declare a variable to store your middle initial
        char middleInital = 'S';
//        4. Declare a variable to store whether you have pets (yes/no)
        boolean pets = true;
//        5. Declare a variable with a nice message or saying
        String message = "You are a cutie pie.";

            // then code solution
            // then use System.out.println() to display results
            // ex: System.out.println("The answer is " + answer);
        System.out.print("My favorite color is " + favoriteColor + ".\n");
        System.out.print("I started this class in " + startYear + ".\n");
        System.out.print("My middle initial is " + middleInital + ".\n");
        System.out.print("Do I have a pet? " + "That's " + pets + "!\n");
        System.out.println(message);


        System.out.println("\n\n--------Step 2--------");
//      Step 2
//        1. Declare AND initialize variables for:
//        2. The number of days in a week
        int DAYS_PER_WEEK = 7;
//        3. The price of coffee ($4.99)
        double price_of_coffee = 4.99;
        price_of_coffee = Math.round(price_of_coffee * 100.0)/100.0 ;
//        4. Your favorite letter
        char favoriteLetter = 'P';
//        5. Whether it's raining (true/false)
        boolean weatherRain = false;
//        6. Print all values in complete sentences

        System.out.print("There are " + DAYS_PER_WEEK + " days in a week.\n");
        System.out.print("The price of coffee is " + price_of_coffee + ".\n");
        System.out.print("My favorite letter in the alphabet is " + favoriteLetter + ".\n");
        System.out.print("Is it raining today? " + "Nah, that's " + weatherRain + ".\n");
    }
}