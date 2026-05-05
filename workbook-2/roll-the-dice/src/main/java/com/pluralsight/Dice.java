package com.pluralsight;

public class Dice {
    public static void main (String[] args) {
        int roll1, roll2, sum;

        Dice dice = new Dice ();

        for(int i = 0; i < 100; i++){
           roll1 = dice.roll();
           roll2 = dice.roll();
        }

        System.out.println("Roll %d: %d - %d   Sum: %d", i, roll1, roll2, sum);
//        Roll 1: 4 - 6 Sum: 10
    }

    public static Dice roll(){
        int randomNumber = (int)(Math.random() * 6) + 1;
        return randomNumber;
    }

}
