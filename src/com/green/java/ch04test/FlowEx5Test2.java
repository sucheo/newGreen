package com.green.java.ch04test;

import java.util.Scanner;

public class FlowEx5Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = 0;
        char opt = 0;
        int score = sc.nextInt();

        if(score >= 90){
            grade = 'A';
        }else if(score >=80){
            grade = 'B';
        }else if(score >=70){
            grade = 'C';
        }else {
            grade ='D';
        }

        if(score %2 == 0){


}
        System.out.printf("성적은%s이고 학점은%c%c이다.",score,grade,opt);
    }
}
