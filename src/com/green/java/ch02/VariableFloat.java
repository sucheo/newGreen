package com.green.java.ch02;

public class VariableFloat {
    public static void main(String[] arg) {
        float f1 = 10;
        System.out.println(f1);

        f1 = 9.77f;
        System.out.println(f1);
        f1 = (float)9.77;
        System.out.println(f1);


        long l1 = 100;
        float f2 = l1; // 자동형변환되어 오류 발생하지않음
        System.out.println(f2);


        double d1 = 9.77f;
        double d2 = 9.770;
        System.out.println(d1);
        System.out.println(d2);

        System.out.printf("%f, %f", d1, d2);


        /*
        정수형 : byte , short , int , long
        실수형 : float, double
        문자형 : char
        불린형 : boolean

        primitive type 원시 타입, 기본 타입
        나머지 대문자로 시작 reference type
         */

    }
}
