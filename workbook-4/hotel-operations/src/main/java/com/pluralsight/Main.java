package com.pluralsight;

public class Main {
    public static void main (String[] args){
//        double payRate = 2;
//        double hoursWorked = 45;
         int numberOfSuites = 2;
         int numberOfRooms = 4;
         int bookedSuites = 2;
        int bookedBasicRooms = 2;
        boolean employeeCheckIn = true;
         String name = "Gregor";


//        Employee employee = new Employee(payRate, hoursWorked);
//        Employee employee = new Employee(hoursWorked);
        Employee employee = new Employee(employeeCheckIn);

//        System.out.println(employee.getRegularHours());
//        System.out.println(employee.getOvertimeHours());
//        System.out.println(employee.getRegularPay());
//        System.out.println(employee.getOverTimePay());
//        System.out.println(employee.getTotalPay());
        System.out.println(employee.punchTimeCard());



//        Hotel hotel = new Hotel(name, numberOfSuites, numberOfRooms);
//        Hotel hotelRoomBooked = new Hotel( name,  numberOfSuites,  numberOfRooms,  bookedSuites,  bookedBasicRooms);


    }

}
