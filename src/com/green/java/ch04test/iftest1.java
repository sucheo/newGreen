package com.green.java.ch04test;

import java.util.Scanner;

public class iftest1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("성적을 입력하세요\n");

        String test = sc.nextLine();
        int score = Integer.parseInt(test);
//int score = sc.nextInt();
        if(score>=90){
            System.out.println("성적은 A입니다.");
            System.out.printf("입력하신점수는 %d점 입니다.\n", score);
        }else if(score>=80){
            System.out.println("성적은 B+입니다.");
            System.out.printf("입력하신점수는 %d점 입니다.\n", score);
        }else if(score>=70){
            System.out.println("성적은 B입니다.");
            System.out.printf("입력하신점수는 %d점 입니다.\n", score);
        }else if(score>=60){
            System.out.println("성적은 C+입니다. ");
            System.out.printf("입력하신점수는 %d점 입니다.\n", score);
        }else {
            System.out.printf("입력하신점수는 %d점 입니다.\n", score);
            System.out.println("낙제입니다. 다시 시험에 응시하여주십시오. \n합격까지 부족한점수는 "+(60-score)+"점 입니다.\n");

        }

    }
}
