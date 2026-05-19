package com.pluralsight.finance;

public class Gold extends FixedAsset {
    private double weight;

    public Gold (String name, double marketValue, double weight){
        super(name, marketValue);
        this.weight = weight;
    }

    public double getWeight(){
        return 0;       // calculate gold value here?
    }

    @Override
    public double getValue(){
//        return 100;
        return getMarketValue();
    }

}
