package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;
    public static final String[] PATTERNS = {"Spade", "Heart", "Diamond", "Club"};
    public static final int CARD_COUNT = 13;
    public static final int INIT_CAPACITY = 52;

    public CardDeck() {
        cards = new ArrayList<Card>(INIT_CAPACITY);
        for (String pattern : PATTERNS) {
            for (int j = 1; j <= CARD_COUNT; j++) {
                String denomination = switch (j) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> "" + j;
                };
                cards.add(new Card(pattern, denomination));
            }
        }
    }

    public Card draw() {
        int pick = (int) (Math.random() * cards.size());
        return cards.remove(pick);
    }
}