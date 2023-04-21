package com.green.java.ch07.cards;

import com.green.java.ch06.Car;

public class CardDeck{
    Card[] cards;//멤버필드

    CardDeck(){
    cards = new Card[52];

    for (int i = 0; i < cards.length; i++){
       cards[i] = new Card("","");
    }
    }
}