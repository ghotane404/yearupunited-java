package com.pluralsight.models;

public class Game {
    public static void playGame(){
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Number of cards in deck: " + deck.getCardCount());

        Card card = deck.takeTopCard();
        System.out.println(card.getSuit() + " : " + card.getFaceValue());
        System.out.println("Number of cards in deck: " + deck.getCardCount());
    }

    public Player getWinner(){

    }



}