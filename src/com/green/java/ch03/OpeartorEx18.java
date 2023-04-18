package com.green.java.ch03;

public class OpeartorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0; //Math.round 메소드 호출 Math.round는 반올림하고 실수를 버린다.그래서 미리 3.141592에서 1000을 곱하고 나눠서 소수점을 남긴다.
                System.out.println(shortPi);
        System.out.println(Math.round(315.4));
        System.out.println(Math.round(315.5));//round는 숫자값에 따른 반올림
        System.out.println(Math.ceil(315.1)); //실수반올림 무조건올림
        System.out.println(Math.floor(315.9)); //실수반올림 무조건내림

    }
}
