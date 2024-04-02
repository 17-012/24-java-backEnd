package com.green.day14.ch7;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printAllCard();
    }
}

class Deck {
    final int CARD_NUM;
    Card[] cardArr;


    public Deck() {
        CARD_NUM = 52;
        cardArr = new Card[CARD_NUM];
        initCard();
    }

    void initCard() {
        String[] kind = {"heart", "spade", "diamond", "clova"};

        for (int i = 0, index = 0; i < kind.length; i++) {
            for (int j = 1; j <= 13; j++, index++) {
                cardArr[index] = new Card();
                cardArr[index].kind = kind[i];
                cardArr[index].number = switch (j) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> Integer.toString(j);
                };
            }
        }

    }

    void printAllCard() {
        for (Card c : cardArr) {
            System.out.println(c);
        }
    }

}

class Card {
    String kind;
    String number;

    @Override
    public String toString() {
        return String.format("%s\t%s", kind, number);
    }
}