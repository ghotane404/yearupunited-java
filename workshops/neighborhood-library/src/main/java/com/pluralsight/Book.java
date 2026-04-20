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

    public void checkOut(String name) {
        this.checkedOutTo = name;
        this.isCheckedOut = true;
    }
    public void checkIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }

    // getters
    public int getBookID() {
        return bookID;
    }
    public String getBookISBN() {
        return bookISBN;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public boolean getCheckOut() {
        return isCheckedOut;
    }
    public String getCheckOutName() {
        return checkedOutTo;
    }
}