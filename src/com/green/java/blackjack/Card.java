package com.green.java.blackjack;

import com.green.java.ch06.Car;

class Card {
    private String pattern;
    private String denomination;

    public Card(String pattern, String denomination) {
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
        return String.format("Card {%s,%s}",getPattern(),getDenomination());
    }

}
