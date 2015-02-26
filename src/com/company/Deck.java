package com.company;

import java.util.ArrayList;

/**
 * Created by Admin on 2/25/2015.
 */
public class Deck
{
    private ArrayList<Card> deckOfCards;
    public ArrayList<Card> getDeckOfCards()
    {
        return this.deckOfCards;
    }

    public Deck()
    {
        this.deckOfCards = new ArrayList<Card>();
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                this.deckOfCards.add(new Card(Card.Suit.values()[i], Card.Value.values()[j]));
            }
        }
    }
}
