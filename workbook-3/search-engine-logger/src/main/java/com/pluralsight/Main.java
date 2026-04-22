package com.pluralsight;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        searchTerm();       // calls the method that handles user input and logging
    }

//    b. Searching for a term
    public static void searchTerm() throws IOException {
        Scanner scanner = new Scanner(System.in);

        String logs = "logs.txt";
        FileWriter fileWriter = new FileWriter(logs, true);     // opens logs.txt in append mode so new user inputs can be added to the file
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);     // appends input one line at a time

        bufferedWriter.write(currentTime() + " launch");        // gets the current time from the method and prints launch
        bufferedWriter.newLine();       // starting a new line
        while(true)  {
            System.out.print("Enter a search term (X to exit): ");
            String userInput = scanner.nextLine();
            if(userInput.equals("X")){      // need to check if user enters X prior to avoid the X from being logged in the log.txt
                break;      // will exit the wild loop if user enters X
            }
            bufferedWriter.write(currentTime() + " search : " + userInput);     // gets the current time from the method and prints launch
            bufferedWriter.newLine();       // starting a new line
        }
        bufferedWriter.write(currentTime() + " exit");      // gets the current time from the method and prints exit
        bufferedWriter.newLine();       // starting a new line

        bufferedWriter.close();     // closes the writer and saves changes
    }

    public static String currentTime(){
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");      // formatting the date and time
        return today.format(formatTime);        // returns the formatted date and time
    }
}