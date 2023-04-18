package com.green.java.ch05;


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
public class ArrayEx19 {
    public static void main(String[] args) {

        int sum = 0; // 합계
        int ave = 0; // 평균

      //  int[] sum_subject = {0,0,0};

        int sum_korean  = 0;
        int sum_math  = 0;
        int sum_eng  = 0;

        int[][] score = {
                  {100,90,80}
                , {20,20,20}
                , {30,30,30}
                , {40,40,40}

        };

        System.out.printf("번호\t\t국어\t영어\t수학\t총점\t평균\t\n");
        System.out.printf("\n ==================================\n");

        // 먼저
        for (int i = 0; i < score.length; i++) {
            sum = 0; // 합계
            ave = 0; // 평균

            System.out.printf("%d\t   ", i+1); // 번호출력
            // i > 번호당 점수 , 가로
            // j > 과목당 점수 , 세로
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%4d", score[i][j]); // 번호당 점수 출력
                sum += score[i][j];


                if(j==0){
                    sum_korean += score[i][j];
                }
                else if(j==1){
                    sum_math += score[i][j];
                }
                else if(j==2){
                    sum_eng += score[i][j];
                }

            }
            ave = sum / score[i].length;
            System.out.printf("%4d%4d \t \n",sum, ave);

        }
        System.out.printf("\n ==================================\n");
        System.out.printf("총점\n", sum);
        System.out.printf("국어: %d\n", sum_korean);
        System.out.printf("수학: %d\n", sum_math);
        System.out.printf("영어: %d\n", sum_eng);

    }
}
