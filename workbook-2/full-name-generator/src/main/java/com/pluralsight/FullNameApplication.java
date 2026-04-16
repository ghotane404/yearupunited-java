package com.pluralsight;
import java.util.*;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name ");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();
        // removes any white space user enters before or after
        firstName = firstName.trim();
        middleName = middleName.trim();
        lastName = lastName.trim();
        suffix = suffix.trim();
        // after all the whitespace has been removed, will check to see if the string is empty or not
        if (!middleName.isEmpty()) {
            middleName = middleName + " "; // if string exists for middle name then will add the middle name with space
        }
        if (!suffix.isEmpty()) {
            suffix = " " + suffix; // if string exists for suffix then will add the suffix with space before
        }
        // prints the full name. Manually adding space between first and last name in case user doesn't have a middle name
        System.out.print("Full Name: " + firstName + " " + middleName + lastName + suffix);
    }
}