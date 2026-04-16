package com.pluralsight;
import static java.lang.Math.*;

public class MathApp {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
    }

    public static void question1() {
        // declaring variables here
        int bobSalary = 432123; // storing bob's salary in the variable
        int garySalary = 1233311; // storing gary's salary in the variable
        int highestSalary; // used to store the higher salary

        // then code solution
        highestSalary = Math.max(bobSalary, garySalary); // uses built-in method to compare the larger salary and stores in highestSalary

        // then use System.out.println() to display results
        System.out.println("Question 1:"); // displaying which question is being answered
        System.out.println("The highest salary is $" + String.format("%,d", highestSalary) + "\n"); // displaying the highest salary with commas for ease of readability and then adds new line
    }

    public static void question2() {
        // 2. Find and display the smallest of two variables named carPrice and truckPrice.
        // Set the variables to any value you want.

        // declare variables here
        double carPrice = 4999.99; // storing price of car in the variable
        double truckPrice = 43999.99; // storing price of truck in the variable
        double minimumPrice; // used to store the price of cheaper vehicle

        // then code solution
        minimumPrice = Math.min(carPrice, truckPrice); // uses built-in method to compare the cheaper vehicle price and stores it in minimumPrice

        // then use System.out.println() to display results
        System.out.println("Question 2:");
        System.out.println("The minimum price is $" + String.format("%,.2f", minimumPrice) + "\n"); // displays the cheaper price of vehicle with commas for ease of readability and then adds new line
    }

    public static void question3() {
        // 3. Find and display the area of a circle whose radius is 7.25

        // declare variables here
        double radiusCircle = 7.25; //storing the radius of a circle
        double areaCircle; // used to store the calculated area of circle
        String pi = "π"; // Using π notation here otherwise my math and physics prof will haunt me down for the calculation being off :(

        // then code solution
        areaCircle = radiusCircle * radiusCircle; // area of circle = πr^2, but calculating for just r^2
        areaCircle = Math.round (areaCircle * 100.0) / 100.0; // rounding the result to two decimal places
//        areaCircle = areaCircle * 3.14;

        // then use System.out.println() to display results
        System.out.println("Question 3:");
        System.out.println("The area of the circle with radius " + radiusCircle + " is " + areaCircle + pi + ".\n"); // displaying the calculated area with the π notation and then adds new line
    }

    public static void question4() {
        // 4. Find and display the square root a variable after it is set to 5.0

        // declare variables here
        double sqrt; // store the calculated sqrt of a number
        double num = 5.0; // storing the value of number to take the sqrt of

        // then code solution
        sqrt = Math.sqrt(num); // uses built-in method to calculate sqrt of number
        sqrt = Math.round(sqrt * 100.0) / 100.0; // rounding the result to two decimal places

        // then use System.out.println() to display results
        System.out.println("Question 4:");
        System.out.println("The square root of " + num + " is " + sqrt + ".\n"); // displaying the calculated results
    }

    public static void question5() {
        // 5. Find and display the distance between the points (5, 10) and (85, 50)

        // declare variables here
        int x1_Distance = 5; // storing the x coordinate of first point
        int y1_Distance = 10; // storing the y coordinate of first point
        int x2_Distance = 85; // storing the x coordinate of second point
        int y2_Distance = 50; // storing the y coordinate of second point
        int x_Distance; // store the calculated distance between 2 point in x-axis
        int y_Distance; // store the calculated distance between 2 point in y-axis
        double distance; // store the calculated distance between 2 points

        // then code solution
//        subtractExact(x, y)	Returns the result of x minus y
        x_Distance = subtractExact(x2_Distance,x1_Distance); // uses built-in method to calculate the distance between 2 point for x-axis
        y_Distance = subtractExact(y2_Distance,y1_Distance); // uses built-in method to calculate the distance between 2 point for y-axis

//        hypot(x, y)	Returns sqrt(x2 +y2) without intermediate overflow or underflow
        distance = hypot(x_Distance,y_Distance); // using built-in method to calculate the pythagoren theorem and store it in the variable
        distance = Math.round(distance * 100.0) / 100.0; // rounding the result to two decimal places

        // then use System.out.println() to display results
        System.out.println("Question 5:");
        System.out.println("The distance between point (" + x1_Distance + ", " + y1_Distance + ") and ("  + x2_Distance + ", " + y2_Distance + ") is " + distance + ".\n"); // displays the calculated distance between 2 points
    }

    public static void question6() {
        // 6. Find and display the absolute (positive) value of a variable after it is set to -3.8

        // declare variables here
        double num = -3.8; // storing the numerical value to find abs value
        double absValue; // store the result of abs value

        // then code solution
        absValue = Math.abs(num); // using built-in method to find the abs value of the number

        // then use System.out.println() to display results
        System.out.println("Question 6:");
        System.out.println("The absolute value of " + num + " is " + absValue + ".\n"); // displays the abs value
    }

    public static void question7() {
        // 7. Find and display a random number between 0 and 1

        // declare variables here
        double randomNumber; // stores the value of a number

        // then code solution
        randomNumber = Math.random(); // using built-in method to generate random decimal number between 0.0 and 1.0 and store it in the variable

        // then use System.out.println() to display results
        System.out.println("Question 7:");
        System.out.println("Random number between 0 and 1: " + randomNumber + "\n"); // displays the rand generated value
    }

    public static void question8() {
        // 8. Calculate how many minutes are in 24 days, use a variable for each value you calculate with.
        // BONUS: How many milliseconds?

        // declare variables here
        int HOURS = 24; // storing the number of hours in 1 day
        int MINUTES = 60; // storing the number of minutes in 1 hour
        int SECONDS = 60; // storing the number of seconds in 1 minute
        int MILLISECONDS = 1000; // storing the number of milliseconds in 1 seconds
        int days = 24; // storing the day for calculation
        int totalMinutes; // store the calculated total minutes
        int totalMilliseconds; // store the calculated total milliseconds

        // then code solution
        totalMinutes = days * HOURS * MINUTES; // calculating the total hours of given days then total minutes of those hours
        totalMilliseconds = days * HOURS * MINUTES * SECONDS * MILLISECONDS; // calculating the total hours of given days then total minutes of those hours then total seconds of those minutes then total milliseconds of those seconds

        // then use System.out.println() to display results
        System.out.println("Question 8:");
        System.out.println("There are " + String.format("%,d", totalMinutes) + " minutes in " + days + " days."); // displays the total minutes of given days
        System.out.println("There are " + String.format("%,d", totalMilliseconds) + " milliseconds in " + days + " days.\n"); // displays the total milliseconds of given days
    }
}