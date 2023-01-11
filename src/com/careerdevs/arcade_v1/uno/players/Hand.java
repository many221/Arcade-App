package com.careerdevs.arcade_v1.uno.players;

import com.careerdevs.arcade_v1.uno.cards.Card;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards = new ArrayList<> ();

    private final Player player;

    public Hand (String playerName){
        Player playee = new Player (playerName);
        player = playee;
    }

    public void addCard(Card card){
        cards.add ( card );
    }

    public void showCards(){
        String cardsInHand = "";
        for (int i = 0; i < cards.size () ; i++) {
            cardsInHand += "{" + (i + 1) + ". " + cards.get ( i )+"} ";
        }
        System.out.println (cardsInHand);
    }

    public Card playCard(int index){
        Card card = cards.get (index);
        return card;
    }

    public void removeCard(Card card){
        cards.remove (card);
    }


    public String getPlayerName(){
        return player.getName ();
    }

    public int getHandSize(){
        return cards.size ();
    }

    public boolean isEmpty(){
        return cards.isEmpty ();
    }
}
