package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
//        The Store Home Screen -
//        • The home screen should display a list of options that a user can choose from.
            System.out.println("Pick one of the options.\n" +
                    "1) Show Available Books \n" +
                    "2) Show Checked Out Books \n" +
                    "3) Exit \n");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    break;
                case 2:
                    System.out.println("Check Books Out");
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
            }

        }
    }

//    • Show Available Books -
//      Displays a list of all books that are NOT currently checked out.
    public static void getAvailableBooks () {
        System.out.println("The available list of books are: ");


        System.out.println("What would you like to do? \n" +
                "1) Select book to check out \n" +
                "2) Exit to Home Screen \n");

    }
}
