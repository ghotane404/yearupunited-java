package com.pluralsight;
import java.util.*;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
//        The Store Home Screen -
//        • The home screen should display a list of options that a user can choose from.
            System.out.println("\n-----------------------------------------------------\n");
            System.out.println("Pick one of the options.\n" +
                    "1) Show Available Books \n" +
                    "2) Show Checked Out Books \n" +
                    "3) Exit \n");
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                ShowAvailableBooks();
            }
            else if (userInput == 2) {
               ShowCheckedOutBooks();
            }
            else{
                return;
            }
        }
    }

        private static void ShowCheckedOutBooks() {
            System.out.println("Book ID" + "    |    " + "Book ISBN" + "    |    " + "Book Title" +  "    |    "   +" Name" );

            for (int i = 0; i < books.length; i++) {
                if(books[i].isCheckedOut){
                    System.out.println(books[i].bookID + "        |    " + books[i].bookISBN + "    |    " + books[i].bookTitle + "    |    " + books[i].checkedOutTo);
                }
            }
        }

    private static final Book[] books = {
                new Book(1, "9780063473423", "The Hobbit"),
                new Book(2, "9781338878929", "Harry Potter and the Sorcerer's Stone"),
                new Book(3, "9780062420701", "To Kill a Mockingbird"),
                new Book(4, "9780358375401", "1984"),
                new Book(5, "9781700479181", "Pride and Prejudice"),
                new Book(6, "9781435171978", "The Great Gatsby"),
                new Book(7, "9781454959809", "Moby-Dick"),
                new Book(8, "9780316769532", "The Catcher in the Rye"),
                new Book(9, "9780008537760", "The Lord of the Rings"),
                new Book(10, "9781648338076", "Jane Eyre"),
                new Book(11, "9781784877750", "Brave New World"),
                new Book(12, "9780063451902", "The Chronicles of Narnia"),
                new Book(13, "9780452284241", "Animal Farm"),
                new Book(14, "9781339030609", "The Hunger Games"),
                new Book(15, "9781101934180", "The Book Thief"),
                new Book(16, "9781668218181", "Fahrenheit 451"),
                new Book(17, "9780063481305", "The Giver"),
                new Book(18, "9780063440159", "Charlotte's Web"),
                new Book(19, "9781435171701", "Little Women"),
                new Book(20, "9780140177398", "Of Mice and Men")
        };
//    • Show Available Books -
//      Displays a list of all books that are NOT currently checked out.
    public static void ShowAvailableBooks() {
        Scanner scanner = new Scanner(System.in);


//        System.out.println("The available list of books are: ");
        System.out.println("Book ID" + "    |    " + "Book ISBN" + "    |    " + "Book Title");

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].bookID + "        |    " + books[i].bookISBN + "    |    " + books[i].bookTitle);
        }

        System.out.println("What would you like to do? \n" +
                "1) Select book to check out \n" +
                "2) Exit to Home Screen \n");
        int userInput = scanner.nextInt();

        if (userInput == 1) {
            System.out.println("Select the Book ID you would like to check out");
            userInput = scanner.nextInt();
            System.out.println("Please enter your name: ");
            String userName = scanner.next();
            System.out.printf("\nThank you, %s. You have checked out the book %s.%n", userName, books[userInput - 1].bookTitle);

            books[userInput - 1].checkOut(userName);
        }
    }
}
