package com.green.java.ch02;

public class VariableNumber2 {
    public static void main(String[] args) {
        byte b1 = 127;
        // 127을 리터럴이라고 부른다
        // 리터럴 > (프로그래밍에서) 값 그 자체
        System.out.println(b1);

        int i1 = 128;
        int i2 = b1;
        b1 = (byte)i1; // 형변환

        int i3 = (byte)-129;
        System.out.println(i3);
    }
}
