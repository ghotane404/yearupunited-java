package com.pluralsight;

import java.util.Objects;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;
    private int carYear;
    private double finalValue;
    private double carValue;

    private double LOW_AGE_DEPRECIATION_RATE = .03;
    private double MID_AGE_DEPRECIATION_RATE = .06;
    private double HIGH_AGE_DEPRECIATION_RATE = .08;
    private double OVER_TEN_YEARS_VALUE = 1000;
    private double HIGH_MILEAGE_PENALTY_RATE = .25;


    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getCarYear() {
        carYear = Integer.parseInt(getDataAcquired()) - year;
        return carYear;
    }

    @Override
    public double getValue() {
        if (Objects.equals(makeModel, "Honda") || Objects.equals(makeModel, "Toyota")) {
            if (0 <= getCarYear() && getCarYear() <= 3) {
                carValue = (1 - LOW_AGE_DEPRECIATION_RATE * getCarYear()) * getOriginalCost();
                return carValue;
            }
            else if (4 <= getCarYear() && getCarYear() <= 6) {
                carValue = (1 - MID_AGE_DEPRECIATION_RATE * getCarYear()) * getOriginalCost();
                return carValue;
            }
            else if (7 <= getCarYear() && getCarYear() <= 10) {
                carValue = (1 - HIGH_AGE_DEPRECIATION_RATE * getCarYear()) * getOriginalCost();
                return carValue;
            }
            else {
                return OVER_TEN_YEARS_VALUE;
            }
        }
        else {
            if (0 <= getCarYear() && getCarYear() <=3){
                if (odometer > 100000){
                    carValue = (1 - LOW_AGE_DEPRECIATION_RATE * getCarYear()) * getOriginalCost();
                    return (carValue * (1 - HIGH_MILEAGE_PENALTY_RATE));
                }
                else {
                    carValue = (1 - LOW_AGE_DEPRECIATION_RATE * getCarYear()) * getOriginalCost();
                    return carValue;
                }
            }
            else if (4 <= getCarYear() && getCarYear() <= 6) {
                if (odometer > 100000){
                    carValue = (1 - MID_AGE_DEPRECIATION_RATE * getCarYear()) * getOriginalCost();
                    return (carValue * (1 - HIGH_MILEAGE_PENALTY_RATE));
                }
                else {
                    carValue = (1 - MID_AGE_DEPRECIATION_RATE * getCarYear()) * getOriginalCost();
                    return carValue;
                }
            }
            else if (7 <= getCarYear() && getCarYear() <= 10) {
                if (odometer > 100000){
                    carValue = (1 - LOW_AGE_DEPRECIATION_RATE * getCarYear()) * getOriginalCost();
                    return (carValue * (1 - HIGH_MILEAGE_PENALTY_RATE));
                }
                else {
                    carValue = (1 - LOW_AGE_DEPRECIATION_RATE * getCarYear()) * getOriginalCost();
                    return carValue;
                }
            }
            else {
                if (odometer > 100000){
                    return (OVER_TEN_YEARS_VALUE * (1 - HIGH_MILEAGE_PENALTY_RATE));
                }
                else {
                    return OVER_TEN_YEARS_VALUE;
                }
            }
        }
    }
}