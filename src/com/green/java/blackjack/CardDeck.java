package com.green.java.blackjack;

import com.green.java.ch06.Car;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = {"♠","♣","♥","♦"};
    public static final int CARD_COUNT = 13;

    private List<Card> cardList;
    //List가 ArrayList,Linked(
    // )보다 상위임

    public CardDeck(){
    cardList = new ArrayList();
            for(String pattern : PATTERNS){
            for (int j = 1; j <= CARD_COUNT; j++) {
                cardList.add(new Card(pattern,getDenomination(j)));
                for (int i = 0; i < cardList.size(); i++) {


                }
                }
            }
        }

        private String getDenomination(int num){
        switch (num){
            case 1 : return "A";
            case 11 : return "J";
            case 12 : return "Q";
            case 13 : return "K";
            default:return String.valueOf(num);
        }
        }
    public Card getCard(){
        int rIdx = (int)(Math.random() * cardList.size());
        return cardList.remove(rIdx);
    }
    public void showSize() {
        System.out.println(cardList.size());
    }
}
