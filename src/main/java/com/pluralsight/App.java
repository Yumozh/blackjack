package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final Scanner scan = new Scanner(System.in);
    private static ArrayList<Player> playersList = new ArrayList<>();

    public static void main(String[] args) {
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
        greetPlayer();

        //Ask number of players
        byte numberOfPlayers = 0;

        System.out.println("How many people are playing today? ");
        while(!(numberOfPlayers > 1) || !(numberOfPlayers < 7)) {
            if (scan.hasNextByte()) {
                numberOfPlayers = scan.nextByte();
                scan.nextLine();

                if (numberOfPlayers > 7 || numberOfPlayers < 1) {
                    System.out.println("Invalid entry. Please choose between 1 and 7.");
                }
            }
        }
        System.out.println("Great! You`ve got game for " + numberOfPlayers + " players today!");

        for(int i = 1; i <= numberOfPlayers; i++) {
            System.out.println("Enter a player #" + i + " name");
            String name = scan.nextLine();

            playersList.add(new Player(name));
        }
        System.out.println("All players are added now!");

        //Create a deck
        //Create a Game class
        Deck deck = new Deck();
        deck.shuffle();

        //deal card into hands
        for (int round = 0; round < 2; round++) {
            for (Player player : playersList) {
                Card card = deck.deal();
                player.getHand().deal(card);
            }
        }
        //Add dealer; make dealer a player
        Player dealer = new Player("Dealer");
        for (int i = 0; i < 2; i++) {
            Card card = deck.deal();
//            card.flip();
            dealer.getHand().deal(card);
        }

        //print all results
        for (Player player : playersList) {
            System.out.println(player.getName() + " hand value: " + player.getHand().getValue());
        }

        System.out.println("Dealer hand value: " + dealer.getHand().getValue());
        System.out.println("Cards left in deck: " + deck.getSize());

        int dealerValue = dealer.getHand().getValue();

        for (Player player : playersList) {
            int playerValue = player.getHand().getValue();

            System.out.println(player.getName() + " hand value: " + playerValue);

            if (playerValue > 21) {
                System.out.println(player.getName() + " busts. Dealer wins.");
            } else if (dealerValue > 21) {
                System.out.println("Dealer busts. " + player.getName() + " wins!");
            } else if (playerValue > dealerValue) {
                System.out.println(player.getName() + " wins!");
            } else if (playerValue < dealerValue) {
                System.out.println("Dealer wins against " + player.getName() + ".");
            } else {
                System.out.println(player.getName() + " ties with the dealer.");
            }

            System.out.println();
        }
    }
    static void dealHands(Deck deck){

        for (int i = 0; i < 2; i++) {
            for(Player player : playersList) {

            }
        }
    }

    private static void greetPlayer() {
        System.out.println("========================================");
        System.out.println("   Welcome to the PrizePicks Casino!    ");
        System.out.println("========================================");
        System.out.println("The game is Blackjack. Closest to 21 wins.");
        System.out.println("Note: We can accommodate 1 to 7 players.\n");
    }


    //addplayer list ot a game class, add deal and get them a hand and create a hand to each player;
    //Hands would be attached to my player object
    //start a game by dealing hand to each player
    //method to determ winner


}
