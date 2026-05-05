package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    Room (int numberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
        this.isAvailable = true;
    }

    public int getNumberOfBeds(){
        return this.numberOfBeds;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean isOccupied(){
        return this.isOccupied;
    }

    public boolean isDirty() { return this.isDirty; }

    public boolean isAvailable(){
        if (!isDirty && is !isOccupied){
            return isAvailable;
        }
    }

    public void checkIn(){
        isDirty = true;
        isOccupied = true;
    }

    public void checkout(){
        isDirty = true;
        isOccupied = false;
    }

    public void cleanroom(){
        isDirty = false;
    }


}