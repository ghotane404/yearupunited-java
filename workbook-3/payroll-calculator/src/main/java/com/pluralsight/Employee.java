package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private static double hoursWorked;
    private double payRate;

    Employee(int employeeId, String name, double hoursWorked, double payRate){
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    // getters
    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    public double getSetPayRate(){
        return payRate;
    }

    // setters
    public void setEmployeeId(int newEmployeeId){
        this.employeeId = newEmployeeId;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setHoursWorked(double newHoursWorked){
        this.hoursWorked = newHoursWorked;
    }
    public void setPayRate(double newSetPayRate){
        this.payRate = newSetPayRate;
    }

    public double getGrossPay(){
//        that calculates and returns that employee's gross pay based on their hours worked and pay rate
        return hoursWorked * payRate;
    }
}