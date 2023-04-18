package com.green.java.ch04test;

import java.util.Scanner;

public class FlowEx5Test {
    public static void main(String[] args) {
        char grade = ' ';
        char opt = '0';
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세여");
        String input = sc.nextLine();
        int score = Integer.parseInt(input);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        }
         else if(score >=80) {
            grade = 'B';
            if (score >= 88) {
                grade = '+';
            } else if (score < 84) {
                opt = '-';
            }
        }
        System.out.printf("입력한 %s의 학점은 %c%c입니다.",score,grade,opt);
    }

}
