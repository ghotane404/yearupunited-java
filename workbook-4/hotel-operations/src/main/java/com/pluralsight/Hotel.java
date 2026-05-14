package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites = 10;
    private int numberOfRooms = 10;
    private int bookedSuites;
    private int bookedBasicRooms;
    private int availableSuite;
    private int availableRooms;
    private boolean isSuite;

    Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }


    Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }


//    public boolean bookRoom(int numberOfRooms, boolean isSuite){
//
//        if (numberOfRooms)
//
//        return isSuite;
//    }


    public int getNumberOfSuites(){
        return numberOfSuites;
    }


    public int getAvailableSuites(){

        return availableSuite - numberOfSuites;
    }


    public int getAvailableRooms(){

        return availableSuite - numberOfSuites;
    }

//    A user should be able to book one or more rooms (if they are available). The user will
//    specify how many rooms they would like, and if it is a suite or a basic room.
//    public boolean bookRoom(int numberOfRooms, boolean isSuite)

//    The bookRoom method should determine if there are enough rooms available and
//    update the booked inventory if they are. The method should return true/false
//    based on whether the rooms were able to be booked.

//    The class should also include getAvailableSuites and getAvailableRooms. These are derived getters that SHOULD NOT have a
//    private backing variable. Instead, these getters should calculate the response based on
//    other member variables.

}
