package com.pluralsight;

public class Reservation {
    // constants
    private final double KING_PRICE = 139.0;
    private final double DOUBLE_PRICE = 124.0;
    private final double WEEKEND_MULTIPLIER = 1.1;


    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;


    Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = true;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType(){
        return this.roomType;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public double getPrice(){
        return this.price;
    }

    public int getNumberOfNights(){
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend(){
        return this.isWeekend;
    }

    public void setIsWeekend(boolean isWeekend){
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal(){
        return this.reservationTotal;
    }

}
