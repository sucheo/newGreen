package com.green.java.blackjack;

public class Dealer extends User{
private final int CAN_RECEIVE_POINT = 16;

    public boolean isReceiveCard() {
    return CAN_RECEIVE_POINT >= getPointSum();
    }
 }



