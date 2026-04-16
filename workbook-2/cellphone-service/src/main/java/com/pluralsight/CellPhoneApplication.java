package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter the following information for cell phone 1: ");
        CellPhone cellPhone1 = collectUserInput(scanner);   // sends Scanner into the collectUserInput() method so it can take user input and create a CellPhone object
        System.out.println("\nEnter the following information for cell phone 2 to make a test call: ");
        CellPhone cellPhone2 = collectUserInput(scanner);   // same as line 9 but for the 2nd cellphone

        System.out.println("\nStarting test call.....\n");   // displaying the message to start the test

        display(cellPhone1);    // displays the info from display method for cellphone1
        cellPhone1.dial(cellPhone2.getPhoneNumber());   // owner of cellphone1 calling cellphone2 number
        System.out.println("\n....\n");
        display(cellPhone2);    // displays the info from display() method for cellphone2
        cellPhone2.dial(cellPhone1.getPhoneNumber());   // owner of cellphone2 calling cellphone1 number

        System.out.println("\nCall successfully made! Goodbye!\n");     // once test completes, will exit code
//   printPhoneData(cellPhone1);   // method used for the first exercise
    }

    // display() method accepts one CellPhone object as a parameter
    public static void display(CellPhone phone) {
        // it prints some of the values stored inside that CellPhone object
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Owner Phone Number: " + phone.getPhoneNumber());
    }

    // collectUserInput() method collects user input to create one CellPhone object then returns CellPhone object back to main
    public static CellPhone collectUserInput(Scanner scanner){
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine(); // clears the extra newline after nextInt() otherwise next question will be skipped
        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        // creates a new CellPhone object and stores it in the variable cellPhone
        // sends all user input value to the constructor (used for exercise 1 so leaving it here)
        CellPhone cellPhone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);
        return cellPhone; // sends the CellPhone object back to where it was called
    }
    // This is the method used for Exercise 1.
    public static void printPhoneData(CellPhone cellPhone) {
        // cellPhone.getSerialNumber() means Java goes into that object, reads its serialNumber and returns the value
        System.out.println("\nWhat is the serial number? " + cellPhone.getSerialNumber());
        System.out.println("What model is the phone? " + cellPhone.getModel());
        System.out.println("Who is the carrier? " + cellPhone.getCarrier());
        System.out.println("What is the phone number? " + cellPhone.getPhoneNumber());
        System.out.println("Who is the owner of the phone? " + cellPhone.getOwner());
        System.out.println();
        // (side note for ME: kind of like SQL query with table name cellPhone and .getXYZ is the column in the table)
    }
}