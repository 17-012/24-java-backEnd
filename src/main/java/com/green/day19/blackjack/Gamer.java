package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    protected List<Card> cards;
    public static final int INIT_CAPACITY = 2;

    public Gamer() {
        cards = new ArrayList<Card>(INIT_CAPACITY);
    }

    public void receiveCard(Card card) {
        cards.add(card);
    }

    public List<Card> openCards() {
        return cards;
    }
}