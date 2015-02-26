package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deck deck = new Deck();
        Scanner input = new Scanner(System.in);
        Deck shuffledDeck = shuffleDeck(deck);
        ArrayList<Player> listOfPlayers = new ArrayList<Player>();
        System.out.print("How many players will be playing? ");
        int numOfPlayers = input.nextInt();
        int playerNumber = 1;
        String name;
        for (int i = 0; i < numOfPlayers; i++)
        {
            System.out.format("Enter player %d's name: ", playerNumber);
            name = input.next();
            listOfPlayers.add(new Player(name));
            playerNumber++;
        }
        dealCards(listOfPlayers, shuffledDeck);
        displayPlayerHands(listOfPlayers);
        displayCardsRemainingInDeck(shuffledDeck);
    }

    static Deck shuffleDeck(Deck deck)
    {
        Collections.shuffle(deck.getDeckOfCards());
        return deck;
    }

    static void displayPlayerHands(ArrayList<Player> listOfPlayers)
    {
        for (Player player : listOfPlayers)
        {
            System.out.println(player.getName());
            for (Card card : player.getCardsInHand())
            {
                System.out.format("%s of %s", card.getValue(), card.getSuit());
                System.out.println();
            }
            System.out.println();
        }
    }

    static void displayCardsRemainingInDeck(Deck deck)
    {
        System.out.println("CARDS REMAINING IN DECK");
        for (Card card : deck.getDeckOfCards())
        {
            System.out.format("%s of %s", card.getValue(), card.getSuit());
            System.out.println();
        }
    }

    static void dealCards(ArrayList<Player> listOfPlayers, Deck shuffledDeck)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 0; j < listOfPlayers.size(); j++)
            {
                listOfPlayers.get(j).setCardsInHand(shuffledDeck.getDeckOfCards().get(0));
                shuffledDeck.getDeckOfCards().remove(0);
            }
        }
    }
}
