package com.green.java.blackjack;

import java.util.concurrent.Delayed;

public class BlackJackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer(); //게이머한테 카드한장주기
        Dealer dealer = new Dealer();
        Rule rule = new Rule();


        gamer.receiveCard(cd.getCard()); //A
        gamer.receiveCard(cd.getCard()); //5 6리턴



        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());

        int gamerScore = rule.getScore(gamer.openCards());
        int dealerScore = rule.getScore(gamer.openCards());


    }
}
