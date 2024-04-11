package com.green.day19.blackjack;

public class Dealer extends Gamer {
    private static final int CAN_RECEIVE_POINT = 16;

    public boolean isMoreReceiveCard() {
        int score = 0;
        for (Card card : cards) {
            score += card.getPoint();
        }
        return score <= CAN_RECEIVE_POINT;
    }
}