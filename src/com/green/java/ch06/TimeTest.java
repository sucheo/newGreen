package com.green.java.ch06;

public class TimeTest {
    public static void main(String[] args) {
        //hour 1~23
        Time t1 = new Time();
        t1.setHour(-1);
        System.out.println(t1.getHour());
        t1.setHour(23);
        System.out.println(t1.getHour());
    }
}