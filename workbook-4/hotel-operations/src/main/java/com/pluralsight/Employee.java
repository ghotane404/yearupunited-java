package com.pluralsight;

public class Employee {
//    Employee
//    The Employee class is used to store and calculate payroll information about and employee. It should manage the following information using private variables:
//    employeeId, name, department, payRate, hoursWorked.

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    Employee (int employeeId, String name, String department, double payRate, double hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


//    Include the following derived getters (you may also include others as necessary):
//    getTotalPay
//    getRegularHours
//    getOvertimeHours

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

    public void getTotalPay() {

    }

    public void getRegularHours() {

    }

    public void getOvertimeHours() {

    }

}
