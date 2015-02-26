package com.company;

/**
 * Created by Admin on 2/25/2015.
 */
public class Card
{
    public enum Suit {Clubs, Hearts, Diamonds, Spades}
    public enum Value {Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace}

    private Suit suit;
    public Suit getSuit()
    {
        return this.suit;
    }
    public void setSuit(Suit suit)
    {
        this.suit = suit;
    }

    private Value value;
    public Value getValue()
    {
        return this.value;
    }
    public void setValue(Value value)
    {
        this.value = value;
    }

    public Card (Suit suit, Value value)
    {
        this.suit = suit;
        this.value = value;
    }
}
