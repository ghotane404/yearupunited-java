package com.pluralsight;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    private static final double EXCELLENT = 180;
    private static final double GOOD = 130;
    private static final double FAIR = 90;
    private static final double POOR = 80;
    private static final double LOT_VALUE_PER_SQUARE_FOOT = .25;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        double value = switch (condition) {
            case 1 -> (EXCELLENT * squareFoot) + (LOT_VALUE_PER_SQUARE_FOOT * lotSize);
            case 2 -> (GOOD * squareFoot) + (LOT_VALUE_PER_SQUARE_FOOT * lotSize);
            case 3 -> (FAIR * squareFoot) + (LOT_VALUE_PER_SQUARE_FOOT + lotSize);
            case 4 -> (POOR * squareFoot) + (LOT_VALUE_PER_SQUARE_FOOT * lotSize);
            default -> 0;
        };
        return value;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getCondition(){
        return condition;
    }

    public void setCondition(int condition){
        this.condition = condition;
    }

    public int getSquareFoot(){
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot){
        this.squareFoot = squareFoot;
    }

    public int getLotSize(){
        return lotSize;
    }

    public void setLotSize(int lotSize){
        this.lotSize = lotSize;
    }
}