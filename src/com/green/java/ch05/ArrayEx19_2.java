package com.green.java.ch05;


import java.util.Arrays;

/*
     번호 국어 영어 수학 총점 평균

     =========================
     1   100   90  80  270
     2 ........................
     3
     4
     =========================
     총점
     국어:240
     영어:230
     수학:220
 */
public class ArrayEx19_2 {
    public static void main(String[] args) {

        int sum = 0; // 합계
        double ave = 0; // 평균

        int[] sum_subject = {0, 0, 0}; // 과목 총점
        String[] subject_name = {"국어", "영어", "수학"}; // 과목명

        int[][] score = {
                {100, 90, 80}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}

        };

        System.out.printf("번호\t\t국어\t영어\t수학\t총점\t평균\t\n");
        System.out.printf("\n ==================================\n");

        for (int i = 0; i < score.length; i++) {
            sum = 0; // 합계
            ave = 0; // 평균
            System.out.printf("%d\t   ", i + 1);          // 번호출력

            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%4d", score[i][j]);  // for 국영수 점수 출력

            }

            for (int j = 0; j < score[i].length; j++) { // for 점수 계산
                sum += score[i][j];
                if (j == 0) {                               // 과목 총점 계산
                    sum_subject[j] += score[i][j];
                } else if (j == 1) {
                    sum_subject[j] += score[i][j];
                } else if (j == 2) {
                    sum_subject[j] += score[i][j];


                }
                ave = sum / (double) score[i].length;
                System.out.printf("%4d %.1f \t \n", sum, ave);

                String str = "ab123cd";
                char[] a = str.toCharArray();

                System.out.printf("%c", a[3]);


            }
            System.out.printf("\n ==================================\n");
            System.out.printf("총점\n");

        //    for (int i = 0; i < subject_name.length; i++) { // 총점 출력
                System.out.printf("%s: %d\n", subject_name[i], sum_subject[i]);
            }
        }
    }

