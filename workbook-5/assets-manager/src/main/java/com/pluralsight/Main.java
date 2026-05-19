package com.pluralsight;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        String myHouse;
        String vacationHouse;
        String car;
        double originalCostHouse = 324000;
        String address = "123 Street";
        int condition = 1;
        int squareFoot = 1800;
        int lotSize = 5000;

        // 8 years old, Toyota skips mileage penalty
        String description = "Car";
        String dateAcquired = "2026";
        double originalCostVehicle = 100000;
        String makeModel = "Toyota";
        int year = 2018;
        int odometer = 150000;
// Expected value: 36000.00

//    Now, loop through the Asset collection displaying the description of each asset, the
//    date you acquired it, how much you paid for it, and its value.
        ArrayList<Asset> assets = new ArrayList<>();





//        House house = new House("house", "May", originalCost, address,
//                condition, squareFoot, lotSize);
//        System.out.println(house.getValue());

        Vehicle vehicle = new Vehicle(description, dateAcquired, originalCostVehicle, makeModel, year, odometer);
        System.out.println("Vehicle Value: " + vehicle.getValue());
    }

}