package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String firstName = "Bob";
        String lastName = "Smith";
        String fullName;

        fullName = formatName(firstName,lastName);
        System.out.println(fullName);
    }

    static String formatName(String first, String last){
        String fullName;
        fullName = last + ", " + first;
        return fullName;
    }
}
