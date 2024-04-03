package com.green.day14.ch7;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
//        deck.printAllCard();
//
//        Card c = deck.pick();
//        System.out.println(c);
//
//        Card c2 = deck.pick(5);
//        System.out.println(c2);
//
//        deck.shuffle();
//        deck.printAllCard();


    }
}

class Deck {
    final int CARD_NUM;
    Card[] cardArr;

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int rand = (int) (Math.random() * cardArr.length);
            if (i == rand) {
                continue;
            }
            Card c = cardArr[rand];
            cardArr[rand] = cardArr[i];
            cardArr[i] = c;
        }
    }

    public Card pick() {
        Card pickCard = pick((int) (Math.random() * cardArr.length));
        return pickCard;
    }

    public Card pick(int input) {
        Card pickCard = cardArr[input];
        return pickCard;
    }

    public Deck() {
        CARD_NUM = 52;
        cardArr = new Card[CARD_NUM];
        initCard();
    }

    void initCard() {
        String[] kind = {"heart", "spade", "diamond", "clova"};

        for (int i = 0, index = 0; i < kind.length; i++) {
            for (int j = 1; j <= 13; j++, index++) {
                String number = switch (j) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> Integer.toString(j);
                };
                cardArr[index] = new Card(kind[i], number);
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

    Card(String kind, String number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s", kind, number);
    }
}