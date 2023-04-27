package com.green.java.ch07.abstract2;

public class FighterTest {//abstract를 class 앞에쓰면 객체화가 된다. 무조건 자식이있을것이다.
    public static void main(String[] args) {
        Fightable f1 = new Fighter();
        Fightable f2 = new Fighter2();

        f1.sum(10,20);
        f1.move(1,3);

        f2.sum(10,20);
        f2.move(10,40);
    }
}
