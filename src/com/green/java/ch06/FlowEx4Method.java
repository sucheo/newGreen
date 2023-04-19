package com.green.java.ch06;

import java.util.Scanner;
class ScoreObj{
char getGrade(int score){
char grade;
    if(score >= 90) {
        return 'A';
    }
    else if (score >= 80){
        return 'B';
    }
    else if (score >= 70){
        return 'C';
    }
        return 'D';

    }
}

public class FlowEx4Method {
    public static void main(String[] args) {

        int score = 0;
        char grade = ' ';

        System.out.println("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        ScoreObj so = new ScoreObj();
        grade = so.getGrade(score);

        System.out.printf("%d점의 학점은 %c 입니다.", score, grade);
    }
    // 90점 보다 크거나 같으면 "%d 점의 학점은 A 입니다."
    // 80점보다 보다 크거나 같으면 B
    // 70점보다 보다 크거나 같으면 C
    // 나머지 D
}

