package com.pluralsight;

public class Vehicle extends Asset{
//    Properties: makeModel : String
//    year : int
//    odometer : int
    private String makeModel;
    private int year;
    private int odometer;
    private double something;

    public Vehicle(String description, String dataAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dataAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

//    Methods: constructor
//    all getters / setters
//    getValue() : double (override)

    public String getMakeModel(){
        return makeModel;
    }

    public void setMakeModel(String makeModel){
        this.makeModel = makeModel;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getOdometer(){
        return odometer;
    }

    public void setOdometer(int odometer){
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        return something;
    }

// A car's value is determined as
// 0-3 years old - 3% reduced value of cost per year
    // 0 < year <= 3
    // .3 * makeModel


// 4-6 years old - 6% reduced value of cost per year
    // 4 <= year <= 6


// 7-10 years old - 8% reduced value of cost per year
    // 7 <= year <= 10


// over 10 years old - $1000.00
    // year > 10


// MINUS reduce final value by 25% if over 100,000 miles
// unless makeModel contains word Honda or Toyota


}