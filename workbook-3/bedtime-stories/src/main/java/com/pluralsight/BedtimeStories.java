package com.pluralsight;
import java.io.*;
import java.util.*;

public class BedtimeStories {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of a story: ");
        String userInput = scanner.nextLine();

        try{
            // this will lock the file, so if the .txt cannot be deleted
            FileReader fileReader = new FileReader(userInput);      // saves the file name the user typed
            // Wrap the FileReader in a BufferedReader
            // BufferedReader makes it easier to read the file one line at a time
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line;    // holds each line of text as it's being read from the file
            int i = 1;      // used to add a line number to the beginning of each line
            // read the contents of the file until there is no more data
            while((line = bufReader.readLine()) != null) {
                // 2a) do something with what you read
                    System.out.print(i++ + ". ");
                    System.out.println(line);
            }
            // close the stream and release the resources
            bufReader.close();
        }
        catch(Exception ex){        // display stack trace if there was an error
            System.out.println("No such file, please try again.");
        }
    }
}