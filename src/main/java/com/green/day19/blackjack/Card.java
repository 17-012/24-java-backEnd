package com.green.day19.blackjack;

public class Card {
    private String pattern; // 무늬
    private String denomination; // 숫자

    public Card(final String pattern, final String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    @Override
    public String toString() {
        String result = String.format("%s\t%s", pattern, denomination);
        return result;
    }

    public int getPoint() {
        int score = switch (denomination) {
            case "A" -> 1;
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(denomination);
        };
        return score;
    }
}