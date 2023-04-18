package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy3 {
    public static void main(String[] args) {
        final int WOMAN_STAND = 158;
        final int MAN_STAND = 171;

        Scanner scan = new Scanner(System.in);
        System.out.print("성별 입력 (w, m) : ");
        String gender = scan.nextLine();

        System.out.print("키 입력 : \n");
        int height = scan.nextInt();

        //m, 171> 평균
        //m, 172> 평균 초과
        //m, 170이하값 > 평균 미만

        //w, 158> 평균
        //w, 158 초과값 > 평균 초과
        //w, 158 이하값 > 평균 미만

        if (gender.equals("w")) {
            if (height == WOMAN_STAND) {
                System.out.println("평균입니다");
            } else if (height > WOMAN_STAND) {
                System.out.println("평균 초과입니다");
            } else if (height < WOMAN_STAND) {
                System.out.println("평균 미만입니다");
            }
        }
        else if (gender.equals("m")) {
            if (height == MAN_STAND) {
                System.out.println("평균입니다");
            } else if (height > MAN_STAND) {
                System.out.println("평균 초과입니다");
            } else if (height < MAN_STAND) {
                System.out.println("평균 미만입니다");
            }
        }
    }
}