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
        //절차지향형식
        String[] titles = { "국어", "영어", "수학", "사회" };
        int[] titleSumArr = new int[titles.length];
        int[][] score = {
                { 100, 90, 80, 10 }
                , {  20, 20, 20, 20 }
                , {  30, 30, 30, 30 }
                , {  40, 40, 40, 40 }
        };
        System.out.print("번호\t");
        for(int i=0; i<titles.length; i++) {
            System.out.printf("%s\t", titles[i]);
        }
        System.out.println("총점\t평균");
        System.out.println("==============================");
        for(int i=0; i<score.length; i++) {
            int[] eachScore = score[i];
            int sum = 0;
            System.out.printf("%3d\t", i + 1);
            for(int z=0; z<eachScore.length; z++) {
                int jumsu = eachScore[z];
                //int jumsu = score[i][z];
                System.out.printf("%3d\t", jumsu);
                sum += jumsu;
                titleSumArr[z] += jumsu;
            }
            System.out.printf("%3d\t%4.1f\n", sum, ((double)sum / eachScore.length));
        }
        System.out.println("==============================");
        System.out.println("총점");
        for(int i=0; i<titles.length; i++) {
            System.out.printf("%s: %d\n", titles[i], titleSumArr[i]);
        }


        String str = "ab2d43";
        char[] charArr = str.toCharArray();
        System.out.printf("%c", charArr[1]);


    }
}