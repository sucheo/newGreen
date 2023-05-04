package com.green.java.blackjack;

import java.util.List;

public class Rule {
    private int gamerScore;
    private int dealerScore;
    int sum = 0;
final static int BLACKJACK_SCORE = 21;
    public static int getScore(List<Card> cardList) {
        int sum = 0;
        for (Card c : cardList) {
            sum += getDenominationToNum(c);
        }
        return sum;

    }

    private static int getDenominationToNum(Card c) {
        switch (c.getDenomination()) {
            case "A":
                return 1;
            case "J":
            case "Q":
            case "K":
                return 10;

            default:
                return Integer.parseInt(c.getDenomination());

        }
    }
    public static void whoIsWin(Gamer gamer, Dealer dealer) {
        int gPoint = gamer.getPointSum();
        int dPoint = dealer.getPointSum();

        if( gPoint <=BLACKJACK_SCORE && (gPoint > dPoint || dPoint > BLACKJACK_SCORE)){
            System.out.println("게이머승리");
        }else if (dPoint <= BLACKJACK_SCORE && (dPoint >gPoint || gPoint >BLACKJACK_SCORE)){
            System.out.println("딜러승리");
        }else {
            System.out.println("무승부");
        }
//        if (gamer.getPointSum()>21){
//            System.out.println("딜러승리");
//        }
//        else if(gamer.getPointSum()> dealer.getPointSum()){
//        System.out.println("게이머승리");
//    } else if(gamer.getPointSum() == dealer.getPointSum())   {
//        System.out.println("무승부입니다.");
//    }else if (gamer.getPointSum()>21 && dealer.getPointSum()>21){
//        System.out.println("무승부입니다.");
//    }else if (dealer.getPointSum()>21){
//        System.out.println("게이머 승리");
//    }
//    else {
//        System.out.println("딜러승리");
//    }
//    }
    }
}
