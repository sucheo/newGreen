package com.green.java.ch07.cards;

public class Card {
    static final String[] KINDS = {"CLOVER", "HEART","DIAMOND","SPADE"};//카드 무늬
    static final int NUM_MAX = 13; //무늬별 ㅋㅏ드수

    String kind; //무늬
    String num; //번호

    //외부에서 무늬, 번호 값을 받아서 나의 멤버필드 무늬와 번호에 대입하는 생성자 만들기
    Card(String kind, String num){
        this.kind = kind;
        this.num = num;
    }

}