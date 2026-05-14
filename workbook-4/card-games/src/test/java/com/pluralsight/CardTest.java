package com.pluralsight;

import com.pluralsight.models.Card;
import com.pluralsight.models.Suits;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    public void getColor_shouldReturnColor(){
        // arrange
        Card card = new Card(Suits.SPADES, "Q");
        String expected = "Black";

        // act
        String actual = card.getColor();

        // assert
        assertEquals(expected, actual, "because I created a Queen of Spades");

    }

    @Test
    public void getPointValue_shouldCorrectValue(){
        // arrange
        HashMap<Card, Integer> cards = new HashMap<>();
        cards.put(new Card(Suits.SPADES, "Q"), 10);
        cards.put(new Card(Suits.SPADES, "K"), 10);
        cards.put(new Card(Suits.SPADES, "J"), 10);
        cards.put(new Card(Suits.SPADES, "A"), 11);
        cards.put(new Card(Suits.SPADES, "5"), 5);

//        Card card1 = new Card(Suits.SPADES, "Q");
//        String expected = "Black";
        for(Map.Entry<Card, Integer> row : cards.entrySet()){
            // act
            Card card = row.getKey();
            int actual = row.getKey().getPointValue();

            // assert
            assertEquals(row.getValue(), actual, "Becasue the card is a " + card.getFaceValue() + " of " + row.getValue());

        }
//
//        // act
//        int actual = card.getPointValue();
//
//        // assert
//        assertEquals(row.getValue(), actual, "because I created a Queen of Spades");

    }

}