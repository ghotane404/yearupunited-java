package com.pluralsight;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-".repeat(40));
            System.out.println("Pick one of the options.\n" +
                    "-".repeat(40) +
                    "\n1) Show Available Books \n" +
                    "2) Show Checked Out Books \n" +
                    "3) Exit \n");
            int userMenuSelection = scanner.nextInt();

            switch (userMenuSelection){
                case 1:     // Show Available Books
                    showAvailableBooks();
                    break;

                case 2:     // Show Checked Out Books
                    menuDisplay(true);
                    showCheckedOutBooks();
                    break;

                case 3:     // Exit - closes out of the application
                    System.out.println("\nThank you for visiting the Neighbourhood Library!\n");
                    return;
            }
        }
    }

    public static void checkInBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the book ID of the book to check in: ");
        int userBookID = scanner.nextInt();

        books[userBookID - 1].checkIn();
        System.out.printf("%nThank you. You have checked in the book %s. %n", books[userBookID - 1].getBookTitle());
    }

    public static void showCheckedOutBooks(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {
            if (books[i].getCheckOut()){
                System.out.printf("%-12s %-20s %-26s %-20s %n", books[i].getBookID(), books[i].getBookISBN(), books[i].getBookTitle(), books[i].getCheckOutName());
            }
        }
        System.out.println("-".repeat(40));
        System.out.println("What would you like to do? \n" +
                "-".repeat(40) +
                "\nC - to Check In a book \n" +
                "X - to go back to the home screen \n");
        String userMenuSelection = scanner.nextLine().toUpperCase();
        switch(userMenuSelection){
            case "C":
                checkInBook();
                break;
            case "X":
                break;
        }
    }

    public static void showAvailableBooks(){
        Scanner scanner = new Scanner(System.in);
        menuDisplay(false);

        for(int i = 0; i < books.length; i++){
            if (!books[i].getCheckOut()) {
                System.out.printf("%-12s %-20s %-20s %n", books[i].getBookID(), books[i].getBookISBN(), books[i].getBookTitle());
            }
        }
        System.out.println("-".repeat(40));
        System.out.println("What would you like to do? \n" +
                "-".repeat(40) +
                "\n1) Select book to check out \n" +
                "2) Exit to Home Screen \n");
        int userMenuSelection = scanner.nextInt();
        scanner.nextLine();

        switch(userMenuSelection){
            case 1:
                System.out.print("Please enter your name: ");
                String userName = scanner.nextLine();
                System.out.print("Please enter the book ID of the book you would like to check out: ");
                int userBookID = scanner.nextInt();
                books[userBookID - 1].checkOut(userName);
                System.out.printf("%nThank you, %s. You have checked out the book %s. %n", userName, books[userBookID - 1].getBookTitle());
                break;
            case 2:
                break;
        }
    }

    public static void menuDisplay(boolean revealFourthColumn){
        String formatBookID = "Book ID";
        String formatBookISBN = "Book ISBN";
        String formatBookTitle = "Book Title";
        String formatUserName = "Checked Out To";

        System.out.println("-".repeat(80));
        if (!revealFourthColumn){
            System.out.printf( "%-5s %15s %20s %n", formatBookID, formatBookISBN, formatBookTitle);
        }
        else{
            System.out.printf( "%-5s %15s %20s %30s %n", formatBookID, formatBookISBN, formatBookTitle, formatUserName);
        }
        System.out.println("-".repeat(80));
    }

    private static final Book[] books = {
            new Book(1, "9780063473423", "The Hobbit"),
            new Book(2, "9780441172719", "Dune"),
            new Book(3, "9780062420701", "To Kill a Mockingbird"),
            new Book(4, "9780358375401", "1984"),
            new Book(5, "9781700479181", "Pride and Prejudice"),
            new Book(6, "9781435171978", "The Great Gatsby"),
            new Book(7, "9781454959809", "Moby-Dick"),
            new Book(8, "9780316769532", "The Catcher in the Rye"),
            new Book(9, "9780008537760", "The Lord of the Rings"),
            new Book(10, "9781648338076", "Jane Eyre"),
            new Book(11, "9781784877750", "Brave New World"),
            new Book(12, "9780553382563", "I, Robot"),
            new Book(13, "9780452284241", "Animal Farm"),
            new Book(14, "9781339030609", "The Hunger Games"),
            new Book(15, "9781101934180", "The Book Thief"),
            new Book(16, "9781668218181", "Fahrenheit 451"),
            new Book(17, "9780063481305", "The Giver"),
            new Book(18, "9780063440159", "Charlotte's Web"),
            new Book(19, "9781435171701", "Little Women"),
            new Book(20, "9780140177398", "Of Mice and Men")
    };
}