package com.pluralsight;

public class Book {
    private int bookID;
    private String bookISBN;
    private String bookTitle;
    private boolean isCheckedOut;
    private String checkedOutTo;


    Book(int bookID, String bookISBN, String bookTitle) {
        this.bookID = bookID;
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    int getBookID(){
        return this.bookID;
    }

    String getBookISBN(){
        return this.bookISBN;
    }

    String getBookTitle(){
        return this.bookTitle;
    }


//    checkOut(name);
//    checkIn();



//    //        Show Checked Out books -
////        This displays a list of all the books that are currently checked out.
//    public static void checkOut(String name){
////        Display:
////        - the Id,
////        - ISBN
////        - Title
////        - Name of the person who has the book checked out.
//
//        //• When a book is checked out
////        o the books checkedOutTo variable should be set to the name provided
////        o the isCheckedOut variable should be set to true
//
//
////        Prompt the user:
////            o C - to Check In a book
////            o X - to go back to the home screen
//    }
//
//    //        Check In a book -
////        TThis displays a list of all the books that are currently checked out.
//    public static void checkIn(){
////        Prompt the user:
////        the ID of the book they want to check in.
////            o Check in the book with the specified id
////            o X - to go back to the home screen
//
//        //• When a book is checked in
////        o the books checkedOutTo variable should be set to ""
////        o the isCheckedOut variable should be set to false
//
//
//
//    }

}
