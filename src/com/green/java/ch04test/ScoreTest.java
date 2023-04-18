package com.green.java.ch04test;

import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args) {
        char grade = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력해주세요.");
        String input = sc.nextLine();
        int score = Integer.parseInt(input);

        if(score >=90){
            grade = 'A';
        }else if(score >= 80){
            grade = 'B';
        }else if(score >=70){
            grade = 'C';
        }else {
            grade = 'D';
        }
        System.out.printf("당신이 입력한 성적은 %d점이고 학점이 %c입니다.",score,grade);
    }
}
