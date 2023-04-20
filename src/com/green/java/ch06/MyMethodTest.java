package com.green.java.ch06;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();//객체화
        mm.sum(10,20);//보이드 메소드 메소드 호출
        mm.sum(20,30);
        mm.sum(23,40);

        int result = mm.sum2(10,245); //리턴메소드 리턴을 쓰면 메소드 종료
        System.out.printf("result : " + result);
    }
}
