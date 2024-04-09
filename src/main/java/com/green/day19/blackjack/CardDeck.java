package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> list;
    public static final String[] PATTERNS = {"Spade", "Heart", "Diamond", "Club"};
    public static final int CARD_COUNT = 13;
    public static final int INIT_CAPACITY = 52;

    public CardDeck(){
        list = new ArrayList<Card>(INIT_CAPACITY);
        for (int i = 0; i < PATTERNS.length; i++) {
            for (int j = 1; j <= CARD_COUNT; j++) {
                String denomination = switch (j){
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> ""+j;
                };
                list.add(new Card(PATTERNS[i],denomination));
            }
        }
    }

    public void showCards(){
        for (Card c: list){
            System.out.println(c);
        }
    }
}

class CardDeckTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.showCards();
    }
}