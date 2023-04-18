package com.green.java.ch04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = scan.nextInt();

        String grade = "D";

        //switch문 사용
        // 0-100 점만 입력된다는 전제로 작업
        // 예외처리 X
        // 90-100 A
        // 80-89 B
        // 79 - 70 C
        // 나머지 D

        switch (score/10){
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";


        }

        System.out.printf("%d점의 학점은 %s 입니다.", score, grade);

    }
}
