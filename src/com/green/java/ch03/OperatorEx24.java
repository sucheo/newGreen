package com.green.java.ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
        // && And 연산자
        // || or 연산자

        // And연산자는 거짓이 될 확률이 높은 항을 앞으로, OR연산자는 진실이 될 확률이 높은 항을 앞으로 두는 것이 퍼포먼스에 좋다

        boolean r1 = (2 > 1) && (3 > 2);
        System.out.println(r1);

        boolean r2 = (2 > 1) && (3 > 2) && (3 >=5);
        System.out.println(r2);

        boolean r3 = (2 > 1) || (3 > 2) || (3 >=5);
        System.out.println(r3);
    }
}
