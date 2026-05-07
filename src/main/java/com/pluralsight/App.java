package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//        Deck deck = new Deck();
//        Hand hand1 = new Hand();
//        // deal 5 cards
//        for(int i = 0; i < 5; i++) {
//            // get a card from the deck
//            Card card = deck.deal();
//            // deal that card to the hand
//            hand1.deal(card);
//        }
//        int handValue = hand1.getValue();
//        System.out.println("This hand is worth " + handValue);
        System.out.println("========================================");
        System.out.println("   Welcome to the PrizePicks Casino!    ");
        System.out.println("========================================");
        System.out.println("The game is Blackjack. Closest to 21 wins.");
        System.out.println("Note: We can accommodate 1 to 7 players.\n");

        //Ask number of players
        Scanner scan = new Scanner(System.in);
        ArrayList<Player> playersList = new ArrayList<>();
        byte numberOfPlayers = 0;

        System.out.println("How many people are playing today? ");
        while(!(numberOfPlayers > 1) || !(numberOfPlayers < 7)) {
            if (scan.hasNextByte()) {
                numberOfPlayers = scan.nextByte();

                if (numberOfPlayers > 7 || numberOfPlayers < 1) {
                    System.out.println("Invalid entry. Please choose between 1 and 7.");
                }
            }
        }

        System.out.println("Great! You`ve got game for " + numberOfPlayers + " players today!");

    }

    //Ask for a number of players. Create a Player class. Add each player to array list. One String with all names with comma saparated
    //split into fields. Split method,
}
