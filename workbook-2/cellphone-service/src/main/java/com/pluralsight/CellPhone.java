package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // this is a constructor- runs when a new CellPhone object is created
    // it receives the values passed from main()
    public CellPhone (int serialNumber,  String model, String carrier, String phoneNumber, String owner) {
        // this.serialNumber = the object’s field
        // serialNumber = the constructor parameter
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public int getSerialNumber() {    // getter for serialNumber
        return serialNumber;    // returns the serial number stored in the object
    }
    public void setSerialNumber(int serialNumber) { // setter for serialNumber
        this.serialNumber = serialNumber;   // stores the new serial number in the object
        // ex. cellPhone.setSerialNumber(1234);
        // 	replaces the old serial number with 1234
    }
    public String getModel() {  // getter for getModel
        return model;
    }
    public void setModel(String model) { // setter for setModel
        this.model = model;
    }
    public String getCarrier() {  // getter for getCarrier
        return carrier;
    }
    public void setCarrier(String carrier) { // setter for setCarrier
        this.carrier = carrier;
    }
    public String getPhoneNumber() {  // getter for getPhoneNumber
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) { // setter for setPhoneNumber
        this.phoneNumber = phoneNumber;
    }
    public String getOwner() {  // getter for getOwner
        return owner;
    }
    public void setOwner(String owner) { // setter for setOwner
        this.owner = owner;
    }
    // dial() method uses the value in phoneNumber as a parameter and displays the number the owner is cell phoning
    public void dial(String phoneNumber) {
        System.out.println(getOwner() + "'s phone is calling " + phoneNumber);
    }
}