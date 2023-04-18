package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', otp = '0';

        System.out.println("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        // 90점 보다 크거나 같으면 "%d 점의 학점은 A 입니다."
        // 80점보다 보다 크거나 같으면 B
        // 70점보다 보다 크거나 같으면 C
        // 나머지 D

        //1의 자리가 8점 이상이면 +
        //1의 자리가 4미만이면 - , 나머지는 0


        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        if (score > 70) {
            if (score == 100 || score % 10 >= 8) {
                otp = '+';
            } else if (score % 10 < 4) {
                otp = '-';
            }
            else {
                otp = ' ';
            }
        }
        else {
            otp = ' ';
        }
        System.out.printf("%d 점의 학점은 %c%c입니다.", score, grade, otp);
    }
}
