package com.pluralsight.models;

public class Card {
    private Suits suit;
    private String faceValue;
    private int value;

    public Card(Suits suit, String faceValue){
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public Suits getSuit(){
        return suit;
    }

    public String getFaceValue(){
        return faceValue;
    }

    public String getColor(){
        switch (suit){
            case Suits.HEARTS, Suits.DIAMONDS -> {
                return "Red";
            }
            default -> {
                return "Black";
            }
        }
    }

    public int getPointValue(){
        return switch (faceValue) {
            case "A" -> 11;
            case "K", "Q", "J" -> 10;
            default -> Integer.parseInt(faceValue);
        };
    }
}