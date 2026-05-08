package com.pluralsight;

public class Player {
    private String name;
    private Hand hand;
    private boolean isBusted;  //A flag to track if the player has gone over 21. This makes it easier to determine the winner at the end.
    private boolean isStaying;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public void receiveCard(Card card){
        
    }
}
