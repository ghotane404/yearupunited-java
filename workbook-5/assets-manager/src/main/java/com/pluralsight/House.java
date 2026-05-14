package com.pluralsight;

public class House extends Asset{
//    Properties: address : String
//    condition : int (1 -excellent, 2 -good, 3 -fair, 4 -poor)
//    squareFoot : int
//    lotSize : int
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;
    private double something;
    final private double EXCELLENT = 180;
    final private double GOOD = 130;
    final private double FAIR = 90;
    final private double POOR = 80;
    final private double PLUS = .25;
    private double lotSizePrice;
    public double value;


    public House(String description, String dataAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dataAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }


//    Methods: constructor
//    all getters / setters
//    getValue() : double (override)

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

    @Override
    public double getValue(){
        // House Value: $324,000
        // Square Foot House: 1,800 sqft

        // Lot Size: 5000 sqft
        // 5000 sqft * $.25 = $1,250

        // Total: $324,000 + $1,250 = $325,250

        switch(condition){
            case 1:
                something = EXCELLENT * squareFoot;
                lotSizePrice = PLUS * lotSize;
                value = something + lotSizePrice;
                break;
            case 2:
                something = GOOD * squareFoot;
                lotSizePrice = PLUS * lotSize;
                value = something + lotSizePrice;
                break;
            case 3:
                something = FAIR * squareFoot;
                lotSizePrice = PLUS * lotSize;
                value = something + lotSizePrice;
                break;
            case 4:
                something = POOR * squareFoot;
                lotSizePrice = PLUS * lotSize;
                value = something + lotSizePrice;
                break;
        }
        return value;
    }


//  house value = value per square foot  * square foot
// lot value = lotsize * 0.25
// house value + lot value

// A house's value is determined as
// $180.00 per square foot (excellent)
//   value = 180
//   squarefoot = 1
//      if value > 180 = excellent

// $130.00 per square foot (good)
//   value = 130
//   squarefoot = 1
//      if value < 130 = good

// $90.00 per square foot (fair)
//   value = 90
//   squarefoot = 1
//      if value < 90 = good

// $80.00 per square foot (poor)
//   value = 80
//   squarefoot = 1
//      if value < 80 = poor

// PLUS 25 cents per square foot of lot size

}
