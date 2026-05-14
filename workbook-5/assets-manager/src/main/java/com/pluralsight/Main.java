package com.pluralsight;

import java.util.ArrayList;

public class Main {
    ArrayList<Asset> assets = new ArrayList<>();

    public static void main (String[] args){
        String myHouse;
        String vacationHouse;
        String car;
        double originalCost = 324000;
        String address = "123 Street";
        int condition = 2;
        int squareFoot = 1800;
        int lotSize = 5000;


//    Now, loop through the Asset collection displaying the description of each asset, the
//    date you acquired it, how much you paid for it, and its value.
        House house = new House("house",
                "May",
                originalCost,
                address,
                condition,
                squareFoot,
                lotSize);

        System.out.println(house.getValue());
//        Vehicle vehicle = new Vehicle();


//  house value = value per square foot  * square foot
// lot value = lotsize * 0.25
// house value + lot value















    }

}
