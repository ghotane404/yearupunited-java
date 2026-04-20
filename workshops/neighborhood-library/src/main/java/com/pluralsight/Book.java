package com.pluralsight;

public class Book {
    int bookID;
    String bookISBN;
    String bookTitle;
    boolean isCheckedOut;
    String checkedOutTo;

    Book(int bookID, String bookISBN, String bookTitle) {
        this.bookID = bookID;
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // getter that returns
    public int getBookID(){
        return bookID;
    }
    public String getBookISBN(){
        return bookISBN;
    }
    public String getBookTitle(){
        return bookTitle;
    }

    // setters that sets
    public void setBookID(int bookID){
        this.bookID = bookID;
    }
    public void setBookISBN(String bookISBN){
        this.bookISBN = bookISBN;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public void checkOut(String name){
        isCheckedOut = true;
        checkedOutTo = name;
    }
    public void checkIn(){
        isCheckedOut = false;
        checkedOutTo = "";
    }
}

