package com.pluralsight;
import java.util.*;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();

        fullName = fullName.trim(); // removing any white space from the full name
        splitAndPrintName(fullName); // calls the method splitAndPrintName where all the names are printed
    }

    public static void splitAndPrintName(String fullName){
        String[] fullNameArray = fullName.split("\\s+"); // splits the name wherever there is one or more spaces and stores each part in an array

        System.out.print("\nFirst Name: " + fullNameArray[0] + "\n"); // first name is always going to be the first index in an array so it prints that
        System.out.print("Middle Name: " );
        // when user has more than one middle name
        // it prints everything between the first and last name. i = 1 starts with index 1 of array, fullNameArray.length - 1 is before the last value in the array
        for (int i = 1; i < (fullNameArray.length - 1); i++){
            System.out.print(fullNameArray[i].trim() + " "); //
        }
        System.out.print("\nLast Name: " + fullNameArray[fullNameArray.length - 1]); // prints the last value in array, which is the last name
    }
}