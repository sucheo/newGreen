package com.green.java.ch03;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.1415592;
        double shortpi = Math.round(pi*1000)/1000.0;    // 반올림
        System.out.println(shortpi);

        shortpi = Math.round(3156.2);
        System.out.println(shortpi);
        shortpi = Math.ceil(3156.2);            // 올림
        System.out.println(shortpi);
        shortpi = Math.floor(3156.2);           // 버림
        System.out.println(shortpi);
    }
}
