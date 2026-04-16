package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {

        System.out.println(isEven(5));
        System.out.println(isPositive(5));

    }
    public static boolean isEven(int num) {
        boolean result = true;
        if (num % 2 == 0) {
            return result;
        }
        else{
            result = false;
            return result;
        }
    }

    public static boolean isPositive(double num) {
        boolean result = true;
        if (num > 0){
            return result;
        }
        else{
            result = false;
            return result;
        }
    }
}
