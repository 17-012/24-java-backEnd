package com.green.day19.blackjack;

import java.util.Scanner;

public class Game {
    public static final int INIT_RECEIVE_CARD_COUNT = 2;

    public void play() {
        System.out.println("========== Black Jack ==========");
        System.out.println();

        CardDeck cardDeck = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();

        initPhase(cardDeck, gamer, dealer);
        playingPhase(cardDeck, gamer, dealer);
        rule.whoIsWinner(gamer, dealer);
        System.out.println();
        System.out.println("========== Black Jack 종료 ==========");
    }

    private void playingPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer) {
        Scanner scanner = new Scanner(System.in);
        String state;

        System.out.println();
        do {
            System.out.println("가진 카드 : " + gamer.openCards());
            System.out.println("System : 카드를 뽑겠습니까? (종료 : 0, 뽑기 : 1)");
            state = scanner.nextLine();
            if ("1".equals(state)) {
                gamer.receiveCard(cardDeck.draw());
            }
            else if("0".equals(state)){
                System.out.println("System : 카드를 그만 뽑습니다.");
                break;
            }
        } while (true);
        scanner.close();
    }

    private void initPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer) {
        System.out.printf("System : 처음 %d장의 카드를 각자 뽑겠습니다.\n", INIT_RECEIVE_CARD_COUNT);

        for (int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
            gamer.receiveCard(cardDeck.draw());
            dealer.receiveCard(cardDeck.draw());
        }

        while (dealer.isMoreReceiveCard()) {
            System.out.println("System : 딜러가 카드를 한장 더 뽑습니다.");
            dealer.receiveCard(cardDeck.draw());
        }
    }
}