package com.careerdevs.arcade_v1.uno.deck;

import com.careerdevs.arcade_v1.uno.cards.Card;
import com.careerdevs.arcade_v1.uno.players.Hand;

public interface Deck {

    public Card draw();

    public void deal(Hand hand , int num);
}
