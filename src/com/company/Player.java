package com.company;

import java.util.ArrayList;

/**
 * Created by Admin on 2/26/2015.
 */
public class Player
{
    private ArrayList<Card> cardsInHand;
    public ArrayList<Card> getCardsInHand()
    {
        return this.cardsInHand;
    }
    public void setCardsInHand(Card card)
    {
        this.cardsInHand.add(card);
    }

    private String name;
    public String getName()
    {
        return this.name;
    }

    public Player(String name)
    {
        this.cardsInHand = new ArrayList<Card>();
        this.name = name;
    }
}
