package com.pluralsight;
import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter the name of the file employee file to process: ");
//        String fileToRead = scanner.nextLine();
//
//        System.out.print("Enter the name of the payroll file to create: ");
//        String fileToCreate = scanner.nextLine();
//
//        if (fileToCreate.endsWith(".json")) {
//            createJsonFile(fileToRead, fileToCreate);
//        }
//        else{
//            createFile(fileToRead, fileToCreate);
//        }
        test();
    }

    public static void createFile(String fileToRead, String fileToCreate){
        try{
            FileReader fileReader = new FileReader(fileToRead);
            BufferedReader reader = new BufferedReader(fileReader);

            // Creates a FileWriter
            FileWriter fileWriter = new FileWriter(fileToCreate);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] cols = line.split("[|]");
                int employeeId = Integer.parseInt(cols[0]);
                double hoursWorked = Double.parseDouble(cols[2]);
                double payRate = Double.parseDouble(cols[3]);
                Employee employee = new Employee(employeeId, cols[1], hoursWorked, payRate);

                    bufferedWriter.write(employeeId + "|");
                    bufferedWriter.write(cols[1] + "|");
                    bufferedWriter.write(String.valueOf(employee.getGrossPay()));
                    bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (IOException e) {
            System.out.println("< insert generic error message >");
        }
    }

    // fix later
    public static void createJsonFile(String fileToRead, String fileToCreate){
        try{
            FileReader fileReader = new FileReader(fileToRead);
            BufferedReader reader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(fileToCreate);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;

            reader.readLine();

            bufferedWriter.write("[ ");
            bufferedWriter.newLine();

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] cols = line.split("[|]");
                int employeeId = Integer.parseInt(cols[0]);
                double hoursWorked = Double.parseDouble(cols[2]);
                double payRate = Double.parseDouble(cols[3]);
                Employee employee = new Employee(employeeId, cols[1], hoursWorked, payRate);

                bufferedWriter.write("{ ");
                bufferedWriter.write("\"id\": " + employeeId);
                bufferedWriter.write(", ");
                bufferedWriter.write("\"name\" : " + "\"" + cols[1] + " \"");
                bufferedWriter.write(", ");
                bufferedWriter.write("\"grossPay\" : " + employee.getGrossPay());
                bufferedWriter.write(" },");
                bufferedWriter.newLine();

            }
            bufferedWriter.newLine();
            bufferedWriter.write("]");
            bufferedWriter.close();
        }
        catch (IOException e) {
            System.out.println("< insert generic error message >");
        }
    }

    public static void test(){
        try{
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader reader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("test.json");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;

            //skip  headers
            reader.readLine();

            String[] lines = reader.readAllLines().toArray(new String[0]);
            for(int i = 0; i < lines.length; i++){

                if(i == 0){
                    bufferedWriter.write("[ \n");
                }

                String[] cols = lines[i].split("[|]");
                int employeeId = Integer.parseInt(cols[0]);
                double hoursWorked = Double.parseDouble(cols[2]);
                double payRate = Double.parseDouble(cols[3]);
                Employee employee = new Employee(employeeId, cols[1], hoursWorked, payRate);

                bufferedWriter.write("{ ");
                bufferedWriter.write("\"id\": " + employeeId);
                bufferedWriter.write(", ");
                bufferedWriter.write("\"name\" : " + "\"" + cols[1] + " \"");
                bufferedWriter.write(", ");
                bufferedWriter.write("\"grossPay\" : " + employee.getGrossPay());

                if(i == lines.length - 1){
                    bufferedWriter.write(" }\n]");
                }
                else{
                    bufferedWriter.write(" },");
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch (IOException e) {
            System.out.println("< insert generic error message >");
        }

    }

}