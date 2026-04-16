package com.pluralsight;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        String userName;
        float hoursWorked;
        float payRate;
        float grossPay, overTimePay;
        Scanner input = new Scanner(System.in);
//        Create a Java application named payroll-calculator that prompts the user to enter:
        System.out.println("What is your name?"); // − their name
        userName = input.nextLine();
        System.out.println("How many hours did you work?"); // − their hours worked (a floating point number)
        hoursWorked = input.nextFloat();
        overTimePay = OvertimePayRate(hoursWorked); // calling the OvertimePayRate method to determine if user qualifies for overtime and calculates it
        System.out.println("What is your hourly pay rate?"); // − their pay rate (a floating point number) Calculate their gross pay.
        payRate = input.nextFloat();

        grossPay = GrossPay(hoursWorked, payRate, overTimePay); // calling the GrossPay method to calculate total pay

        System.out.printf("Name: %s%nGross Pay: $%.2f%n", userName, grossPay); // Display the user's name and their gross pay.
    }
    // method used to calculate the gross pay
    public static float GrossPay(float hoursWorked, float payRate, float overTimePay) {
        float grossPay = 0;
        grossPay = hoursWorked * payRate + overTimePay;
        return grossPay;
    }
    // method used to calculate any overtime pay
    public static float OvertimePayRate(float hoursWorked) {
        float overTimeHoursWorked;
        float overTimePay = 0; // initialize it with 0 because if user doesn't qualify for overtime, the value 0 is returned
        final float OVERTIMEPAYRATE = 1.5f; // fixed value

        if (hoursWorked > 40){
            overTimeHoursWorked = hoursWorked - 40; // calculating how much overtime hours user worked
            overTimePay = OVERTIMEPAYRATE * overTimeHoursWorked; // calculates the overtime pay
        }
        return overTimePay; // if user isn't working more than 40 hours, then it will return the value 0
    }
}