package com.green.java.ch03;

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.1415926f;
        float shortpi = (int)(pi*1_000) / 1_000f;

        System.out.println(shortpi);
    }
}
