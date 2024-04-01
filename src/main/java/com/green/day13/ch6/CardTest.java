package com.green.day13.ch6;

import java.util.Arrays;

public class CardTest {
    public static void main(String[] args) {
        //클로버, 하트, 스페이드, 다이아몬드
        //숫자 2~10 , AJQK

        Card[] cards = new Card[52];
        String[] shapes = {"Heart", "Diamond", "Clova", "Spade"};
        int idx = 0;
        for (int i = 0; i < shapes.length; i++) {
            for (int j = 1; j <= 13; j++, idx++) {
                cards[idx] = new Card();
                cards[idx].shape = shapes[i];
                cards[idx].number = switch (j) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> Integer.toString(j);
                };
            }
        }

        for (Card card : cards) {
            System.out.printf("%s\t%s\n", card.shape, card.number);
        }

    }
}
