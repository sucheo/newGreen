package com.green.java.ch05;


/*
 score[0][0] = 100
 score[0][1] = 100
 score[0][0] = 100
 ...
 score[3][2] = 40

 sum=570
 */
public class ArrayEx18 {
    public static void main(String[] args) {

        int sum = 0;

        int[][] score = {
                  {100,100,100}
                , {20,20,20}
                , {30,30,30}
                , {40,40,40}

        };

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
                sum +=score[i][j];
            }
        }
        System.out.printf("sum=%d", sum);

    }
}
