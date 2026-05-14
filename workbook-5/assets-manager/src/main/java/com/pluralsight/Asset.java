package com.pluralsight;
import java.util.*;

public class Asset {
//    Properties: description : String
//    dateAcquired : String
//    originalCost : double

    private String description;
    private String dataAcquired;
    private double originalCost;

//    Methods: constructor
//    all getters / setters
//    getValue() : double // returns original cost

    public Asset(String description, String dataAcquired, double originalCost){
        this.description = description;
        this.dataAcquired = dataAcquired;
        this.originalCost = originalCost;
    }

    public void getConstructor(){

    }

    public void setConstructor(){

    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDataAcquired(){
        return dataAcquired;
    }

    public void setDataAcquired(String dataAcquired){
        this.dataAcquired = dataAcquired;
    }

    public double getOriginalCost(){
        return originalCost;
    }

    public void setOriginalCost(double originalCost){
        this.originalCost = originalCost;
    }

    public double getValue(){
        return originalCost;
    }

}
