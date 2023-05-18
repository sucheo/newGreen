package com.green.javasub.card;

import java.util.Arrays;

public class CardTest {

    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        User u1 = new User();

        //랜덤한 카드객체 주소값 리턴,
        //리턴값 카드 객체 주소값은 cardList에서 삭제
        Card c1 = cd.pick();
        u1.recevieCard(c1);
        u1.recevieCard(cd.pick());
//        cd.printAllCard();

        //내가 가지고 있는 카드 점수
        //출력
        //점수 : 23 카드숫자가 점수
        u1.showTotalNum();

    }


}
