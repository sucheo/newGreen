package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;

        double d = 10.2;
        Double d2 = d;

        System.out.println(b);
        System.out.println(d2);

        //generic 타입써서 Integer써서 정수값
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);           //오로지 정수값만 가능
        list.add(10);

        int n1 = list.get(0);
        System.out.println(list);



    }
}
