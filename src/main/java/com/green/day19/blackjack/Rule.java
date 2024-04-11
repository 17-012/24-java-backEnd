package com.green.day19.blackjack;

public class Rule {
    static final int OVER = 21;

    void whoIsWinner(Gamer gamer, Dealer dealer) {
        int gamerPoint = point(gamer);
        int dealerPoint = point(dealer);


        System.out.println("========== 결과 ==========");

        System.out.println();
        System.out.println("System : 각자 카드를 오픈해 주세요");

        System.out.println("gamer : " + gamer.openCards());
        System.out.println("dealer : " + dealer.openCards());
        System.out.println();

        System.out.println("gamerPoint : " + gamerPoint);
        System.out.println("dealerPoint : " + dealerPoint);
        System.out.println();

        if (gamerPoint == dealerPoint || (gamerPoint > OVER && dealerPoint > OVER)) {
            System.out.println("System : 게임을 비겼습니다.");
        } else if ((gamerPoint > dealerPoint && gamerPoint <= OVER) || dealerPoint > OVER ) {
            System.out.println("System : 게이머가 이겼습니다.");
        } else {
            System.out.println("System : 딜러가 이겼습니다.");
        }
    }

    public int point(Gamer gamer) {
        int point = 0;
        for (int i = 0; i < gamer.cards.size(); i++) {
            point += gamer.cards.get(i).getPoint();
        }
        return point;
    }
}