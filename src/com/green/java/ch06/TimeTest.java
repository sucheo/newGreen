package com.green.java.ch06;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t1 = new Time();
        //hour 1~23
        System.out.println("시간을 입력하세요.");
        int hour = sc.nextInt();
        System.out.println(t1.getHour());

        t1.setHour(hour);
        System.out.println(t1.getHour());
    }
}