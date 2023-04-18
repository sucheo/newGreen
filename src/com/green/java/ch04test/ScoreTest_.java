package com.green.java.ch04test;

import java.util.Scanner;

public class ScoreTest_ {
    public static void main(String[] args) {
        System.out.println("성적을 입력하세요");
        char grade =' ';
        char opt = ' ';
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int score = Integer.parseInt(input);

        if(score >= 90){
            grade = 'A';
        }

        else if(score >= 80){
            grade = 'B';
        }

        else if(score >= 70){
            grade = 'C';
        }

        else if(score >=60){
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        if(score%10 > 7){
            opt = '+';
         if(score%10 <4){
                opt = '-';
            }
            }

        System.out.printf("당신이 입력한 점수는 %s이고 당신의 학점은 %c%c입니다.",score,grade,opt);
    }
}
