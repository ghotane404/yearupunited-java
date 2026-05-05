package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;
    private double regularHours;
    private double overTimeHours;

    Employee (int employeeId, String name, String department, double payRate, double hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.totalPay = totalPay;
        this.regularHours = regularHours;
        this.overTimeHours = overTimeHours;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public double getTotalPay() {
        return this.totalPay;
    }

    public double getRegularHours() {
        return this.regularHours;
    }

    public double getOvertimeHours() {
        return this.overTimeHours;
    }

    public void punchIn(int time){
        int time = 10;
//        int time = 12;
//        int time = 14;
    }

    public void punchOut(int time){
//        int time = 10;
//        int time = 12;
        int time = 14;
    }

//    public void punchTimeCard (){
//
//    }

}
