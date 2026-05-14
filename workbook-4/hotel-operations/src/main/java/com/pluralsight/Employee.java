package com.pluralsight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    // constants
    private final double REGULAR_HOURS = 40;
    private final double OVERTIME_PAY = 1.5;

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;
    private double regularHours;
    private double overTimeHours;
    private int punchIn;
    private int punchOut;
    private boolean employeeCheckIn;

    public Employee(double payRate, double hoursWorked){
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public Employee(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public Employee (int employeeId, String name, String department, double payRate, double hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.totalPay = totalPay;
        this.regularHours = regularHours;
        this.overTimeHours = overTimeHours;
    }

    public Employee(boolean employeeCheckIn){
        this.employeeCheckIn = employeeCheckIn;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }



    public double getPayRate() {
        return getRegularHours() * payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }



    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }



    public double getRegularHours() {
        if (hoursWorked > REGULAR_HOURS) {
            getOvertimeHours();
            return REGULAR_HOURS;
        }
        else{
            return hoursWorked;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > REGULAR_HOURS) {
            return hoursWorked - REGULAR_HOURS;
        }
        else {
            return 0;
        }
    }

    public double getRegularPay() {
        return getRegularHours() * payRate;
    }



    public double getOverTimePay() {
        return getOvertimeHours() * payRate * OVERTIME_PAY;
    }



    public double getTotalPay() {
        return getRegularPay() + getOverTimePay();
    }


    public void punchIn(int time){
        time = 10;


    }

    public void punchOut(int time){
        time = 14;

    }

    public String punchTimeCard (){
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println(currentTime.format(formatter));

        return currentTime.format(formatter);
    }


}
