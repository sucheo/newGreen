package com.green.ch09;

import java.util.ArrayList;

public class WrapperStudy1 {
    public static void main(String[] args) {
        //primtive type>
        //정수형 > byte, short, int, long
        //실수형 >float,double
        //문자형 >char
        //불린형 > boolean

//        List<int> list = new ArrayList(); 기본형안됨
        Integer i1 = 10;
        int i2 = 10;
        String s1 = Integer.toString(i2);
        String s2 = i1.toString();
        System.out.println(i1 ==i2);

        Byte b1 = 10;
        Short sh1 = 10;
        Long l1 = 10L;
        long l2 = 10;

        float f1 = 10;
        double d1 = 10;

        char c1 = 'a';
        boolean bl1 = true;


    }
}
