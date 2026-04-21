package com.pluralsight;
import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args){
        String headerEmployeeID = "Employee ID";
        String headerEmployeeName = "Employee Name";
        String headerGrossPay = "Gross Pay";
        try{
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            reader.readLine();
            System.out.printf("%-15s %-20s %12s%n", headerEmployeeID, headerEmployeeName, headerGrossPay);
            while ((line = reader.readLine()) != null) {
                String[] cols = line.split("[|]");
                int employeeId = Integer.parseInt(cols[0]);
                double hoursWorked = Double.parseDouble(cols[2]);
                double payRate = Double.parseDouble(cols[3]);
                Employee employee = new Employee(employeeId,cols[1],hoursWorked,payRate);
                System.out.printf("%-15d %-20s %12s%n", employee.getEmployeeId(), employee.getName(), String.format("$ %.2f", employee.getGrossPay()));            }
        }
        catch (IOException e) {
            System.out.println("< insert generic error message >");
        }
    }
}