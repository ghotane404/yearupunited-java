package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine().trim(); // saves the user input as well as getting rid of any white space (shorting from String fullName = fullName.trim())
        LocalDate showDate = validDate(); // calls the method validDate for checking user input is valid
        System.out.println("How many tickets would you like? ");
        int ticketPurchased = scanner.nextInt();

        reservationConfirmation(fullName, showDate, ticketPurchased); // calling the method to print the reservation confirmation
    }
    // creating the method here for practicing Exception Handling
    // since this method is returning a LocalData value, need to specify the return type here
    public static LocalDate validDate() {
        LocalDate showDate;
        Scanner scanner = new Scanner(System.in);

        // a loop to keep repeating the action inside
        while(true){
            System.out.println("What date will you be coming (MM/dd/yyyy): ");
            String date = scanner.nextLine();
            // learning to use exception handling in case user doesn't use the correct format and breaks the code
            try{
                DateTimeFormatter matter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // for Java to know what data pattern to expect from input
                showDate = LocalDate.parse(date, matter); // Converting the string to LocalDate object
                break; // if user enters it correctly, then it will break out of the while loop
            }
            // if user enters an incorrect format, instead of just showing the error message and exiting the code, will instead display this and goes back to the beginning of while loop
            catch (DateTimeParseException e){
                System.out.println("Please use the format MM/dd/yyyy)!");
            }
        }
        return showDate; // returning the variable
    }
    // method to print everything
    public static void reservationConfirmation(String fullName, LocalDate showDate, int ticketPurchased) {
        String firstName, lastName, singularOrPlural;
        String[] fullNameArray = fullName.split("\\s"); // splitting the full name into parts using spaces

        firstName = fullNameArray[0]; // saving the first word in the array as first name
        lastName = fullNameArray[fullNameArray.length - 1]; // in case the user has crazy long name, just takes the last string from the array since that's the last name
        // if user is purchasing more than one ticket, then saves the plural of ticket to singularOrPlural variable
        // otherwise if it's less than 1, singular
        if (ticketPurchased > 1) {
            singularOrPlural = "tickets";
        }
        else {
          singularOrPlural = "ticket";
        }
        System.out.printf("\n%d %s reserved for %s under %s, %s.", ticketPurchased, singularOrPlural, showDate, lastName, firstName);
    }
}