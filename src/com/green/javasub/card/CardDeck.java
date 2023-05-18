package com.green.javasub.card;


import com.green.java.ch06.Car;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

   public final static String[] KINDS ={"space","heart","club","diamond"};
   private final static int MAX_NUMS = 13;
    private List<Card> cardList;


       public CardDeck() {
        cardList = new ArrayList<>();
        //무늬 spade,heart,club,diamond(4개)
        //번호 : A,2~10,J,Q,K(13개)
           for(String kind : KINDS){
               for(int i=1; i<MAX_NUMS; i++){
                   String num = getKind(i);
                   cardList.add(new Card(kind, num));
               }
           }
       }

    private String getKind(int n){
        switch (n){
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
           }
        return String.valueOf(n);
    }
    public void printAllCard(){
        for (Card c: cardList) {
            System.out.println(c);
        }

    }

    public List<Card> getCardList() {
        return cardList;
    }

    public Card pick(){
            int idx =(int)(Math.random()*cardList.size());
            return cardList.remove(idx);
    }
}
