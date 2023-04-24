package com.green.java.ch07.cards;

import com.green.java.ch06.Car;

public class CardDeck {
    Card[] cards;//멤버필드
    int idx = 0;
    CardDeck() {
        cards = new Card[52];
        int idx = 0;
        for (int i = 0; i < Card.KINDS.length; i++) {
            for (int j = 1; j <= Card.NUM_MAX; j++) {
                String num = null;
                switch (j) {
                    case 1:
                        num = "A";
                    case 11:
                        num = "J";
                    case 12:
                        num = "Q";
                    case 13:
                        num = "K";
                    default:
                        num = String.valueOf(j);
                }
                cards[idx++] = new Card(Card.KINDS[i], num);
            }
        }
    }

    void openCards() {
        for (Card c : cards) {
            System.out.println(c);
            //System.out.println(c.kind + ", " + c.num);
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int rIdx = (int) (Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;
        }
    }


    Card pick() {

            Card temp = cards[idx];
            cards[idx++] = null;
            return temp;
        //cards[idx] = null;
        //return cards[idx++];
   }

}


