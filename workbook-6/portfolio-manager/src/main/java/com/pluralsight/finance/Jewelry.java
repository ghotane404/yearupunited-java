package com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double marketValue, double karat){
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue(){
//        return 100;
        return karat;
    }

//    public double getKarat(){
//        return karat;
//    }

//    @Override
//    public Jewelry asset() {
//        return null;
//    }


}
